package com.example.eva3_9_banner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView iv_banner;
    int[] imagenes = {
            R.drawable.f1,
            R.drawable.f2,
            R.drawable.f3   };

    SeekBar sb_barra;
    int velocidad = 1000;
    TextView tv_velocidad;

    int indice =0;
    Thread hilo;

    Handler handler = new Handler();

    Runnable backGround = new Runnable() {
        @Override
        public void run() {
            while (true){
                try {
                    Thread.sleep(velocidad);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                handler.post(foreGround);
            }

        }
    };

    Runnable foreGround = new Runnable() {
        @Override
        public void run() {
            iv_banner.setImageResource(imagenes[indice]);
            if(indice == 2){
                indice = 0;
            }else{
                indice++;
            }
        }
    };
/*
    2000 = 4

    aumenta de 500 en 500
 */


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv_banner = findViewById(R.id.iv_banner);
        tv_velocidad = findViewById(R.id.tv_velocidad);
        sb_barra = findViewById(R.id.sb_barra);
        sb_barra.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                velocidad = progress * 1000;
                tv_velocidad.setText(""+velocidad);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        hilo = new Thread(backGround);
        hilo.start();


    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        hilo.interrupt();
    }
}
