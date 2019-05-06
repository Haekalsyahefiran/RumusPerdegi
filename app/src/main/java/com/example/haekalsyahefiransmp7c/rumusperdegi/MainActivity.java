package com.example.haekalsyahefiransmp7c.rumusperdegi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText sisi1, sisi2;
    TextView hasil;
    Button hitung,hapus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sisi1 = findViewById(R.id.sisi1);
        sisi2 = findViewById(R.id.sisi2);
        hasil = findViewById(R.id.hasil);
        hitung = findViewById(R.id.hitung);
        hapus = findViewById(R.id.hapus);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sisi1.getText().toString().isEmpty() || sisi2.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Masukkin Dong!!!!" , Toast.LENGTH_SHORT).show();
                }else {
                    hasil();

                }


            }
        });

    }

    void hasil(){
        int angka1 = Integer.parseInt(sisi1.getText().toString());
        int angka2 = Integer.parseInt(sisi2.getText().toString());

        int total = angka1 * angka2;
        hasil.setText(String.valueOf(total));
    }
}
