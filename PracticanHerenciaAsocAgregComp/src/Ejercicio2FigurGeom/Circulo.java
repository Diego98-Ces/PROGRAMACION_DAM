package Ejercicio2FigurGeom;

public class Circulo extends Figura {
    private double radio;

    public Circulo(String color, String tipoBorde, double radio) {
        super(color, tipoBorde);
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }
}
