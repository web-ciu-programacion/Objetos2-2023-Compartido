package ejercicio.entity;

import java.util.ArrayList;
import java.util.Collection;

public class VendedorViajante extends Vendedor {

	// atributos
	private Collection<Provincia> provinciasHabilitadas;
	
	// constructores
	public VendedorViajante() {
		this.provinciasHabilitadas = new ArrayList<Provincia>();
	}

	// metodos
	public void agregar(Provincia provincia) {
		this.provinciasHabilitadas.add(provincia);
	}
	
	@Override
	public Boolean puedeTrabajarEn(Ciudad ciudad) {
		return this.provinciasHabilitadas.stream()
											.anyMatch(p -> p.tieneCiudad(ciudad));
	}
}
