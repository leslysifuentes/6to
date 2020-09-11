package com.example.eva3_6_ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv_datos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_datos = findViewById(R.id.tv_datos);

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
                    Log.wtf("Hilo", ""+i);
                    tv_datos.setText(i+"\n");
                    i++;
                }
            }
        };

        hilo.start();


    }
}
