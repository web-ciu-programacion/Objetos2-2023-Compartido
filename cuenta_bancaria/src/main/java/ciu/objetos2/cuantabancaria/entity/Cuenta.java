package ciu.objetos2.cuantabancaria.entity;

import java.util.ArrayList;
import java.util.Collection;

import ciu.objetos2.cuantabancaria.exception.CuentaException;

public abstract class Cuenta {

	protected Cliente cliente;;
	protected Double saldo;
	protected CuentaState estado;
	protected Collection<Movimiento> movimientos;

	public Cuenta(Cliente cliente) {
		this.cliente = cliente;
		this.estado = Habilitada.getInstance();
		this.movimientos = new ArrayList<Movimiento>();
		this.saldo = 0d;
	}

	protected abstract void extraerEnCuenta(Double monto) throws CuentaException;
	
	public Double extraer(Double monto, String comentario) throws CuentaException {
		Double montoAExtraer = this.calcularMontoFinalAExtraer(monto);
		this.extraerEnCuenta(montoAExtraer);
		this.agregar(new Movimiento(montoAExtraer, TipoMovimiento.DEBITO, comentario));
		return this.saldo;
	}

	public Double extraer(Double monto) throws CuentaException {
		return this.extraer(monto, null);
	}

	public Double depositar(Double monto) {
		return this.depositar(monto, null);
	}

	public Double depositar(Double monto, String comentario) {
		Double montoADepositar = this.calcularMontoFinalADepositar(monto);
		this.depositarEnCuenta(montoADepositar);
		this.agregar(new Movimiento(montoADepositar, TipoMovimiento.CREDITO, comentario));
		return this.saldo;
	}

	public Integer cantidadDeMovimientos() {
		return this.movimientos.size();
	}

	private Double calcularMontoFinalAExtraer(Double monto) throws CuentaException {
		return this.estado.calcularMontoFinalAExtraer(monto);
	}

	private Double calcularMontoFinalADepositar(Double monto) {
		return this.estado.calcularMontoFinalADepositar(monto);
	}

	private Double depositarEnCuenta(Double monto) {
		this.saldo += monto;
		return this.saldo;
	}
	
	private void agregar(Movimiento movimiento) {
		this.movimientos.add(movimiento);
	}

	public void embargar() {
		this.estado = Embargada.getInstance();
	}
	
	public void inhabilitar() {
		this.estado = Inhabilitada.getInstance();
	}

	public Double getSaldo() {
		return saldo;
	}
	
	public CuentaState getEstado() {
		return this.estado;
	}
}
