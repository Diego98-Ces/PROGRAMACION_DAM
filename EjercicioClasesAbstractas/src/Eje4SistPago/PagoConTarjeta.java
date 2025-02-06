package Eje4SistPago;

class PagoConTarjeta extends Pago {
    private String numeroTarjeta;

    // Constructor
    public PagoConTarjeta(double cantidadDinero, String numeroTarjeta) {
        super(cantidadDinero);
        this.numeroTarjeta = numeroTarjeta;
    }

    // Implementación del método procesarPago
    @Override
    public void procesarPago() {
        System.out.println("Procesando pago de $" + cantidadDinero + " con tarjeta N° " + numeroTarjeta);
    }
}

