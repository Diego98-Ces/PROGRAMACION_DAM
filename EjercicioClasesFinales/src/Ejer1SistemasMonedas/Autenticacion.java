package Ejer1SistemasMonedas;

public class Autenticacion {
    protected String tipo;

    // Constructor
    public Autenticacion(String tipo) {
        this.tipo = tipo;
    }

    // Método para autenticar mensaje genérico
    public void autenticar() {
        System.out.println("Autenticando mediante " + tipo + "...");
    }

    // Método principal para pruebas
    public static void main(String[] args) {
        // Crear instancias de autenticación
        HuellaDigital huella = new HuellaDigital();
        AutenticacionFacial facial = new AutenticacionFacial();

        // Llamar a los métodos de autenticación
        huella.autenticar();
        huella.verificarSensor();

        facial.autenticar();
        facial.verificarCamara();
    }

}
