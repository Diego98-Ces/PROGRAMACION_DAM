package Eje5Animales;

class Gato extends Animal {

    // Constructor
    public Gato(String nombre) {
        super(nombre);
    }

    // Implementación del método hacerSonido
    @Override
    public void hacerSonido() {
        System.out.println("El gato " + nombre + " dice: ¡Miau!");
    }
}

