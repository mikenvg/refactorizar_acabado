package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        while (true) {
            System.out.println("1. Mostrar información de todas las tiendas");
            System.out.println("2. Mostrar información de todos los trabajadores");
            System.out.println("3. Mostrar productos disponibles");
            System.out.println("4. Últimos 3 productos añadidos");
            System.out.println("5. Comprar productos");
            System.out.println("6. Salir");
            System.out.print("Ingrese la opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Información de la tienda 1");
                    System.out.println("Dirección: " + tienda1.direccion);
                    System.out.println("Teléfono: " + tienda1.telefono);
                    System.out.println("Información de la tienda 2");
                    System.out.println("Dirección: " + tienda2.direccion);
                    System.out.println("Teléfono: " + tienda2.telefono);
                    System.out.println("-----------------------------------");
                    System.out.println("Tiendas disponibles: " + tienda1.direccion + ", " + tienda2.direccion);
                    break;
                case 2:
                    System.out.println("Información del trabajador 1");
                    System.out.println("Nombre: " + trabajador1.nombre);
                    System.out.println("Apellido: " + trabajador1.apellido);
                    System.out.println("Dirección: " + trabajador1.direccion);
                    System.out.println("Teléfono: " + trabajador1.telefono);
                    System.out.println("Tienda: " + trabajador1.tienda.direccion);
                    System.out.println("-----------------------------------");
                    System.out.println("Información del trabajador 2");
                    System.out.println("Nombre: " + trabajador2.nombre);
                    System.out.println("Apellido: " + trabajador2.apellido);
                    System.out.println("Dirección: " + trabajador2.direccion);
                    System.out.println("Teléfono: " + trabajador2.telefono);
                    System.out.println("Tienda: " + trabajador2.tienda.direccion);
                    System.out.println("-----------------------------------");
                    System.out.println("Información del trabajador 3");
                    System.out.println("Nombre: " + trabajador3.nombre);
                    System.out.println("Apellido: " + trabajador3.apellido);
                    System.out.println("Dirección: " + trabajador3.direccion);
                    System.out.println("Teléfono: " + trabajador3.telefono);
                    System.out.println("Tienda: " + trabajador3.tienda.direccion);
                    System.out.println("-----------------------------------");
                    System.out.println("Información del trabajador 4");
                    System.out.println("Nombre: " + trabajador4.nombre);
                    System.out.println("Apellido: " + trabajador4.apellido);
                    System.out.println("Dirección: " + trabajador4.direccion);
                    System.out.println("Teléfono: " + trabajador4.telefono);
                    System.out.println("Tienda: " + trabajador4.tienda.direccion);
                    System.out.println("-----------------------------------");
                    System.out.println("Tiendas disponibles: " + tienda1.direccion + ", " + tienda2.direccion);

                    break;
                case 3:
                    // Aquí va el código para mostrar los productos disponibles
                    System.out.println("Productos disponibles:");
                    System.out.println("Producto 1:");
                    System.out.println("Nombre: " + producto1.nombre);
                    System.out.println("Precio: " + producto1.precio);
                    System.out.println("Cantidad: " + producto1.cantidad);
                    System.out.println("SKU: " + producto1.sku);
                    System.out.println("-----------------------------------");
                    System.out.println("Producto 2:");
                    System.out.println("Nombre: " + producto2.nombre);
                    System.out.println("Precio: " + producto2.precio);
                    System.out.println("Cantidad: " + producto2.cantidad);
                    System.out.println("SKU: " + producto2.sku);
                    System.out.println("-----------------------------------");
                    System.out.println("Producto 3:");
                    System.out.println("Nombre: " + producto3.nombre);
                    System.out.println("Precio: " + producto3.precio);
                    System.out.println("Cantidad: " + producto3.cantidad);
                    System.out.println("SKU: " + producto3.sku);
                    System.out.println("-----------------------------------");
                    System.out.println("Producto 4:");
                    System.out.println("Nombre: " + producto4.nombre);
                    System.out.println("Precio: " + producto4.precio);
                    System.out.println("Cantidad: " + producto4.cantidad);
                    System.out.println("SKU: " + producto4.sku);
                    System.out.println("-----------------------------------");
                    System.out.println("Producto 5:");
                    System.out.println("Nombre: " + producto5.nombre);
                    System.out.println("Precio: " + producto5.precio);
                    System.out.println("Cantidad: " + producto5.cantidad);
                    System.out.println("SKU: " + producto5.sku);
                    System.out.println("-----------------------------------");
                    System.out.println("Producto 6:");
                    System.out.println("Nombre: " + producto6.nombre);
                    System.out.println("Precio: " + producto6.precio);
                    System.out.println("Cantidad: " + producto6.cantidad);
                    System.out.println("SKU: " + producto6.sku);
                    System.out.println("Producto 7:");
                    System.out.println("Nombre: " + producto7.nombre);
                    System.out.println("Precio: " + producto7.precio);
                    System.out.println("Cantidad: " + producto7.cantidad);
                    System.out.println("SKU: " + producto7.sku);
                    System.out.println("-----------------------------------");
                    System.out.println("Producto 8:");
                    System.out.println("Nombre: " + producto8.nombre);
                    System.out.println("Precio: " + producto8.precio);
                    System.out.println("Cantidad: " + producto8.cantidad);
                    System.out.println("SKU: " + producto8.sku);
                    System.out.println("-----------------------------------");
                    System.out.println("Tiendas disponibles: " + tienda1.direccion + ", " + tienda2.direccion);

                    break;
                case 4:
                    // Aquí va el código para mostrar los últimos 3 productos añadidos
                    System.out.println("Últimos 3 productos añadidos:");
                    System.out.println("Producto 6:");
                    System.out.println("Nombre: " + producto6.nombre);
                    System.out.println("Precio: " + producto6.precio);
                    System.out.println("Cantidad: " + producto6.cantidad);
                    System.out.println("SKU: " + producto6.sku);
                    System.out.println("-----------------------------------");
                    System.out.println("Producto 7:");
                    System.out.println("Nombre: " + producto7.nombre);
                    System.out.println("Precio: " + producto7.precio);
                    System.out.println("Cantidad: " + producto7.cantidad);
                    System.out.println("SKU: " + producto7.sku);
                    System.out.println("-----------------------------------");
                    System.out.println("Producto 8:");
                    System.out.println("Nombre: " + producto8.nombre);
                    System.out.println("Precio: " + producto8.precio);
                    System.out.println("Cantidad: " + producto8.cantidad);
                    System.out.println("SKU: " + producto8.sku);
                    System.out.println("-----------------------------------");
                    System.out.println("Tiendas disponibles: " + tienda1.direccion + ", " + tienda2.direccion);

                    break;
                case 5:
                    // Aquí va el código para comprar productos
                    System.out.println("Comprando productos...");
                    System.out.println("Ingrese el SKU del producto que desea comprar: ");
                    String sku = scanner.next();
                    System.out.println("Ingrese la cantidad que desea comprar: ");
                    int cantidad = scanner.nextInt();
                    for (Producto producto : productos) {
                        if (producto.sku.equals(sku)) {
                            if (producto.cantidad >= cantidad) {
                                System.out.println("Compra exitosa!");
                                System.out.println("Tiendas disponibles: " + tienda1.direccion + ", " + tienda2.direccion);
                                producto.cantidad -= cantidad;
                            } else {
                                System.out.println("No hay suficiente cantidad de este producto.");
                            }
                            break;
                        }
                    }
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
            }
        }
    }



}