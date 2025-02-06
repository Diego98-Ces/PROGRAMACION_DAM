package Ejercicio5TiendaProd;

class Alimento extends Producto {
    String fechaDeCaducidad;

    public Alimento(String nombre, double precio, String fechaDeCaducidad) {
        super(nombre, precio);
        this.fechaDeCaducidad = fechaDeCaducidad;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Fecha de caducidad: " + fechaDeCaducidad);
    }
}
