package ejercicio.entity;

import java.util.ArrayList;
import java.util.Collection;

public class ComercioCorresponsal extends Vendedor {

	// atributos
	private Collection<Sucursal> sucursales;
	
	// constructor
	public ComercioCorresponsal() {
		this.sucursales = new ArrayList<Sucursal>();
	}
	
	// metodos
	@Override
	public Boolean puedeTrabajarEn(Ciudad ciudad) {
		return this.sucursales.stream()
								.anyMatch(s -> s.estaEn(ciudad));
	}

	public void agregar(Sucursal sucursal) {
		this.sucursales.add(sucursal);
	}

	@Override
	public Boolean esPersonaFisica() {
		return Boolean.FALSE;
	}

}
