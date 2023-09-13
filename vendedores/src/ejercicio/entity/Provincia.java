package ejercicio.entity;

import java.util.ArrayList;
import java.util.Collection;

public class Provincia {

	// atributos
	private String nombre;
	private Collection<Ciudad> ciudades;
	
	// constructor
	public Provincia(String nombre) {
		this.nombre = nombre;
		this.ciudades = new ArrayList<Ciudad>();
	}

	// metodos
	public void agregar(Ciudad ciudad) {
		this.ciudades.add(ciudad);
	}
	
	public Boolean tieneCiudad(Ciudad ciudad) {
		return this.ciudades.contains(ciudad);
	}

	// gets
	public String getNombre() {
		return nombre;
	}

	public Collection<Ciudad> getCiudades() {
		return ciudades;
	}
}
