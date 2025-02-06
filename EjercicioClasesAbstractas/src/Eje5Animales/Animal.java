package Eje5Animales;

abstract class Animal {
    protected String nombre;

    // Constructor
    public Animal(String nombre) {
        this.nombre = nombre;
    }

    // Método abstracto que debe ser implementado en las subclases
    abstract void hacerSonido();

    // Método concreto que indica que el animal está comiendo
    public void comer() {
        System.out.println("El animal " + nombre + " está comiendo.");
    }

    // Método principal para probar los animales
    public static void main(String[] args) {
        // Crear instancias de Perro y Gato
        Animal perro = new Perro("Firulais");
        Animal gato = new Gato("Michi");

        // Llamar a los métodos de cada animal
        perro.hacerSonido();
        perro.comer();

        System.out.println();

        gato.hacerSonido();
        gato.comer();
    }


}
