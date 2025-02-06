package Eje1Vehiculo;

abstract class Vehiculo {
    protected String marca;

    // Constructor
    public Vehiculo(String marca) {
        this.marca = marca;
    }

    // Método abstracto que debe ser implementado por las subclases
    abstract void conducir();

    // Método concreto que muestra un mensaje cuando el vehículo frena
    public void frenar() {
        System.out.println("El vehículo de marca " + marca + " está frenando.");
    }

    // Método principal para las pruebas
    public static void main(String[] args) {
        // Crear instancias de Coche y Moto
        Vehiculo coche = new Coche("Toyota");
        Vehiculo moto = new Moto("Yamaha");

        // Llamar a los métodos de cada vehículo
        coche.conducir();
        coche.frenar();

        System.out.println();

        moto.conducir();
        moto.frenar();
    }

}
