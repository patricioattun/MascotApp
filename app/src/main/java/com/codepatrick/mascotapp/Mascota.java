package com.codepatrick.mascotapp;

public class Mascota {
    private String nombre;
    private int rank;
    private int imagen;

    public Mascota(String nombre, int rank, int imagen) {
        this.nombre = nombre;
        this.rank = rank;
        this.imagen = imagen;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
}
