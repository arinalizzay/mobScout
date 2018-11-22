package com.example.arinal.mobscout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class materiUmumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi_umum);

        Button dasadharma = (Button) findViewById(R.id.dasadharma);
        dasadharma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent dasadharma = new Intent(materiUmumActivity.this,dasadharmaActivity.class);
                startActivity(dasadharma);
            }
        });

        Button trisatya = (Button) findViewById(R.id.trisatya);
        trisatya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent trisatya = new Intent(materiUmumActivity.this,trisatyaActivity.class);
                startActivity(trisatya);
            }
        });

        Button semaphore = (Button) findViewById(R.id.semaphore);
        semaphore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent semaphore = new Intent(materiUmumActivity.this,semaphoreActivity.class);
                startActivity(semaphore);
            }
        });

    }
}
