package Eje2FigurasGeom;

class Circulo extends Figura {
    private double radio;

    // Constructor
    public Circulo(double radio) {
        this.radio = radio;
    }

    // Implementación del método calcularArea
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}

