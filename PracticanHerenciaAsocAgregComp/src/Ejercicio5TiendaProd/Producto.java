package Ejercicio5TiendaProd;

public class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public void mostrarInfo() {
        System.out.println("Producto: " + nombre);
        System.out.println("Precio: $" + precio);
    }

    //Método principal para las pruebas
    public static void main(String[] args) {
        Electronico televisor = new Electronico("Televisor", 500.00, 24);
        Alimento pan = new Alimento("Pan", 1.50, "2025-02-15");

        televisor.mostrarInfo();
        System.out.println();
        pan.mostrarInfo();
    }
}
