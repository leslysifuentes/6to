package com.example.eva2_10_toastview2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mostrarToast(View v){
        Toast t_personalizado = hacerToast(this);
        t_personalizado.show();
    }

    protected Toast hacerToast(Context contexto){
        LayoutInflater inf = getLayoutInflater();
        View layout =inf.inflate(R.layout.toast_personalizado, null);
        TextView texto = layout.findViewById(R.id.texto);
        texto.setText("Esto es un Toast personalizado");
        Toast toast = new Toast(contexto);

        toast.setMargin(50,-50);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);

        return toast;
    }


}
