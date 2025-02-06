package Ejercicio6Biblioteca;

public class Publicacion {
    private String titulo;
    private String autor;

    public Publicacion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public void mostrarInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
    }

    //Método principal para las pruebas
    public static void main(String[] args) {
        Libro libro = new Libro("1984", "George Orwell", 328);
        Revista revista = new Revista("National Geographic", "Varios", 2025);

        libro.mostrarInfo();
        System.out.println();
        revista.mostrarInfo();
    }
}
