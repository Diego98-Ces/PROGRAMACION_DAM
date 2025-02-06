package Ejercicio2FigurGeom;

public class Figura {
    private String color;
    private String tipoBorde;

    public Figura(String color, String tipoBorde) {
        this.color = color;
        this.tipoBorde = tipoBorde;
    }

    public double calcularArea() {

        return 0.0;
    }

    //Método principal para las pruebas
    public static void main(String[] args) {
        Circulo circulo = new Circulo("Rojo", "Liso", 5.0);
        Rectangulo rectangulo = new Rectangulo("Azul", "Punteado", 4.0, 6.0);

        System.out.println("Área del círculo: " + circulo.calcularArea());
        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
    }

}
