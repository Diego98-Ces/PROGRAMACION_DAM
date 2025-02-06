package Eje2FigurasGeom;

class Rectangulo extends Figura {
    private double base, altura;

    // Constructor
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Implementación del método calcularArea
    @Override
    public double calcularArea() {
        return base * altura;
    }
}

