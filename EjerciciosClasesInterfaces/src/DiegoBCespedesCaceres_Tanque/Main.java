package DiegoBCespedesCaceres_Tanque;

public class Main {
    public static void main(String[] args) {
        System.out.println("[TANQUE LIGERO]");
        Tanque ligero = new TanqueLigero();
        System.out.println(ligero.mover());
        System.out.println(ligero.disparar());
        ligero.recargar();

        System.out.println();

        System.out.println("[TANQUE PESADO]");
        Tanque pesado = new TanquePesado();
        System.out.println(pesado.mover());
        System.out.println(pesado.disparar());
        pesado.recargar();
    }
}
