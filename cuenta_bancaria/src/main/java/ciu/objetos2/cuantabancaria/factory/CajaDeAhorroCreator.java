package ciu.objetos2.cuantabancaria.factory;

import ciu.objetos2.cuantabancaria.entity.CajaDeAhorro;
import ciu.objetos2.cuantabancaria.entity.Cliente;
import ciu.objetos2.cuantabancaria.entity.Cuenta;

public class CajaDeAhorroCreator extends CuentaCreator {

	private static final Double MONTO_BIENVENIDA = 1000d;
	private static final String LEYENDA_BIENVENIDA = "Bienvenide!";

	@Override
	protected Cuenta generarCuenta(Cliente cliente) {
		CajaDeAhorro cajaDeAhorro = new CajaDeAhorro(cliente);
		cajaDeAhorro.calcularLimiteDisponibleEnTarjetaDeCredito();
		return cajaDeAhorro;
	}

	@Override
	protected void generarPrimerMovimiento(Cuenta cuenta) {
		cuenta.depositar(MONTO_BIENVENIDA, LEYENDA_BIENVENIDA);
	}
}
