package com.example.eva2_7_bundles_extras;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Secondary extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);
        textView = findViewById(R.id.textView);
        Intent intent = getIntent();

        Bundle bundle = intent.getExtras();

        String cade =intent.getStringExtra("Datos");
        Double numero = intent.getDoubleExtra("num",0.0);

        textView.setText(cade + ", " + numero);
        textView.append("\n");
        textView.append(bundle.getString("bundle")+ ", "+ bundle.getInt("Entero"));

    }

}
