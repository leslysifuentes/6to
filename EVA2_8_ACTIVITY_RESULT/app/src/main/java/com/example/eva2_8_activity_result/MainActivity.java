package com.example.eva2_8_activity_result;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {
    Button button;
    Intent in_sel_num;
    Intent in_sel_cont;
    final int numeros= 1000;
    final int contactos = 2000;
    Button b_contactos;
    Button b_imagenes;
    Button b_audio;
    Button b_video;
    Intent in_sel_imagenes;
    Intent in_sel_audio;
    Intent in_sel_video;
    final int imagenes= 3000;
    final int audio = 4000;
    final int video= 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(in_sel_num, numeros);
            }
        });

        b_contactos = findViewById(R.id.b_contactos);
        b_contactos.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                startActivityForResult(in_sel_cont, contactos);
            }
        });
        b_imagenes = findViewById(R.id.b_imagenes);
        b_imagenes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(in_sel_imagenes, imagenes);
            }
        });
        b_audio = findViewById(R.id.b_audio);
        b_audio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(in_sel_audio, audio);
            }
        });
        b_video = findViewById(R.id.b_video);
        b_video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(in_sel_video,video);
            }
        });




        //imagenes audio video

        in_sel_num = new Intent(this, MyDataActivity.class);
        in_sel_cont = new Intent(Intent.ACTION_PICK, android.provider.ContactsContract.Contacts.CONTENT_URI);

        in_sel_imagenes = new Intent(Intent.ACTION_PICK, android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        in_sel_audio = new Intent(Intent.ACTION_PICK, android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI);
        in_sel_video = new Intent(Intent.ACTION_PICK, android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI);

    }


//
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode){
            case numeros://que actividad devolvio datos
                if(resultCode == Activity.RESULT_OK){//cual fue la respuesta
                    // que accion ejecutan los datos devueltos
                    Toast.makeText(this, data.getStringExtra("aaa"),Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(this, "Cancelado", Toast.LENGTH_LONG).show();
                }
            case contactos:
                if(resultCode == Activity.RESULT_OK){
                    String scont = data.getDataString();
                    Log.wtf("contacto",scont);
                Toast.makeText(this, scont, Toast.LENGTH_LONG).show();
            }
            case imagenes:
                if(resultCode == Activity.RESULT_OK){
                    String sima = data.getDataString();
                    Log.wtf("imagen",sima);
                    Toast.makeText(this, sima, Toast.LENGTH_LONG).show();
                }

            case audio:
                if(resultCode == Activity.RESULT_OK){
                    String saud = data.getDataString();
                    Log.wtf("audio",saud);
                    Toast.makeText(this, saud, Toast.LENGTH_LONG).show();
                }
            case video:
                if(resultCode == Activity.RESULT_OK){
                    String svid = data.getDataString();
                    Log.wtf("video",svid);
                    Toast.makeText(this, svid, Toast.LENGTH_LONG).show();
                }

            break;
        }
    }
}