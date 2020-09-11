package com.example.eva1_11_clima;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class WeatherAdapter extends ArrayAdapter<Weather> {
    Weather[] objects;
    Context context;
    int resource;





    public WeatherAdapter(@NonNull Context context, int resource, @NonNull Weather[] objects) {
        super(context, resource, objects);
        this.objects = objects;
        this.context = context;
        this.resource = resource;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
//convertview representa el layout
        if(convertView == null) { //Primera vez, hay que crear el layout

            convertView = ((Activity)context).getLayoutInflater().inflate(resource,parent, false);


        }
//hay que recuperar los componentes
        ImageView iv_weather;
        TextView tv_ciudad, tv_temperatura, tv_descripcion;

        iv_weather = convertView.findViewById(R.id.iv_weather);
        tv_ciudad = convertView.findViewById(R.id.tv_ciudad);
        tv_temperatura = convertView.findViewById(R.id.tv_temperatura);
        tv_descripcion = convertView.findViewById(R.id.tv_descripcion);

        iv_weather.setImageResource(objects[position].getImagen());
        tv_ciudad.setText(objects[position].getCiudad());
        tv_temperatura.setText(""+objects[position].getTemperatura());
        tv_descripcion.setText(objects[position].getDescripcion());

        return convertView;


    }






}



