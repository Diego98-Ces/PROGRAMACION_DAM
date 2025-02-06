package Eje3Dispositivos;

class Telefono extends Dispositivo {

    // Constructor
    public Telefono(String nombre) {
        super(nombre);
    }

    // Implementación del método encender
    @Override
    public void encender() {
        System.out.println("El teléfono " + nombre + " se está encendiendo.");
    }
}

