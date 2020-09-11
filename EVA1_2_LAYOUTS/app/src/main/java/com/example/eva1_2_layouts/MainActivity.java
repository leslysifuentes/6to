package com.example.eva1_2_layouts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edtTxtNom, edtTxtApe, edtTxtEdad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtTxtApe= findViewById(R.id.editTextApe);
        edtTxtApe= findViewById(R.id.editTextEdad);
        edtTxtApe= findViewById(R.id.editTextNom);
        edtTxtApe.setText("hola mundo");


    }



}
