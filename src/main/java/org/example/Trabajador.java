package org.example;

public class Trabajador {
    public int numero;
    public String nombre;
    public String apellido;
    public String direccion;
    public String telefono;
    public Tienda tienda;

    public Trabajador(int numero, String nombre, String apellido, String direccion, String telefono, Tienda tienda) {
        this.numero = numero;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.tienda = tienda;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
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

    public Tienda getTienda() {
        return tienda;
    }

    public void setTienda(Tienda tienda) {
        this.tienda = tienda;
    }

    public String toString() {
        return "Nombre: " + nombre + "\nApellido: " + apellido + "\nDireccion: " + direccion + "\nTelefono: " + telefono;
    }
}
Trabajador trabajador1 = new Trabajador(1, "Juan", "Perez", "Calle 123", "1234567", tienda1);

Trabajador trabajador2 = new Trabajador(2, "Maria", "Lopez", "Calle 456", "7654321", tienda1);

Trabajador trabajador3 = new Trabajador(3, "Pedro", "Gomez", "Calle 789", "4567890", tienda2);

Trabajador trabajador4 = new Trabajador(4, "Ana", "Garcia", "Calle 101", "0987654", tienda2);
