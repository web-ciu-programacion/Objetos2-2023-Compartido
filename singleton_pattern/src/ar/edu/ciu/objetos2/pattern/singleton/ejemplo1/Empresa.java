package ar.edu.ciu.objetos2.pattern.singleton.ejemplo1;

/**
 * Implementación más sencilla, tiene la desventaja del if.
 */
public class Empresa {

    private static Empresa instance;

    private String descripcion;

    private Empresa() {
        super();
        this.descripcion = "El Capital";
    }

    public static Empresa getInstance() {
        if (instance==null) {
            instance = new Empresa();
        }
        return instance;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String nuevaDescripcion) {
        this.descripcion = nuevaDescripcion;
    }

}
