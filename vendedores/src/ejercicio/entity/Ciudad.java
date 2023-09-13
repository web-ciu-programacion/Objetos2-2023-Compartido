package ejercicio.entity;

import java.util.Collection;
import java.util.stream.Collectors;

public class Ciudad {

	// atributos
	private String nombre;

	public Ciudad(String nombre) {
		this.nombre = nombre;
	}

	// metodos
	public Boolean tieneRedundanciaDeVendedores(Collection<Vendedor> vendedores) {
		return vendedores.stream()
							.filter(v -> v.puedeTrabajarEn(this))
							.collect(Collectors.toList())
							.size() > 1;
	}
	
	// gets
	public String getNombre() {
		return nombre;
	}
}
