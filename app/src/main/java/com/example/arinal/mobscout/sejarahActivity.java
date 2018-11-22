package com.example.arinal.mobscout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sejarahActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sejarah);

        Button sejarahPramukaDunia = (Button) findViewById(R.id.sejarahPramukaDunia);
        sejarahPramukaDunia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sejarahPramukaDunia = new Intent(sejarahActivity.this,SejarahPramukaDuniaActivity.class);
                startActivity(sejarahPramukaDunia);
            }
        });

        Button sejarahPramukaIndo = (Button) findViewById(R.id.sejarahPramukaIndo);
        sejarahPramukaIndo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sejarahPramukaIndo = new Intent(sejarahActivity.this,sejarahPramukaIndoActivity.class);
                startActivity(sejarahPramukaIndo);
            }
        });

        Button sejarahLambangPramuka = (Button) findViewById(R.id.sejarahLambangPramuka);
        sejarahLambangPramuka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sejarahLambangPramuka = new Intent(sejarahActivity.this,sejarahLambangPramukaActivity.class);
                startActivity(sejarahLambangPramuka);
            }
        });

        Button sejarahMorse = (Button) findViewById(R.id.sejarahMorse);
        sejarahMorse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sejarahMorse = new Intent(sejarahActivity.this,sejarahMorseActivity.class);
                startActivity(sejarahMorse);
            }
        });

        Button sejarahSandi = (Button) findViewById(R.id.sejarahSandi);
        sejarahSandi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sejarahSandi = new Intent(sejarahActivity.this,sejarahSandiActivity.class);
                startActivity(sejarahSandi);
            }
        });

        Button penemuMorse = (Button) findViewById(R.id.penemuMorse);
        penemuMorse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent penemuMorse = new Intent(sejarahActivity.this,penemuMorseActivity.class);
                startActivity(penemuMorse);
            }
        });

        Button penemuSemaphore = (Button) findViewById(R.id.penemuSemaphore);
        penemuSemaphore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent penemuSemaphore = new Intent(sejarahActivity.this,penemuSemaphoreActivity.class);
                startActivity(penemuSemaphore);
            }
        });

        Button gunaSemaphore = (Button) findViewById(R.id.gunaSemaphore);
        gunaSemaphore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gunaSemaphore = new Intent(sejarahActivity.this,gunaSemaphoreActivity.class);
                startActivity(gunaSemaphore);
            }
        });
    }
}
