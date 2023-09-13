package ar.edu.ciu.objetos2.composite.model;

/**
 * 
 * Composite Leaf
 *
 */
public final class CuentaCorriente extends CuentaPersonal {

	/**
	 * En la Cuenta Corriente solo me interesan los movimientos negativos.
	 */
	@Override
	public Double saldo() {
		return this.movimientos.stream()
									.filter(Movimiento::esNegativo)
									.mapToDouble( movimiento -> movimiento.getImporte())
									.sum();
	}

}
