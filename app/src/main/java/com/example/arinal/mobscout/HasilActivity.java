package com.example.arinal.mobscout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

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
                Intent intent = new Intent(HasilActivity.this, AwalSoalActivity.class);
                startActivity(intent);
            }
        });
    }
}
