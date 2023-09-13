package ar.edu.ciu.objetos2.composite.model;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Composite Client
 *
 */
public class Banco {

	private String descripcion;
	private Double reserva;
	private List<Cuenta> cuentas;

	public Banco(Double reserva) {
		super();
		this.reserva = reserva;
	}

	public boolean estaEnPeligroDeQuiebra() {
		Double balance = this.balance();
		return balance<0 &&
					(balance*(-1))>((this.reserva*60)/100);
	}

	public void add(Cuenta cuenta) {
		if (this.cuentas==null)
			this.cuentas = new ArrayList<>();
		this.cuentas.add(cuenta);
	}

	public Double balance() {
		return this.cuentas.stream()
				.mapToDouble( cuenta -> cuenta.saldo())
				.sum();
	}

	public String getNombreAlReves() {
		return StringUtils.reverse(this.descripcion);
	}

}
