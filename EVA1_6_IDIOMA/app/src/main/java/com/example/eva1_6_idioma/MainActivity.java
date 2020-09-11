package com.example.eva1_6_idioma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener{


    TextView tv_idioma,  tv_nombre, tv_apellido, tv_edad;
    EditText et_nombre, et_apellido, et_edad;
    RadioGroup rg_idioma;
    RadioButton rb_español, rb_ingles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_idioma =findViewById(R.id.tv_idioma);
        tv_nombre =findViewById(R.id.tv_nombre);
        tv_apellido =findViewById(R.id.tv_apellido);
        tv_edad =findViewById(R.id.tv_edad);

        et_nombre =findViewById(R.id.et_nombre);
        et_apellido =findViewById(R.id.et_apellido);
        et_edad =findViewById(R.id.et_edad);

        rg_idioma =findViewById(R.id.rg_idioma);

        rb_español =findViewById(R.id.rb_español);
        rb_ingles =findViewById(R.id.rb_ingles);


        rg_idioma.setOnCheckedChangeListener(this);

    }


    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        if(checkedId == R.id.rb_español){
            tv_idioma.setText(R.string.idioma_es);
            rb_español.setText(R.string.español_es);
            rb_ingles.setText(R.string.ingles_es);

            tv_nombre.setText(R.string.nombre_es);
            et_nombre.setHint(R.string.escribe_nom_es);

            tv_apellido.setText(R.string.apellido_es);
            et_apellido.setHint(R.string.escribe_ape_es);

            tv_edad.setText(R.string.edad_es);
            et_edad.setHint(R.string.escribe_eda_es);



        }
        else{
            tv_idioma.setText(R.string.idioma_en);
            rb_español.setText(R.string.español_en);
            rb_ingles.setText(R.string.ingles_en);

            tv_nombre.setText(R.string.nombre_en);
            et_nombre.setHint(R.string.nombre_en);

            tv_apellido.setText(R.string.apellido_en);
            et_apellido.setHint(R.string.escribe_ape_en);

            tv_edad.setText(R.string.edad_en);
            et_edad.setHint(R.string.escribe_eda_en);
        }
    }
}
