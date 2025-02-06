package Eje1Vehiculo;

class Coche extends Vehiculo {

    // Constructor
    public Coche(String marca) {
        super(marca);
    }

    // Implementación del método conducir
    @Override
    public void conducir() {
        System.out.println("El coche de marca " + marca + " está en movimiento.");
    }
}

