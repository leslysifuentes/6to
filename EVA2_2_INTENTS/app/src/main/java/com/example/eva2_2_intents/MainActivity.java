package com.example.eva2_2_intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Intent in_tel;
    EditText et_tel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_tel = findViewById(R.id.et_tel);


    }

    public void onClick(View v){
        String cade ="tel:" + et_tel.getText().toString();
        if(v.getId() == R.id.marcar){
            in_tel = new Intent(Intent.ACTION_DIAL, Uri.parse(cade));//ejecuta la pantalla de marcación, no hace la llamada

        }
        else{
            in_tel = new Intent(Intent.ACTION_CALL, Uri.parse(cade));//llama directamente

        }

        startActivity(in_tel);
    }
}
