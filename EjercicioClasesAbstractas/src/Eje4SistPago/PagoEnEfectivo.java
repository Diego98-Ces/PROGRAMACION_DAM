package Eje4SistPago;

class PagoEnEfectivo extends Pago {

    // Constructor
    public PagoEnEfectivo(double cantidadDinero) {
        super(cantidadDinero);
    }

    // Implementación del método procesarPago
    @Override
    public void procesarPago() {
        System.out.println("Pago de $" + cantidadDinero + " realizado en efectivo.");
    }
}

