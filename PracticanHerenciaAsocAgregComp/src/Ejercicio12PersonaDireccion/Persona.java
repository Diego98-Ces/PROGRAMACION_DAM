package Ejercicio12PersonaDireccion;

class Persona {
    private String nombre;
    private int edad;
    private Direccion direccion;

    public Persona(String nombre, int edad, Direccion direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
    }

    public void mostrarInfo() {
        System.out.println("Persona:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        direccion.mostrarInfo();
    }
}
