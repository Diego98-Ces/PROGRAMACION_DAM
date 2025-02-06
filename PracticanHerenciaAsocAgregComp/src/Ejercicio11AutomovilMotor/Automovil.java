package Ejercicio11AutomovilMotor;

class Automovil {
    String marca;
    String modelo;
    Motor motor;

    public Automovil(String marca, String modelo, Motor motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
    }

    public void mostrarInfo() {
        System.out.println("Automóvil:");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        motor.mostrarInfo();
    }

    //Método principal para las pruebas
    public static void main(String[] args) {
        Motor motor = new Motor(6, 300);
        Automovil automovil = new Automovil("Ford", "Mustang", motor);

        automovil.mostrarInfo();
    }
}
