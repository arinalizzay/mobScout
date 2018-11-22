package com.example.arinal.mobscout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class simpulActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simpul);

        Button simpulMati = (Button) findViewById(R.id.simpulMati);
        simpulMati.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent simpulMati = new Intent(simpulActivity.this,simpulMatiActivity.class);
                startActivity(simpulMati);
            }
        });

        Button simpulHidup = (Button) findViewById(R.id.simpulHidup);
        simpulHidup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent simpulHidup = new Intent(simpulActivity.this,simpulHidupActivity.class);
                startActivity(simpulHidup);
            }
        });

        Button simpulJangkar = (Button) findViewById(R.id.simpulJangkar);
        simpulJangkar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent simpulJangkar = new Intent(simpulActivity.this,simpulJangkarActivity.class);
                startActivity(simpulJangkar);
            }
        });

        Button simpulPangkal = (Button) findViewById(R.id.simpulPangkal);
        simpulPangkal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent simpulPangkal = new Intent(simpulActivity.this,simpulPangkalActivity.class);
                startActivity(simpulPangkal);
            }
        });

        Button simpulAnyam = (Button) findViewById(R.id.simpulAnyam);
        simpulAnyam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent simpulAnyam = new Intent(simpulActivity.this,simpulAnyamActivity.class);
                startActivity(simpulAnyam);
            }
        });

        Button simpulLaso = (Button) findViewById(R.id.simpulLaso);
        simpulLaso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent simpulLaso = new Intent(simpulActivity.this,simpulLasoMain2Activity.class);
                startActivity(simpulLaso);
            }
        });

        Button simpulAnyamBerganda = (Button) findViewById(R.id.simpulAnyamBerganda);
        simpulAnyamBerganda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent simpulAnyamBerganda = new Intent(simpulActivity.this,simpulAnyamBergandaActivity.class);
                startActivity(simpulAnyamBerganda);
            }
        });

        Button simpulAnyamRantai = (Button) findViewById(R.id.simpulAnyamRantai);
        simpulAnyamRantai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent simpulAnyamRantai = new Intent(simpulActivity.this,simpulAnyamRantaiActivity.class);
                startActivity(simpulAnyamRantai);
            }
        });

        Button simpulUjungTali = (Button) findViewById(R.id.simpulUjungTali);
        simpulUjungTali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent simpulUjungTali = new Intent(simpulActivity.this,simpulUjungTaliActivity.class);
                startActivity(simpulUjungTali);
            }
        });

        Button simpulTiang = (Button) findViewById(R.id.simpulTiang);
        simpulTiang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent simpulTiang = new Intent(simpulActivity.this,simpulTiangActivity.class);
                startActivity(simpulTiang);
            }
        });

        Button simpulErat = (Button) findViewById(R.id.simpulErat);
        simpulErat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent simpulErat = new Intent(simpulActivity.this,simpulEratActivity.class);
                startActivity(simpulErat);
            }
        });

        Button simpulTambat = (Button) findViewById(R.id.simpulTambat);
        simpulTambat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent simpulTambat = new Intent(simpulActivity.this,simpulTambatActivity.class);
                startActivity(simpulTambat);
            }
        });
    }
}
