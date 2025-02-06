package Ejer1SistemaSeguridad;

public final class Dolar extends Moneda {

    // Constructor
    public Dolar() {
        super("Dólar");
    }

    // Método para convertir dólares a euros
    public double convertirAEuro(double cantidad) {
        return cantidad * 0.91; // 1 dólar = 0.91 euros
    }

    // Sobrescribir el método mostrarNombre
    @Override
    public void mostrarNombre() {
        System.out.println("Moneda: Dólar");
    }
}

