package ar.edu.ciu.objetos2.teoria.interfaces.model;

import java.time.LocalDate;

public class Perro extends Mascota implements Vendible {

    private String raza;
    private LocalDate edadLimiteCachorro;
    private Boolean tienePapeles;

    @Override
    protected Boolean estaEnPesoPromedio() {
        return null;
    }

    @Override
    public Double getPrecioBase() {
        return null;
    }

    @Override
    public Double getPrecioFinal() {
        return null;
    }

    @Override
    public Boolean getEdadOptima() {
        return null;
    }

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public LocalDate getEdadLimiteCachorro() {
		return edadLimiteCachorro;
	}

	public void setEdadLimiteCachorro(LocalDate edadLimiteCachorro) {
		this.edadLimiteCachorro = edadLimiteCachorro;
	}

	public Boolean getTienePapeles() {
		return tienePapeles;
	}

	public void setTienePapeles(Boolean tienePapeles) {
		this.tienePapeles = tienePapeles;
	}
}
