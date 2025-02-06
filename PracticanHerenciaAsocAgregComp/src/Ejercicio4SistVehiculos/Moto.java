package Ejercicio4SistVehiculos;

public class Moto extends Vehiculo {
    private String tipoDeMoto;

    public Moto(String marca, String modelo, int velocidadMaxima, String tipoDeMoto) {
        super(marca, modelo, velocidadMaxima);
        this.tipoDeMoto = tipoDeMoto;
    }

    @Override
    public void acelerar() {
        System.out.println("La moto está acelerando con agilidad.");
    }
}
