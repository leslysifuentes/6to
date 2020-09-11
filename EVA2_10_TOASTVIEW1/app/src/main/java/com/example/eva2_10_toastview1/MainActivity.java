package com.example.eva2_10_toastview1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etX;
    EditText etY;
    TextView mensaje;
    Button b_mostrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etX = findViewById(R.id.etX);
        etY = findViewById(R.id.etY);
        mensaje= findViewById(R.id.mensaje);
        b_mostrar = findViewById(R.id.b_mostrar);

        int dpi = Resources.getSystem().getDisplayMetrics().densityDpi;
        int width = Resources.getSystem().getDisplayMetrics().widthPixels;
        int height = Resources.getSystem().getDisplayMetrics().heightPixels;
        mensaje.append("\n Tamaño de la pantalla: " + width + " x " + height  +" \n Dpi: " + dpi + "dpi");

        b_mostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                Toast mensajeToast = Toast.makeText(getApplicationContext(), "Hola", Toast.LENGTH_LONG);
                mensajeToast.setGravity(Gravity.CENTER, Integer.valueOf(etX.getText().toString()), Integer.valueOf(etY.getText().toString()));
                mensajeToast.show();}
                catch (Exception e){
                    Toast.makeText(getApplicationContext(), e.getMessage(),Toast.LENGTH_LONG).show();
                }
            }       });



    }
}
