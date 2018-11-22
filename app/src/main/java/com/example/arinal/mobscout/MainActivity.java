package com.example.arinal.mobscout;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
private AlertDialog.Builder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton bioPembina = (ImageButton) findViewById(R.id.bioPembina);
        bioPembina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bioPembina = new Intent (MainActivity.this,BiodataActivity.class);
                startActivity(bioPembina);
            }
        });

        ImageButton upacara = (ImageButton) findViewById(R.id.upacara);
        upacara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent upacara = new Intent (MainActivity.this,AwalSoalActivity.class);
                startActivity(upacara);
            }
        });
        ImageButton tentang = (ImageButton) findViewById(R.id.tentang);
        tentang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tentang=new Intent(MainActivity.this,tentangActivity.class);
                startActivity(tentang);
            }
        });

        ImageButton sandi = (ImageButton) findViewById(R.id.sandi);
        sandi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sandi = new Intent(MainActivity.this,sandiActivity.class);
                startActivity(sandi);
            }
        });

        ImageButton simpul = (ImageButton) findViewById(R.id.simpul);
        simpul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent simpul = new Intent(MainActivity.this,simpulActivity.class);
                startActivity(simpul);
            }
        });

        ImageButton konversi = (ImageButton) findViewById(R.id.konversi);
        konversi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent konversi = new Intent(MainActivity.this,konversiActivity.class);
                startActivity(konversi);
            }
        });

        ImageButton sejarah = (ImageButton) findViewById(R.id.sejarah);
        sejarah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sejarah = new Intent(MainActivity.this,sejarahActivity.class);
                startActivity(sejarah);
            }
        });


        ImageButton materiumum = (ImageButton) findViewById(R.id.materiumum);
        materiumum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent materiumum = new Intent(MainActivity.this,materiUmumActivity.class);
                startActivity(materiumum);
            }
        });



        ImageButton exit = (ImageButton) findViewById(R.id.exit);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent exit = new Intent(MainActivity.this,ExitActivity.class);
//                moveTaskToBack(true);
                setAlertDialog().show();
            }
        });


    }

    @Override
    public void onBackPressed() {
        setAlertDialog().show();
    }

    //    public void onBackPressed() { setAlertDialog().show();
    public AlertDialog setAlertDialog(){
        builder = new AlertDialog.Builder(this);

        builder.setMessage("Apakah Anda yakin keluar?")
                .setTitle("Keluar Aplikasi");

        builder.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        }).setPositiveButton("Ya", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                moveTaskToBack(true);
            }
        });
        AlertDialog dialog = builder.create();
        return dialog;
    }
}
