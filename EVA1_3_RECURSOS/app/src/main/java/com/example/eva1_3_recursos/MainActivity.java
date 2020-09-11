package com.example.eva1_3_recursos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView imgVwFoto;
    TextView txtVwTitu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgVwFoto = findViewById(R.id.imgVwFoto);

        imgVwFoto.setImageResource(R.drawable.cube);
    }
}
