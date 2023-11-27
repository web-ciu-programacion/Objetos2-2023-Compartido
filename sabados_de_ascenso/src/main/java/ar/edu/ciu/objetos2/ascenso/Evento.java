package ar.edu.ciu.objetos2.ascenso;

public class Evento {

    private Partido partipo;
    private Integer minuto;
    private String descripcion;

    public Evento(Partido partido, Integer minuto, String descripcion) {
        super();
        this.partipo = partido;
        this.minuto = minuto;
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return this.descripcion + " al minuto: " + this.minuto + " (" + this.partipo.toString() + ")";
    }

    public Partido getPartipo() {
        return partipo;
    }

    public Integer getMinuto() {
        return minuto;
    }

    public String getDescripcion() {
        return descripcion;
    }

}
