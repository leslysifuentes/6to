package com.example.eva2_3_sms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Intent sms;
    Button enviar_sms;
    EditText editText, editText2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        enviar_sms = findViewById(R.id.enviar_sms);
        editText = findViewById(R.id.editText);
        editText2= findViewById(R.id.editText2);
        enviar_sms.setOnClickListener(
            new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String sTel = "smsto:" + editText.getText().toString();
                    String sSMS = editText2.getText().toString();
                    sms = new Intent(Intent.ACTION_SENDTO, Uri.parse(sTel));
                    sms.putExtra("sms_body",sSMS);
                    startActivity(sms);
                }
            } );




}}
