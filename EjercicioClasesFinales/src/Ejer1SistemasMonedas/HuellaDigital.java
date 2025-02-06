package Ejer1SistemasMonedas;

public final class HuellaDigital extends Autenticacion {

    // Constructor que inicializa el tipo de autenticación
    public HuellaDigital() {
        super("Huella Digital");
    }

    // Sobrescribir el método autenticar
    @Override
    public void autenticar() {
        System.out.println("Autenticando mediante huella digital...");
    }

    // Método adicional para verificar el sensor
    public void verificarSensor() {
        System.out.println("Verificando el estado del sensor de huella digital...");
    }
}

