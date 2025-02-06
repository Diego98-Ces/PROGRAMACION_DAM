package Ejercicio5TiendaProd;

class Electronico extends Producto {
    int garantia; // Garantía en meses

    public Electronico(String nombre, double precio, int garantia) {
        super(nombre, precio);
        this.garantia = garantia;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Garantía: " + garantia + " meses");
    }
}
