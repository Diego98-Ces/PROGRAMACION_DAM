package Eje2FigurasGeom;

abstract class Figura {
    // Método abstracto para calcular el área
    abstract double calcularArea();

    // Método concreto para mostrar información
    public void mostrar() {
        System.out.println("Esto es una figura.");
    }


    // Método principal para las pruebas
    public static void main(String[] args) {
        // Crear instancias de Circulo y Rectangulo
        Figura circulo = new Circulo(5);
        Figura rectangulo = new Rectangulo(4, 6);

        // Mostrar información y calcular áreas
        circulo.mostrar();
        System.out.println("Área del círculo: " + circulo.calcularArea());

        System.out.println();

        rectangulo.mostrar();
        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
    }
}
