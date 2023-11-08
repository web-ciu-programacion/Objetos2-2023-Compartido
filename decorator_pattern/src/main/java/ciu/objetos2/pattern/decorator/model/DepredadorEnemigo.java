package ciu.objetos2.pattern.decorator.model;

/*
 *  Concrete Component
 */
public class DepredadorEnemigo implements Enemigo {

	@Override
	public Integer danioGenerado() {
		return 100;
	}
}