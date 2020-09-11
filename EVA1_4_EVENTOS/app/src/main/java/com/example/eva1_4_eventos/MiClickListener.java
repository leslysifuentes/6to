package com.example.eva1_4_eventos;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

public class MiClickListener implements View.OnClickListener {
    Context context;

    public MiClickListener(Context context){
        this.context = context;
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(context, "EVENTO POR CLASE", Toast.LENGTH_LONG).show();
    }
}
