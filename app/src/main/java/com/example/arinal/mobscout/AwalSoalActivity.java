package com.example.arinal.mobscout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AwalSoalActivity extends AppCompatActivity {

    EditText username;
    public static String uname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upacara);

        Button start = (Button) findViewById(R.id.start);
        Button about = (Button) findViewById(R.id.about);
        Button exit = (Button) findViewById(R.id.exit);
        username = (EditText) findViewById(R.id.username);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!TextUtils.isEmpty(username.getText().toString())) {
                    uname = username.getText().toString();
                    Toast.makeText(AwalSoalActivity.this, "Selamat datang "+uname+" )", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(AwalSoalActivity.this, MenuActivity.class);
                    startActivity(intent);
                } else
                    Toast.makeText(getApplicationContext(), "Anda belum mengisi username", Toast.LENGTH_SHORT).show();
            }
            public boolean check(){
                return (username.getText().toString() != "");
            }
        });

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.about);
            }
        });

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AwalSoalActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}