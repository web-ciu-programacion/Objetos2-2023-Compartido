package ar.edu.ciu.objetos2.composite.model;

/**
 * 
 * Composite Leaf
 *
 */
public final class CajaDeAhorro extends CuentaPersonal {

	@Override
	public Double saldo() {
		return this.movimientos.stream()
									.mapToDouble( movimiento -> movimiento.getImporte())
									.sum();
	}

}
