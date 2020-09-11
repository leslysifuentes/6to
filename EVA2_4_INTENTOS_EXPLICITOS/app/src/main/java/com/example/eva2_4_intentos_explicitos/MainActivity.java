package com.example.eva2_4_intentos_explicitos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    Intent in_lanzar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        in_lanzar = new Intent(this, Main2Activity.class);

        /*Tarea
        EVA2_5_CONTACTOS
        EVA2_6_WEB_SEARCH
        (ANDROID INTENTS)
        */
    }

    public void onClick(View v){
        startActivity(in_lanzar);
    }
}
