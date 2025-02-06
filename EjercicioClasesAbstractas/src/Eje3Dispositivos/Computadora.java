package Eje3Dispositivos;

class Computadora extends Dispositivo {

    // Constructor
    public Computadora(String nombre) {
        super(nombre);
    }

    // Implementación del método encender
    @Override
    public void encender() {
        System.out.println("La computadora " + nombre + " está iniciando el sistema.");
    }
}
