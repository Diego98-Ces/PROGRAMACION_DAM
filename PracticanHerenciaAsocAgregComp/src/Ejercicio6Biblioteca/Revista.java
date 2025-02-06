package Ejercicio6Biblioteca;

class Revista extends Publicacion {
    int numeroDeEdicion;

    public Revista(String titulo, String autor, int numeroDeEdicion) {
        super(titulo, autor);
        this.numeroDeEdicion = numeroDeEdicion;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Número de edición: " + numeroDeEdicion);
    }
}
