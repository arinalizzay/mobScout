package com.example.arinal.mobscout;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class SoalActivity extends AppCompatActivity {

    Soal soal[];

    TextView quest;
    RadioButton pilihan1,pilihan2,pilihan3,pilihan4;
    Button submit;
    RadioGroup group;
    int load= 0;
    int jawaban;
    TextView score;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal);
        quest  = (TextView) findViewById(R.id.soal);
        pilihan1 = (RadioButton) findViewById(R.id.pilihan1);
        pilihan2 = (RadioButton) findViewById(R.id.pilihan2);
        pilihan3 = (RadioButton) findViewById(R.id.pilihan3);
        pilihan4 = (RadioButton) findViewById(R.id.pilihan4);
        submit = (Button) findViewById(R.id.submit);
        group = (RadioGroup) findViewById(R.id.choice);
        score = (TextView) findViewById(R.id.score);
        score.setText("Skor : "+String.valueOf(MenuActivity.skor));
        soal = MenuActivity.soal;
        prepare();

        group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                switch (i){
                    case R.id.pilihan1 : jawaban=1;
                        break;
                    case R.id.pilihan2 : jawaban=2;
                        break;
                    case R.id.pilihan3 : jawaban=3;
                        break;
                    case R.id.pilihan4 : jawaban=4;
                        break;
                }
            }
        });
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (jawaban==0){
                    Toast.makeText(SoalActivity.this, "Kamu belum memilih jawaban", Toast.LENGTH_SHORT).show();
                }
                else if(cekJawaban(load)){
                    MenuActivity.skor += 20;
                    score.setText("Skor : "+String.valueOf(MenuActivity.skor));
                    Toast.makeText(getApplicationContext(), "Selamat, kamu mendapat 20 poin :)", Toast.LENGTH_SHORT).show();
                    if (load<soal.length-1){
                        group.clearCheck();
                        jawaban = 0;
                        setSoal(++load);
                    } else{
                        Toast.makeText(getApplicationContext(), "Selamat, kamu telah mengerjakan semua soal :)", Toast.LENGTH_SHORT).show();
                        finish();
                        Intent intent = new Intent(SoalActivity.this, HasilActivity.class);
                        startActivity(intent);
                    }
                }
                else {
                    MenuActivity.skor -= 5;
                    score.setText("Skor : "+String.valueOf(MenuActivity.skor));
                    Toast.makeText(getApplicationContext(), "Sayang sekali jawabanmu salah : ", Toast.LENGTH_SHORT).show();
                    if (load<soal.length-1){
                        group.clearCheck();
                        jawaban = 0;
                        setSoal(++load);
                    } else{
                        Toast.makeText(getApplicationContext(), "Selamat, kamu telah mengerjakan semua soal :)", Toast.LENGTH_SHORT).show();
                        finish();
                        Intent intent = new Intent(SoalActivity.this, HasilActivity.class);
                        startActivity(intent);
                    }
                }


            }
        });
    }

    public void prepare(){
        quest.setText(soal[0].getSoal());
        pilihan1.setText(soal[0].getJawaban(0));
        pilihan2.setText(soal[0].getJawaban(1));
        pilihan3.setText(soal[0].getJawaban(2));
        pilihan4.setText(soal[0].getJawaban(3));
    }

    boolean cekJawaban(int load){
        return (jawaban==soal[load].getCek());
    }

    void setSoal(int load){
        quest.setText(soal[load].getSoal());
        pilihan1.setText(soal[load].getJawaban(0));
        pilihan2.setText(soal[load].getJawaban(1));
        pilihan3.setText(soal[load].getJawaban(2));
        pilihan4.setText(soal[load].getJawaban(3));
    }
}