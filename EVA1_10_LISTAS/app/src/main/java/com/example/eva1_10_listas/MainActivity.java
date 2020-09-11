package com.example.eva1_10_listas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements ListView.OnItemClickListener{

    ListView lista;
    String[] datos = {
            "Pizza", "Sushi", "Pollo", "Hamburguesas", "Atún", "Tacos", "Tamales", "Hot cakes", "Boneles", "Ensalada", "Camarones"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        lista = findViewById(R.id.lista);
        lista.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, datos));


        lista.setOnItemClickListener(this);




    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this,datos[position], Toast.LENGTH_LONG).show();
    }
}
