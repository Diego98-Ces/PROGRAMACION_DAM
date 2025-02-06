package Ejercicio10ComputadoraCompon;

public class Procesador {
    private String marca;
    private double velocidad;

    public Procesador(String marca, double velocidad) {
        this.marca = marca;
        this.velocidad = velocidad;
    }

    public void mostrarInfo() {
        System.out.println("Procesador:");
        System.out.println("Marca: " + marca);
        System.out.println("Velocidad: " + velocidad + " GHz");
    }
}
