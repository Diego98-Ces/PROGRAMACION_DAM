package Ejercicio2FigurGeom;

public class Rectangulo extends Figura {
    private double base;
    private double altura;

    public Rectangulo(String color, String tipoBorde, double base, double altura) {
        super(color, tipoBorde);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }
}
