package com.example.eva1_11_clima;

public class Weather {
    /*Nombre de la ciudad - string
    * Temperatura - int
    * Descripción del clima - string
    * imagen - int
     */
    private String ciudad;
    private int temperatura;
    private String descripcion;
    private int imagen;

    public Weather(String ciudad, int temperatura, String descripcion, int imagen) {
        this.ciudad = ciudad;
        this.temperatura = temperatura;
        this.descripcion = descripcion;
        this.imagen = imagen;
    }

    public String getCiudad() {
        return ciudad;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getImagen() {
        return imagen;
    }
}
