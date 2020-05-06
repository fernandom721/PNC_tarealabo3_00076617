package com.uca.capas.domain;

import javax.validation.constraints.Size;

public class Product {

    private int id;
    private String Nombre;
    private int cantidad;

    public Product(){}

    public Product(int id, String nombre, int cantidad) {
        this.id = id;
        Nombre = nombre;
        this.cantidad = cantidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
