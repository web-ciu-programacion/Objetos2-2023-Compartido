package ar.edu.ciu.objetos2.observer.pattern;

public class Candidato {
    private String descripcion;
    private Integer cantidadDeVotos;

    public void sumarVotos(Integer cantidad) {
        this.cantidadDeVotos+=cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getCantidadDeVotos() {
        return cantidadDeVotos;
    }

    public void setCantidadDeVotos(Integer cantidadDeVotos) {
        this.cantidadDeVotos = cantidadDeVotos;
    }
}
