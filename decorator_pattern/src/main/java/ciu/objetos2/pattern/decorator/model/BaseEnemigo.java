package ciu.objetos2.pattern.decorator.model;

/*
 *  Base Decorator
 */
public class BaseEnemigo implements Enemigo {

	private Enemigo enemigo;
	
	public BaseEnemigo(Enemigo enemigo) {
		this.enemigo = enemigo;
	}

	@Override
	public Integer danioGenerado() {
		return this.enemigo.danioGenerado();
	}
}