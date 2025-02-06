package Ejercicio10ComputadoraCompon;

class Computadora {
    String modelo;
    Procesador procesador;
    Memoria memoria;

    public Computadora(String modelo, Procesador procesador, Memoria memoria) {
        this.modelo = modelo;
        this.procesador = procesador;
        this.memoria = memoria;
    }

    public void mostrarInfo() {
        System.out.println("Computadora Modelo: " + modelo);
        procesador.mostrarInfo();
        memoria.mostrarInfo();
    }

    //Método principal para las pruebas
    public static void main(String[] args) {
        Procesador procesador = new Procesador("Intel", 3.5);
        Memoria memoria = new Memoria("DDR4", 16);
        Computadora computadora = new Computadora("HP Envy", procesador, memoria);

        computadora.mostrarInfo();
    }
}
