package Ejercicio10ComputadoraCompon;

class Memoria {
    String tipo;
    int capacidad;

    public Memoria(String tipo, int capacidad) {
        this.tipo = tipo;
        this.capacidad = capacidad;
    }

    public void mostrarInfo() {
        System.out.println("Memoria:");
        System.out.println("Tipo: " + tipo);
        System.out.println("Capacidad: " + capacidad + " GB");
    }
}
