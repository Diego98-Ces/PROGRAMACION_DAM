package Eje1Vehiculo;

class Moto extends Vehiculo {

    // Constructor
    public Moto(String marca) {
        super(marca);
    }

    // Implementación del método conducir
    @Override
    public void conducir() {
        System.out.println("La moto de marca " + marca + " está acelerando.");
    }
}

