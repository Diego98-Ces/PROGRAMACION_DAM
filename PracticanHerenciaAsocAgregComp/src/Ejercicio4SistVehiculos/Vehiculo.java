package Ejercicio4SistVehiculos;

public class Vehiculo {
    private String marca;
    private String modelo;
    private int velocidadMaxima;

    public Vehiculo(String marca, String modelo, int velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
    }

    public void acelerar() {

        System.out.println("El vehículo está acelerando.");
    }

    //Método principal para las pruebas
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo("Genérico", "Modelo A", 100);
        Coche coche = new Coche("Toyota", "Corolla", 180, 4);
        Moto moto = new Moto("Yamaha", "YZF-R3", 200, "Deportiva");

        vehiculo.acelerar();
        coche.acelerar();
        moto.acelerar();
    }
}
