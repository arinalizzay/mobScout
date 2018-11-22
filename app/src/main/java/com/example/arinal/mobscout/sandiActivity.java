package com.example.arinal.mobscout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sandiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sandi);

        Button sandiMorse = (Button) findViewById(R.id.SandiMorse);
        sandiMorse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ssandiMorse = new Intent(sandiActivity.this,ssandiMorseActivity.class);
                startActivity(ssandiMorse);
            }
        });

        Button sandiKotak1 = (Button) findViewById(R.id.sandiKotak1);
        sandiKotak1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sandiKotak1 = new Intent(sandiActivity.this,sandiKotak1Activity.class);
                startActivity(sandiKotak1);
            }
        });

        Button sandiKotak2 = (Button) findViewById(R.id.sandiKotak2);
        sandiKotak2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sandiKotak2 = new Intent(sandiActivity.this,sandiKotak2Activity.class);
                startActivity(sandiKotak2);
            }
        });

        Button sandiKotak3 = (Button) findViewById(R.id.sandiKotak3);
        sandiKotak3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sandiKotak3 = new Intent(sandiActivity.this,sandiKotak3Activity.class);
                startActivity(sandiKotak3);
            }
        });

        Button sandiKoordinat = (Button) findViewById(R.id.sandiKoordinat);
        sandiKoordinat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sandiKoordinat = new Intent(sandiActivity.this,sandiKoordinatActivity.class);
                startActivity(sandiKoordinat);
            }
        });

        Button sandiKurung = (Button) findViewById(R.id.sandiKurung);
        sandiKurung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sandiKurung = new Intent(sandiActivity.this,sandiKurungActivity.class);
                startActivity(sandiKurung);
            }
        });

        Button sandiRumput = (Button) findViewById(R.id.sandiRumput);
        sandiRumput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sandiRumput = new Intent(sandiActivity.this,sandiRumputActivity.class);
                startActivity(sandiRumput);
            }
        });

        Button sandiAnd = (Button) findViewById(R.id.sandiAnd);
        sandiAnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sandiAnd = new Intent(sandiActivity.this,sandiAndActivity.class);
                startActivity(sandiAnd);
            }
        });

        Button sandiAnaz = (Button) findViewById(R.id.sandiAnaz);
        sandiAnaz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sandiAnaz = new Intent(sandiActivity.this,sandiAnazActivity.class);
                startActivity(sandiAnaz);
            }
        });

        Button sandiMarengos = (Button) findViewById(R.id.sandiMarengos);
        sandiMarengos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sandiMarengos = new Intent(sandiActivity.this,sandiMarengosActivity.class);
                startActivity(sandiMarengos);
            }
        });
    }
}
