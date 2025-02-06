package Ejercicio11AutomovilMotor;

public class Motor {
    private int cilindros;
    private int potencia;

    public Motor(int cilindros, int potencia) {
        this.cilindros = cilindros;
        this.potencia = potencia;
    }

    public void mostrarInfo() {
        System.out.println("Motor:");
        System.out.println("Cilindros: " + cilindros);
        System.out.println("Potencia: " + potencia + " HP");
    }
}
