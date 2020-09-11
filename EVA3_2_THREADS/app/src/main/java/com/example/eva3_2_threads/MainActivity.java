package com.example.eva3_2_threads;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*for (int i=0; i<10;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }*/

        Thread hilo1 = new Thread(){

            @Override
            public void run() {
                super.run();
                for (int i=0; i<10;i++){
                    try {
                        Thread.sleep(1000);
                        Log.wtf("hilo1", ""+i);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }

        };

        hilo1.start();





    }
}
