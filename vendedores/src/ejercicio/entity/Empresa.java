package ejercicio.entity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class Empresa {

	// atributos
	private Collection<CentroDeDistribucion> centrosDeDistribucion;
	
	// constructor
	public Empresa() {
		this.centrosDeDistribucion = new ArrayList<CentroDeDistribucion>();
	}
	
	// metodos
	public void agregar(CentroDeDistribucion centro) {
		this.centrosDeDistribucion.add(centro);
	}
	
	public Collection<Vendedor> vendedoresFlojos() {
		return this.centrosDeDistribucion.stream()
											.map(CentroDeDistribucion::vendedorMasFlojo)
											.collect(Collectors.toList());
	}
	
	public Collection<CentroDeDistribucion> centrosQuePuedenCubrir(Ciudad ciudad) {
		return this.centrosDeDistribucion.stream()
											.filter(cdd -> cdd.puedeCubrir(ciudad))
											.collect(Collectors.toList());
	}
}
