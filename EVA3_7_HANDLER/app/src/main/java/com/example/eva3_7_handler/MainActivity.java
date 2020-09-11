package com.example.eva3_7_handler;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv_mensaje;
    Handler handler = new Handler(){
        @Override
        public void handleMessage(@NonNull Message msg) {
            super.handleMessage(msg);

            int valor_i = (int)msg.obj;
            tv_mensaje.append( "\n Hilo: "+ msg.what+ " Valor i: "+ valor_i);

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_mensaje = findViewById(R.id.tv_mensaje);

        Thread hilo = new Thread(){
            @Override
            public void run() {
                super.run();

                int i = 0;
                while (true){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    Message msg = handler.obtainMessage(1,i);
                    handler.sendMessage(msg);

                    Log.wtf("Hilo", ""+i);

                    i++;
                }
            }
        };

        hilo.start();


    }
}
