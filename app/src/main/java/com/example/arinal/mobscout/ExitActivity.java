package com.example.arinal.mobscout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ExitActivity extends AppCompatActivity {

    private AlertDialog.Builder builder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exit);

        ImageButton exit = (ImageButton) findViewById(R.id.exit);

        exit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // TODO Auto-generated method stub

                startActivity(new Intent(ExitActivity.this,MainActivity.class));
                finish();
            }

        });

    }
}