package Eje10InstrMusicales;

class Guitarra extends Instrumento {
    public Guitarra() {
        super("Guitarra");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando la guitarra: tirititran tran tran...");
    }
}
