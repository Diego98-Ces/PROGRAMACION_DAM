package Ejer1SistemaSeguridad;

public final class Euro extends Moneda {

    // Constructor
    public Euro() {
        super("Euro");
    }

    // Método para convertir euros a dólares
    public double convertirADolar(double cantidad) {
        return cantidad * 1.10; // 1 euro = 1.10 dólares
    }

    // Sobrescribir el método mostrarNombre
    @Override
    public void mostrarNombre() {
        System.out.println("Moneda: Euro");
    }
}

