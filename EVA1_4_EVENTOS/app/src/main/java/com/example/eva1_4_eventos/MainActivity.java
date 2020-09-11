package com.example.eva1_4_eventos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btnListener;
    Button btnClaseAnonima;
    Button btnPorClase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnListener = findViewById(R.id.btnListener);
        btnListener.setOnClickListener(this);


        btnClaseAnonima=findViewById(R.id.btnClaseAnonima);
        btnClaseAnonima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "EVENTO POR CLASE ANONIMA", Toast.LENGTH_LONG).show();}});


        btnPorClase=findViewById(R.id.btnPorClase);

        btnPorClase.setOnClickListener(new MiClickListener(this));
    }

    public void miClick(View v){
        Toast.makeText(this, "EVENTO POR XML", Toast.LENGTH_LONG).show();   }

    @Override
    public void onClick(View v) {
        Toast.makeText(this, "EVENTO POR LISTENER", Toast.LENGTH_LONG).show();  }
}
