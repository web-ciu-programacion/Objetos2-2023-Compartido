package ar.edu.ciu.objetos2.imperio.model;

public class Gobernante extends Ciudadano {

    private String cargo;

    public Gobernante(String nombre, String legajo, String cargo) {
        super(nombre, legajo, TipoCiudadano.GOBERNANTE);
        this.cargo = cargo;
    }

    public String getCargo() {
    	return this.cargo;
    }
}
