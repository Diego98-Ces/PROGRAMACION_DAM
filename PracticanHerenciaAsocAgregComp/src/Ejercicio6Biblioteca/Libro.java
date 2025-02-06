package Ejercicio6Biblioteca;

class Libro extends Publicacion {
    int numeroDePaginas;

    public Libro(String titulo, String autor, int numeroDePaginas) {
        super(titulo, autor);
        this.numeroDePaginas = numeroDePaginas;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Número de páginas: " + numeroDePaginas);
    }
}
