package ar.edu.ciu.objetos2.composite.model;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Composite Composite
 *
 */
public class Corporativa implements Cuenta {

	private List<Cuenta> cuentas;

	public Corporativa() {
		super();
		this.cuentas = new ArrayList<Cuenta>();
	}

	@Override
	public Double saldo() {
		return this.cuentas.stream()
								.mapToDouble( cuenta -> cuenta.saldo())
								.sum();
	}

	public void add(Cuenta cuenta) {
		this.cuentas.add(cuenta);
	}

}
