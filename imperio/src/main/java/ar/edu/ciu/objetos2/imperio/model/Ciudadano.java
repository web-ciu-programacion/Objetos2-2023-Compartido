package ar.edu.ciu.objetos2.imperio.model;

public abstract class Ciudadano {

    protected String nombre;
    protected String legajo;
    protected TipoCiudadano tipo;

    public Ciudadano(String nombre, String legajo, TipoCiudadano tipo) {
        super();
        this.nombre = nombre;
        this.legajo = legajo;
        this.tipo = tipo;
    }

    public String getLegajo() {
        return this.legajo;
    }

    public TipoCiudadano getTipoCiudadano() {
    	return this.tipo;
    }

    @Override
    public String toString() {
        return this.legajo + " - " + this.nombre;
    }

}
