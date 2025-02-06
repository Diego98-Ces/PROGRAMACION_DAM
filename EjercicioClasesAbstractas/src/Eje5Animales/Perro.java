package Eje5Animales;

class Perro extends Animal {

    // Constructor
    public Perro(String nombre) {
        super(nombre);
    }

    // Implementación del método hacerSonido
    @Override
    public void hacerSonido() {
        System.out.println("El perro " + nombre + " dice: ¡Guau!");
    }
}

