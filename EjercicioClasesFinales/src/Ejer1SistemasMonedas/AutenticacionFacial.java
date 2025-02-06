package Ejer1SistemasMonedas;

public final class AutenticacionFacial extends Autenticacion {

    // Constructor que inicializa el tipo de autenticación
    public AutenticacionFacial() {
        super("Autenticación Facial");
    }

    // Sobrescribir el método autenticar
    @Override
    public void autenticar() {
        System.out.println("Autenticando mediante reconocimiento facial...");
    }

    // Método adicional para verificar la cámara
    public void verificarCamara() {
        System.out.println("Verificando el estado de la cámara...");
    }
}
