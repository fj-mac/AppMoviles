package com.example.tuparquej;

public class Entidad {
    private int imgFoto;
    private String nombre;
    private String barrio;
    private int estrellas;
    private int distancia;

    public Entidad(int imgFoto, String nombre, String barrio, int estrellas, int distancia) {
        this.imgFoto = imgFoto;
        this.nombre = nombre;
        this.barrio = barrio;
        this.estrellas = estrellas;
        this.distancia = distancia;
    }

    public int getImgFoto() {
        return imgFoto;
    }

    public String getNombre() {
        return nombre;
    }

    public String getBarrio() {
        return barrio;
    }

    public int getEstrellas() {
        return estrellas;
    }

    public int getDistancia() {
        return distancia;
    }
}
