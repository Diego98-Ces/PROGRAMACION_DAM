package Ejercicio4SistVehiculos;

public class Coche extends Vehiculo {
    private int numeroDePuertas;

    public Coche(String marca, String modelo, int velocidadMaxima, int numeroDePuertas) {
        super(marca, modelo, velocidadMaxima);
        this.numeroDePuertas = numeroDePuertas;
    }

    @Override
    public void acelerar() {
        System.out.println("El coche está acelerando rápidamente.");
    }
}
