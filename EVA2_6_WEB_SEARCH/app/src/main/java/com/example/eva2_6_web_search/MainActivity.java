package com.example.eva2_6_web_search;

import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Intent in_web;
    EditText texto;
    Button buscar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        texto = findViewById(R.id.texto);
        buscar = findViewById(R.id.buscar);
        buscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s_texto = "" + texto.getText().toString();
                in_web = new Intent(Intent.ACTION_WEB_SEARCH);
                in_web.putExtra(SearchManager.QUERY, s_texto);
                startActivity(in_web);

            }
        });

    }
}
