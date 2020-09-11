package com.example.eva3_8_handler_runnables;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv_mensaje;
    Handler handler = new Handler();
    int i;

    Runnable backGround = new Runnable() {
        @Override
        public void run() {
            i = 0;
            while (true){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                handler.post(foreGround);

                Log.wtf("Hilo", ""+i);

                i++;
            }
        }
    };

    Runnable foreGround = new Runnable() {
        @Override
        public void run() {
            tv_mensaje.append("\n Valor: "+ i);

        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_mensaje = findViewById(R.id.tv_mensaje);

        Thread thread = new Thread(backGround);

        thread.start();


    }
}
