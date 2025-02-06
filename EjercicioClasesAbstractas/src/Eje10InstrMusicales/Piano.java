package Eje10InstrMusicales;

class Piano extends Instrumento {
    public Piano() {
        super("Piano");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando el piano: tinoninoninoní toninoni...");
    }
}
