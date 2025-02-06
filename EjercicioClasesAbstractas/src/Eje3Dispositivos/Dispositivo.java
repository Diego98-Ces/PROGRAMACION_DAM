package Eje3Dispositivos;

abstract class Dispositivo {
    protected String nombre;

    // Constructor
    public Dispositivo(String nombre) {
        this.nombre = nombre;
    }

    // Método abstracto que debe ser implementado en las subclases
    abstract void encender();

    // Método concreto que indica que el dispositivo se está apagando
    public void apagar() {
        System.out.println("El dispositivo " + nombre + " se está apagando.");
    }

    // Método principal para las pruebas
    public static void main(String[] args) {
        // Crear instancias de Telefono y Computadora
        Dispositivo telefono = new Telefono("Samsung Galaxy");
        Dispositivo computadora = new Computadora("Dell XPS");

        // Encender y apagar los dispositivos
        telefono.encender();
        telefono.apagar();

        System.out.println();

        computadora.encender();
        computadora.apagar();
    }


}
