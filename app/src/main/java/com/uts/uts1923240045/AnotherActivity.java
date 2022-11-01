package com.uts.uts1923240045;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AnotherActivity extends AppCompatActivity {
    private TextView tvNamaL, tvNoPen, tvJalurs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);

        tvNamaL = findViewById(R.id.tv_nama_len);
        tvNoPen = findViewById(R.id.tv_nopen);
        tvJalurs = findViewById(R.id.tv_jalurs);

        Intent gotcha = getIntent();
        tvNamaL.setText(gotcha.getStringExtra("varNama"));
        tvNoPen.setText(gotcha.getStringExtra("varNomor"));
        tvJalurs.setText(gotcha.getStringExtra("varJalur"));
    }
}