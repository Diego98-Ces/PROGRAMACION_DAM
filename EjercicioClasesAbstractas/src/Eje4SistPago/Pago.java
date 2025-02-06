package Eje4SistPago;

abstract class Pago {
    protected double cantidadDinero;

    // Constructor
    public Pago(double cantidadDinero) {
        this.cantidadDinero = cantidadDinero;
    }

    // Método abstracto que debe ser implementado en las subclases
    abstract void procesarPago();

    // Método concreto que muestra la cantidad de dinero a pagar
    public void mostrarCantidad() {
        System.out.println("Cantidad a pagar: $" + cantidadDinero);
    }

    // Método principal para las pruebas
    public static void main(String[] args) {
        // Crear instancias de PagoConTarjeta y PagoEnEfectivo
        Pago pagoTarjeta = new PagoConTarjeta(100.50, "1234-5678-9012-3456");
        Pago pagoEfectivo = new PagoEnEfectivo(50.00);

        // Mostrar cantidades y procesar pagos
        pagoTarjeta.mostrarCantidad();
        pagoTarjeta.procesarPago();

        System.out.println();

        pagoEfectivo.mostrarCantidad();
        pagoEfectivo.procesarPago();
    }


}
