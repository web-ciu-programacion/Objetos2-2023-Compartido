package ciu.objetos2.cuantabancaria.entity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class Banco {

	private Collection<Cuenta> cuentas;
	
	public Banco() {
		this.cuentas = new ArrayList<Cuenta>();
	}
	
	public void agregar(Cuenta cuenta) {
		this.cuentas.add(cuenta);
	}
	
	public Collection<Cuenta> getCuentasEmbargadas() {
		return this.cuentas.stream()
								.filter(cuenta -> cuenta.getEstado()==Embargada.getInstance())
								.collect(Collectors.toList());
	}

	public Collection<Cuenta> getCuentas() {
		return cuentas;
	}
}
