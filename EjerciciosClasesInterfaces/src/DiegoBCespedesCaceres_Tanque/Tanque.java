package DiegoBCespedesCaceres_Tanque;

public interface Tanque {
    String disparar();
    String mover();

    default void recargar() {
        System.out.println("Recargando munición......");
        verificarMunicion();
    }

    private void verificarMunicion() {
        System.out.println("Munición verificada y lista para disparar.");
    }
}
