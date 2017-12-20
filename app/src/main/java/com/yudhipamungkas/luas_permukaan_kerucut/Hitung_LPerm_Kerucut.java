package com.yudhipamungkas.luas_permukaan_kerucut;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Hitung_LPerm_Kerucut extends AppCompatActivity {
         EditText edtJari, edtPelukis;
         Button btnAyoHitung;
         TextView txtLuas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung__lperm__kerucut);

        edtJari = (EditText) findViewById(R.id.jari);
        edtPelukis = (EditText) findViewById(R.id.pelukis);
        btnAyoHitung = (Button) findViewById(R.id.button);
        txtLuas = (TextView) findViewById(R.id.luaspermukaan);

        btnAyoHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String jari = edtJari.getText().toString().trim();
                String pelukis = edtPelukis.getText().toString().trim();

                if (TextUtils.isEmpty(edtJari.getText()) || TextUtils.isEmpty(edtPelukis.getText()))
                {
                    Toast.makeText(Hitung_LPerm_Kerucut.this, "Nilai Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
                } else
                    {
                        try
                        {
                            double r = Double.parseDouble(jari);
                            double s = Double.parseDouble(pelukis);
                            double luas = (3.14 * r * r) + (3.14 * r * s);

                            txtLuas.setText("Luas Permukaan = " + luas);
                        } catch (NumberFormatException e)
                            {
                                Toast.makeText(Hitung_LPerm_Kerucut.this, "Format Salah", Toast.LENGTH_SHORT).show();
                            }
                    }
            }
        });
    }
}