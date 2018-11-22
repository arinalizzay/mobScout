package com.example.arinal.mobscout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MenuActivity extends AppCompatActivity {

    TextView nama;
    TextView score;
    public static int skor = 0;

    public static Soal [] soal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        nama = (TextView) findViewById(R.id.nama);
        score = (TextView) findViewById(R.id.score);
        ImageView level1 = (ImageView) findViewById(R.id.level1);

        nama.setText("Selamat datang, "+ AwalSoalActivity.uname.toString());

        public class HasilActivity extends AppCompatActivity {

            TextView uname;
            TextView skor;
            Button back;

            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_hasil);

                uname = (TextView) findViewById(R.id.uname);
                skor = (TextView) findViewById(R.id.score);
                back = (Button) findViewById(R.id.back);

                uname.setText("Hasil akhir poin "+ AwalSoalActivity.uname);
                skor.setText(String.valueOf(MenuActivity.skor));

                back.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        finish();
                        MenuActivity.skor=0;
                        Intent intent = new Intent(com.example.arinal.mobscout.HasilActivity.this, AwalSoalActivity.class);
                        startActivity(intent);
                    }
                });

        level1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soal = new Soal[5];

                soal[0] = new Soal();
                soal[0].setSoal("Siapa Bapak Pramuka Dunia ?");
                soal[0].setJawaban(0, "Lord Robert Son Smyth Boden Powell");
                soal[0].setJawaban(1, "Lord Robert Boden Powell Of Gilwell");
                soal[0].setJawaban(2, "Robert Stephanson Smyth Boden Powell");
                soal[0].setJawaban(3, "Robert Stephan William Smyth");
                soal[0].setCek(2);

                soal[1] = new Soal();
                soal[1].setSoal("Dasa Dharma Pramuka butir 7 berbunyi ?");
                soal[1].setJawaban(0, "Disiplin Berani dan Setia");
                soal[1].setJawaban(1, "Rela Menlong dan Tabah");
                soal[1].setJawaban(2, "Rajin Terampil dan Gembira");
                soal[1].setJawaban(3, "Hemat Cermat dan Bersahaja");
                soal[1].setCek(4);

                soal[2] = new Soal();
                soal[2].setSoal("Dalam Semaphore, Huruf yang membentuk sudut 180 derajat Adalah ?");
                soal[2].setJawaban(0, "P");
                soal[2].setJawaban(1, "J");
                soal[2].setJawaban(2, "R");
                soal[2].setJawaban(3, "N");
                soal[2].setCek(3);

                soal[3] = new Soal();
                soal[3].setSoal("Dibawah ini yang merupakan motto Gerakan Pramuka Adalah ?");
                soal[3].setJawaban(0, "Ikhlas Bakti Bina Bangsa, Berbudi Bawa Laksana");
                soal[3].setJawaban(1, "Satyaku Ku Dharmakan, Dharmaku ku Baktikan");
                soal[3].setJawaban(2, "Amalkan Trisatya dan Terapkan Dasadharma");
                soal[3].setJawaban(3, "Tunas Kelapa");
                soal[3].setCek(2);

                soal[4] = new Soal();
                soal[4].setSoal("Dalam Sandi Morse terdapat titik(.) dan strip (-), Huruf yang tidak ada titiknya adalah ?");
                soal[4].setJawaban(0, "M, O & T");
                soal[4].setJawaban(1, "G, K & W");
                soal[4].setJawaban(2, "J, Q & Y");
                soal[4].setJawaban(3, "H, S & X");
                soal[4].setCek(1);


                Intent intent = new Intent(MenuActivity.this, SoalActivity.class);
                startActivity(intent);
            }
        });


    }
}