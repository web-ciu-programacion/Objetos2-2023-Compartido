package ar.edu.ciu.objetos2.pattern.singleton.ejemplo2;

/**
 * Implementación más compleja, pero muy optima.
 */
public class Compania {

    private static final Compania INSTANCE = new Compania();

    private String descripcion;

    private Compania() {
        super();
        this.descripcion = "MasValeCholo";
    }

    public static Compania getInstance() {
        return INSTANCE;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String nuevaDescripcion) {
        this.descripcion = nuevaDescripcion;
    }

}
