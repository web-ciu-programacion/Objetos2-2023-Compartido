package ciu.objetos2.paquete.model;

import java.util.ArrayList;
import java.util.Collection;

public class Paquete implements Componente {

	private Collection<Componente> componentes;
	
	public Paquete() {
		this.componentes = new ArrayList<Componente>();
	}

	private Paquete(Paquete target) {
		this();
		target.componentes.forEach(c -> this.componentes.add( (Componente)c.clone() ));
	}

	public void agregar(Componente componente) {
		this.componentes.add(componente);
	}

	@Override
	public Integer cantidadDeSorpresas() {
		return this.componentes.stream()
								.mapToInt(Componente::cantidadDeSorpresas)
								.sum();
	}

	@Override
	public Double costoTotal() {
		return this.componentes.stream()
				.mapToDouble(componente -> componente.costoTotal())
				.sum();
	}
	
	@Override
	public Prototype clone() {
		return new Paquete(this);
	}
}
