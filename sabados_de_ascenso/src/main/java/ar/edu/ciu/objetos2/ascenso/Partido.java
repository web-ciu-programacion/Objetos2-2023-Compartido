package ar.edu.ciu.objetos2.ascenso;

public class Partido {

    private String equipoLocal;
    private String equipoVisitante;

    public Partido(String local, String visitante) {
        super();
        this.equipoLocal = local;
        this.equipoVisitante = visitante;
    }

    @Override
    public String toString() {
        return this.equipoLocal + " vs. " + this.equipoVisitante;
    }

    public String getEquipoLocal() {
        return equipoLocal;
    }

    public String getEquipoVisitante() {
        return equipoVisitante;
    }
}
