package com.example.eva2_9_alertdialog1;

import androidx.fragment.app.DialogFragment;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import java.util.Date;

public class ClaseFragment extends DialogFragment {



    public static ClaseFragment newInstance(String titulo){
        ClaseFragment frag = new ClaseFragment();
        Bundle args = new Bundle();
        args.putString("titulo",titulo);
        args.putString("Mensaje", "Mensaje1 \n Mensaje2");
        args.putInt("Icono", R.drawable.fra);
        frag.setArguments(args);
        return frag;
    }


    @Override
    public Dialog onCreateDialog( Bundle savedInstanceState) {
        String titulo = getArguments().getString("titulo");
        int icono = getArguments().getInt("Icono");
        String mensaje = getArguments().getString("Mensaje");

        return new AlertDialog.Builder(getActivity()).setIcon(icono).setTitle(titulo)
                .setMessage(mensaje).setPositiveButton("Positivo", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        ((MainActivity) getActivity()).doPositiveClick(new Date());
                    }
                })
                .setNegativeButton("Negativo", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        ((MainActivity) getActivity()).doNegativeClick(new Date());
                    }
                })
                .setNeutralButton("Neutral", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        ((MainActivity) getActivity()).doNeutralClick(new Date());
                    }
                }).create();
    }
}


