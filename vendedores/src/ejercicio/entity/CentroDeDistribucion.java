package ejercicio.entity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.stream.Collectors;

import ejercicio.exception.VendedorExistenteException;

public class CentroDeDistribucion {

	// atributos
	private Collection<Vendedor> vendedores;

	// constructores
	public CentroDeDistribucion() {
		this.vendedores = new ArrayList<Vendedor>();
	}
	
	//metodos
	public void agregar(Vendedor vendedor) throws VendedorExistenteException {
		if (this.vendedores.contains(vendedor)) {
			throw new VendedorExistenteException("El vendedor ya existe en el Centro de Distribución");
		}
		this.vendedores.add(vendedor);
	}

	public Vendedor vendedorMasFlojo() {
		return this.vendedores.stream()
								.min(Comparator.comparing(Vendedor::totalPuntosCertificaciones))
								.get();
	}
	
	public Boolean puedeCubrir(Ciudad ciudad) {
		return this.vendedores.stream()
								.anyMatch(v -> v.puedeTrabajarEn(ciudad));
	}
	
	public Collection<Ciudad> ciudadesRedundantes(Collection<Ciudad> ciudadesAEvaluar) {
		return ciudadesAEvaluar.stream()
									.filter(c -> c.tieneRedundanciaDeVendedores(this.vendedores))
									.collect(Collectors.toList());
	}
}
