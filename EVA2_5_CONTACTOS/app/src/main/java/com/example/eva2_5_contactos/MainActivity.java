package com.example.eva2_5_contactos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Intent in_contacto;
    Button b_cont;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b_cont = findViewById(R.id.b_cont);
        b_cont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String cont = "content://contacts/people/";
                in_contacto = new Intent(Intent.ACTION_VIEW, Uri.parse(cont));
                startActivity(in_contacto);
            }
        });
    }


}
