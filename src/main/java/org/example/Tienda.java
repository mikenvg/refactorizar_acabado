package org.example;

public class Tienda {
    public int numero;
    public String direccion;
    public String telefono;

    public Tienda(int numero, String direccion, String telefono) {
        this.numero = numero;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
Tienda tienda1 = new Tienda(1, "Calle 123", "1234567");
Tienda tienda2 = new Tienda(2, "Calle 456", "7654321");

