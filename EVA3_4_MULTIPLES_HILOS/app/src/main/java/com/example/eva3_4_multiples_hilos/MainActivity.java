package com.example.eva3_4_multiples_hilos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MiHilo miHilo = new MiHilo();
        miHilo.start();

        MiRunneable miRunneable = new MiRunneable();



        Thread hilo  = new Thread(miRunneable);
        hilo.start();


    }
}
