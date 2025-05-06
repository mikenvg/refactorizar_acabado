package org.example;

import java.util.ArrayList;

public class Producto {
    public int numero;
    public String nombre;
    public double precio;
    public int cantidad;
    public String sku;

    public Producto(int numero, String nombre, double precio, int cantidad, String sku) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.sku = sku;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }
}

Producto producto1 = new Producto(1, "Patatas", 1.5,100, "1234");

Producto producto2 = new Producto(2, "Manzanas", 2.5, 200, "5678");

Producto producto3 = new Producto(3, "Peras", 3.5, 300, "9101");

Producto producto4 = new Producto(4, "Uvas", 4.5, 400, "1121");

Producto producto5 = new Producto(5, "Fresas", 5.5, 500, "3141");

Producto producto6 = new Producto(6, "Platanos", 6.5, 600, "5161");

Producto producto7 = new Producto(7, "Naranjas", 7.5,  700,  "7181");

Producto producto8 = new Producto(8, "Mangos",  8.5,  800, "9201");


ArrayList<Producto> productos = new ArrayList<>();
        productos.add(producto1);
        productos.add(producto2);
        productos.add(producto3);
        productos.add(producto4);
        productos.add(producto5);
        productos.add(producto6);
        productos.add(producto7);
        productos.add(producto8);