package com.example.eva1_11_clima;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView lv_clima;
    Weather[] ciudades = {new Weather("Chihuahua", 20, "Nublado", R.drawable.light_rain),
            new Weather("Satevo", 20, "Nublado", R.drawable.light_rain),
            new Weather("Delicias", -5, "Despejado", R.drawable.sunny),
            new Weather("Cd. Juárez", -3, "Nevadas intensas", R.drawable.snow),
            new Weather("Jimenez", 19, "Lluvias intensas", R.drawable.rainy),
            new Weather("Camargo", 5, "Niebla", R.drawable.cloudy),
            new Weather("Parral", 9, "Nevado", R.drawable.snow),
            new Weather("Aldama", 25, "Despejado", R.drawable.atmospher),
            new Weather("Batoplilas", -12, "Despejado", R.drawable.sunny),
            new Weather("Creel", 16, "Nublado", R.drawable.light_rain),
            new Weather("Casas Grandes", 0, "Lluvias intensas", R.drawable.tornado) };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv_clima = findViewById(R.id.lv_clima);
        lv_clima.setAdapter(new WeatherAdapter(this,R.layout.mi_layout, ciudades));





    }
}
