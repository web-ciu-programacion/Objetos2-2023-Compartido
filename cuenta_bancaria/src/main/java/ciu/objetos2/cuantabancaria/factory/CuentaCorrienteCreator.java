package ciu.objetos2.cuantabancaria.factory;

import ciu.objetos2.cuantabancaria.entity.Cliente;
import ciu.objetos2.cuantabancaria.entity.Cuenta;
import ciu.objetos2.cuantabancaria.entity.CuentaCorriente;
import ciu.objetos2.cuantabancaria.exception.CuentaException;

public class CuentaCorrienteCreator extends CuentaCreator {

	private static final Double MONTO_ADMINISTRATIVO = 650d;
	private static final String LEYENDA_MOVIMIENTO_ADMINISTRATIVO = "Gastos administrativos.";

	@Override
	protected Cuenta generarCuenta(Cliente cliente) {
		CuentaCorriente cuentaCorriente = new CuentaCorriente(cliente);
		cuentaCorriente.calcularLimiteDisponible();
		return cuentaCorriente;
	}

	@Override
	protected void generarPrimerMovimiento(Cuenta cuenta) throws CuentaException {
		cuenta.extraer(MONTO_ADMINISTRATIVO, LEYENDA_MOVIMIENTO_ADMINISTRATIVO);
	}

}
