package ciu.objetos2.cuantabancaria.factory;

import ciu.objetos2.cuantabancaria.entity.Cliente;
import ciu.objetos2.cuantabancaria.entity.Cuenta;
import ciu.objetos2.cuantabancaria.exception.CuentaException;


// Abstract Factory
public abstract class CuentaCreator {

	protected abstract Cuenta generarCuenta(Cliente cliente);
	protected abstract void generarPrimerMovimiento(Cuenta cuenta) throws CuentaException;
	
	public Cuenta crearCuenta(Cliente cliente) throws CuentaException {
		Cuenta cuenta = this.generarCuenta(cliente);
		this.generarPrimerMovimiento(cuenta);
		return cuenta;
	}
}
