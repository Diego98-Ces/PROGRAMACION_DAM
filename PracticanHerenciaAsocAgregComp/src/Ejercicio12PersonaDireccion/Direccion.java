package Ejercicio12PersonaDireccion;

public class Direccion {
    private String calle;
    private String ciudad;
    private String codigoPostal;

    public Direccion(String calle, String ciudad, String codigoPostal) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.codigoPostal = codigoPostal;
    }

    public void mostrarInfo() {
        System.out.println("Dirección:");
        System.out.println("Calle: " + calle);
        System.out.println("Ciudad: " + ciudad);
        System.out.println("Código Postal: " + codigoPostal);
    }

    //Método principal para las pruebas
    public static void main(String[] args) {
        Direccion direccion = new Direccion("Calle Mayor", "Madrid", "28013");
        Persona persona = new Persona("Juan Pérez", 30, direccion);

        persona.mostrarInfo();
    }
}
