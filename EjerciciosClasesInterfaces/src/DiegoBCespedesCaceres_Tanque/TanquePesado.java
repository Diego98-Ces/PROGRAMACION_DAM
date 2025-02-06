package DiegoBCespedesCaceres_Tanque;

class TanquePesado implements Tanque {
    @Override
    public String disparar() {
        return "Tanque pesado disparando con cañón de alto calibre.";
    }

    @Override
    public String mover() {
        return "Tanque pesado avanzando lentamente.";
    }
}
