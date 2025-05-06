package org.example;

public class Cliente {
    public int numero;
    public String nombre;
    public String apellido;
    public String direccion;
    public String telefono;

    public Cliente(int numero, String nombre, String apellido, String direccion, String telefono) {
        this.numero = numero;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
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
}
Cliente cliente1 = new Cliente(1, "Carlos", "Perez", "Calle 123", "1234567");

Cliente cliente2 = new Cliente(2, "Ana", "Lopez", "Calle 456", "7654321");

Cliente cliente3 = new Cliente(3, "Pedro", "Gomez", "Calle 789", "4567890");

Cliente cliente4 = new Cliente(4, "Maria", "Garcia", "Calle 101", "0987654");
