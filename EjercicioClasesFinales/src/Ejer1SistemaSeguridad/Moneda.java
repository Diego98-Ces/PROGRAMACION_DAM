package Ejer1SistemaSeguridad;

public class Moneda {
    protected String nombre;

    // Constructor
    public Moneda(String nombre) {
        this.nombre = nombre;
    }

    // Método para mostrar el nombre de la moneda
    public void mostrarNombre() {
        System.out.println("Moneda: " + nombre);
    }

    // Método principal para las pruebas
    public static void main(String[] args) {
        // Crear instancias de las monedas
        Euro euro = new Euro();
        Dolar dolar = new Dolar();

        // Mostrar nombres de las monedas
        euro.mostrarNombre();
        dolar.mostrarNombre();

        // Convertir cantidades
        double cantidadEuros = 50;
        double cantidadDolares = 50;

        System.out.println(cantidadEuros + " euros son " + euro.convertirADolar(cantidadEuros) + " dólares.");
        System.out.println(cantidadDolares + " dólares son " + dolar.convertirAEuro(cantidadDolares) + " euros.");
    }

}

