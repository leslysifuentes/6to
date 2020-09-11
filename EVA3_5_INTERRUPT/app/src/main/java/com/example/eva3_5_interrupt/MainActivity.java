package com.example.eva3_5_interrupt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Thread hilo;

    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            int i = 0;
            while (true){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    break;
                }
                Log.wtf("MiHilo", ""+i);
                i++;
            }

        }
    };




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hilo = new Thread(runnable);
        Toast.makeText(this, "Estado Antes: "+hilo.getState(),Toast.LENGTH_SHORT ).show();
        Log.wtf("Antes", ""+"Estado Antes: "+hilo.getState());
        hilo.start();
        Toast.makeText(this, "Estado Después: "+hilo.getState(),Toast.LENGTH_SHORT ).show();
        Log.wtf("Despues", ""+"Estado Después: "+hilo.getState());



    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        hilo.interrupt();

    }
}
