package com.example.eva2_7_bundles_extras;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button button;
    EditText editText;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        editText = findViewById(R.id.editText);
        button.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        intent = new Intent(this,Secondary.class);
        String cadena = editText.getText().toString();

        Bundle bundle = new Bundle();
        bundle.putString("bundle", cadena);
        bundle.putInt("Entero", 4);

        intent.putExtra("Datos",cadena);
        intent.putExtra("num",4.4);

        intent.putExtras(bundle);

        startActivity(intent);
    }
}
