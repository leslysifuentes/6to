package com.example.eva2_8_activity_result;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class MyDataActivity extends AppCompatActivity implements ListView.OnItemClickListener, View.OnClickListener{
    ListView lista;
    String[] datos = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19"};
    Button cancelar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_data);
        lista = findViewById(R.id.lista);
        lista.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, datos));
        lista.setOnItemClickListener(this);

        cancelar = findViewById(R.id.cancelar);
        cancelar.setOnClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent in_datos = new Intent();
        in_datos.putExtra("aaa", datos[position]);
        setResult(Activity.RESULT_OK, in_datos);
        finish();
    }

    @Override
    public void onClick(View v) {
        setResult(Activity.RESULT_CANCELED);
        finish();
    }
}
