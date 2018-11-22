package com.example.arinal.mobscout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.AdapterView;
import android.widget.Toast;

public class konversiActivity extends AppCompatActivity {

    TextView judul, hasil;
    Button submit;
    Spinner pilihan;
    EditText input;
    Spinner spinner1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konversi);

        judul = (TextView) findViewById(R.id.judul_konversi);
        hasil = (TextView) findViewById(R.id.hasil_konversi);
        submit = (Button) findViewById(R.id.submit_konversi);
        input = (EditText) findViewById(R.id.input_konversi);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputan = input.getText().toString();
                String morse = "";

                if (!TextUtils.isEmpty(inputan)){
                    for (int i=0; i<inputan.length(); i++){
                        switch (inputan.toLowerCase().charAt(i))
                        {
                            case ' ' : {
                                morse =morse +"  "+" \n\n" ;
                                break ;
                            }
                            case 'a' : {
                                morse =morse +".-"+"   " ;
                                break ;
                            }
                            case 'b' : {
                                morse = morse + "-..."+"   " ;
                                break ;
                            }
                            case 'c' : {
                                morse = morse +"-.-."+"   " ;
                                break ;
                            }
                            case 'd' : {
                                morse = morse +"-.."+"   " ;
                                break ;
                            }
                            case 'e' : {
                                morse = morse +"." +"   ";
                                break ;
                            }
                            case 'f' : {
                                morse = morse +"..-."+"   " ;
                                break ;
                            }
                            case 'g' : {
                                morse = morse +"--." +"   ";
                                break ;
                            }
                            case 'h' : {
                                morse = morse +"...."+"   " ;
                                break ;
                            }
                            case 'i' : {
                                morse = morse +".." +"   ";
                                break ;
                            }
                            case 'j' : {
                                morse = morse +".---" +"   ";
                                break ;
                            }
                            case 'k' : {
                                morse = morse +"-.-" +"   ";
                                break ;
                            }
                            case 'l' : {
                                morse = morse +".-.." +"   ";
                                break ;
                            }
                            case 'm' : {
                                morse = morse +"--" +"   ";
                                break ;
                            }
                            case 'n' : {
                                morse = morse +"-." +"   ";
                                break ;
                            }
                            case 'o' : {
                                morse = morse +"---" +"   ";
                                break ;
                            }
                            case 'p' : {
                                morse = morse +".--."+"   " ;
                                break ;
                            }
                            case 'q' : {
                                morse = morse +"--.-" +"   ";
                                break ;
                            }
                            case 'r' : {
                                morse = morse +".-."+"   " ;
                                break ;
                            }
                            case 's' : {
                                morse = morse +"..." +"   ";
                                break ;
                            }
                            case 't' : {
                                morse = morse +"-"+"   " ;
                                break ;
                            }
                            case 'u' : {
                                morse = morse +"..-" +"   ";
                                break ;
                            }
                            case 'v' : {
                                morse = morse +"...-" +"   ";
                                break ;
                            }
                            case 'w' : {
                                morse = morse +".--" +"   ";
                                break ;
                            }
                            case 'x' : {
                                morse = morse +"-..-" +"   ";
                                break ;
                            }
                            case 'y' : {
                                morse = morse +"-.--"+"   " ;
                                break ;
                            }
                            case 'z' : {
                                morse = morse +"--.."+"   " ;
                                break ;
                            }
                            case '0' : {
                                morse = morse +"-----"+"   " ;
                                break ;
                            }
                            case '1' : {
                                morse = morse +".----"+"   " ;
                                break ;
                            }
                            case '2' : {
                                morse = morse +"..---"+"   " ;
                                break ;
                            }
                            case '3': {
                                morse = morse + "...--"+"   ";
                                break;
                            }
                            case '4' : {
                                morse = morse +"....-"+"   " ;
                                break ;
                            }
                            case '5' : {
                                morse = morse +"....."+"   " ;
                                break ;
                            }
                            case '6' : {
                                morse = morse +"-...."+"   " ;
                                break ;
                            }
                            case '7' : {
                                morse = morse +"--..."+"   " ;
                                break ;
                            }
                            case '8' : {
                                morse = morse +"---.."+"   " ;
                                break ;
                            }
                            case '9' : {
                                morse = morse +"----."+"   ";
                                break ;
                            }
                        }
                    }
                    hasil.setText(morse);
                } else{
                    Toast.makeText(getApplicationContext(), "Anda belum menginput sandi", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}