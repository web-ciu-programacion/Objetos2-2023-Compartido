package ar.edu.ciu.objetos2.pattern.strategy.model;

/*
 *  Contexto
 */
public class Multiplicador {

	private Strategy estrategia;

	public void setStrategy(Strategy estrategia) {
		this.estrategia = estrategia;
	}
	
	public int executeStrategy(int num1, int num2) {
		return this.estrategia.producto(num1, num2);
	}
}
