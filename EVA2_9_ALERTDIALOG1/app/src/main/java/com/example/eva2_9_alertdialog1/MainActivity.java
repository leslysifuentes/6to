package com.example.eva2_9_alertdialog1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Date;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
   TextView tv_mensaje;
    Button b_cuadro;
    Button b_personalizado;
    Button b_fragment;
    Context contexto;
    String mensaje = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contexto = this;
        tv_mensaje = findViewById(R.id.tv_mensaje);
        b_cuadro = findViewById(R.id.b_cuadro);
        b_cuadro.setOnClickListener(this);
        b_personalizado = findViewById(R.id.b_personalizado);
        b_personalizado.setOnClickListener(this);
        b_fragment = findViewById(R.id.b_fragment);
        b_fragment.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
         if(v.getId() == b_cuadro.getId()){
             mostrarCuadro(this);
         }
         if(v.getId() == b_personalizado.getId()){
             mostrarPersonalizado();
         }
         else if(v.getId() == b_fragment.getId()){
             mostrarFragment(this);
         }
    }

    private void mostrarCuadro(MainActivity mainActivity){
        new AlertDialog.Builder(mainActivity).setTitle("Usuario")
                .setMessage("¿quieres quitar?").setIcon(R.drawable.dia)
                .setPositiveButton("Si", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        mensaje = "Si" + Integer.toString(which);
                        tv_mensaje.setText(mensaje);
                    }
                }).setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                mensaje = "No"+ Integer.toString(which);
                tv_mensaje.setText(mensaje);
            }
        })
                .setNeutralButton("Cancelar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                mensaje = "Cancelar"+ Integer.toString(which);
                tv_mensaje.setText(mensaje);
            }
        }).create().show();
    }

    private void mostrarPersonalizado(){
        final Dialog d_personalizado = new Dialog(contexto);
        d_personalizado.setTitle("Dialogo personalizado");
        d_personalizado.setContentView(R.layout.layout_personalizado);
        ((TextView) d_personalizado.findViewById(R.id.textView)).setText("Mensaje 1 \n Mensaje 2");
        final EditText editText = (EditText) d_personalizado.findViewById(R.id.editText);

        ((Button) d_personalizado.findViewById(R.id.button)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_mensaje.setText(editText.getText().toString());
                d_personalizado.dismiss();
            }
        });  d_personalizado.show();
    }

    private void mostrarFragment(MainActivity mainActivity){

        DialogFragment frag = ClaseFragment.newInstance("titulo");

        frag.show(getSupportFragmentManager(),"tag");

    }

    public void doPositiveClick(Date time){
        tv_mensaje.setText("Positivo: " + time);
    }

    public void doNegativeClick(Date time){
        tv_mensaje.setText("Negativo: " + time);
    }

    public void doNeutralClick(Date time){
        tv_mensaje.setText("Neutral: " + time);

    }
}
