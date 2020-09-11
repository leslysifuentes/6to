package com.example.eva3_10_imagen;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.ImageView;

import java.io.InputStream;
import java.net.URL;


public class MainActivity extends AppCompatActivity {
    ImageView iv_imagen;
    Bitmap imagen;

    Handler handler = new Handler(){
        @Override
        public void handleMessage(@NonNull Message msg) {
            super.handleMessage(msg);
            iv_imagen.setImageBitmap(imagen);

        }
    };





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv_imagen = findViewById(R.id.iv_imagen);
        Thread hilo = new Thread(){
            @Override
            public void run() {
                super.run();
                imagen = cargarImagen("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a8/Colibri_coruscans.jpg/1200px-Colibri_coruscans.jpg");
                Message message = handler.obtainMessage();
                handler.sendMessage(message);
            }
        };

        hilo.start();

    }

    public Bitmap cargarImagen(String url){
        try {
            InputStream inputStream = (InputStream) new URL(url).getContent();
            Bitmap bitmap = BitmapFactory.decodeStream(inputStream);
            return bitmap;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;

    }





}
