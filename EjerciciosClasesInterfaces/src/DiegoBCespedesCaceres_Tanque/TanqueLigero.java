package DiegoBCespedesCaceres_Tanque;

class TanqueLigero implements Tanque {
    @Override
    public String disparar() {
        return "Tanque ligero disparando con cañón de bajo calibre.";
    }

    @Override
    public String mover() {
        return "Tanque ligero moviéndose rápidamente.";
    }
}
