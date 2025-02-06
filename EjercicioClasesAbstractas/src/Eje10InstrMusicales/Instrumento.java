package Eje10InstrMusicales;

abstract class Instrumento {
    protected String tipo;

    public Instrumento(String tipo) {
        this.tipo = tipo;
    }

    public abstract void tocar();

    public void afinar() {
            System.out.println("El " + tipo + " está siendo afinado.");
    }

    public static void main(String[] args) {
        Instrumento guitarra = new Guitarra();
        Instrumento piano = new Piano();

        guitarra.afinar();
        guitarra.tocar();
        System.out.println();

        piano.afinar();
        piano.tocar();
    }
}
