package parcial.botanica.entity;

import java.util.ArrayList;
import java.util.Collection;

/*
 * Composite
 * Composite
 */
public class Rama implements Componente {

	private Collection<Componente> hijos;
	
	public Rama() {
		this.hijos = new ArrayList<Componente>();
	}

	private Rama(Rama target) {
		this();
		target.getHijos().forEach(componente -> this.hijos.add((Componente)componente.clone()));
	}

	public void agregar(Componente componente) {
		this.hijos.add(componente);
	}

	public Collection<Componente> getHijos() {
		return this.hijos;
	}

	@Override
	public Integer totalDeHojas() {
		return this.hijos.stream()
				.mapToInt(Componente::totalDeHojas)
				.sum();
		}

	@Override
	public Double cantidadDeClorofila() {
		return this.hijos.stream()
							.mapToDouble(hijo -> hijo.cantidadDeClorofila())
							.sum();
	}

	@Override
	public Prototype clone() {
		return new Rama(this);
	}
}
