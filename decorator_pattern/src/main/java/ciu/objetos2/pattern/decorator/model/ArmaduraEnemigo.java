package ciu.objetos2.pattern.decorator.model;

/*
 * Concrete Decorator
 */
public class ArmaduraEnemigo extends BaseEnemigo {

	public ArmaduraEnemigo(Enemigo enemigo) {
		super(enemigo);
	}

	@Override
	public Integer danioGenerado() {
		return super.danioGenerado()-this.extra();
	}
	
	private Integer extra() {
		return 40;
	}
}