package ar.edu.ciu.objetos2.pattern.strategy.model;

/*
 * Concrete Strategy
 */
public class Producto implements Strategy {

	@Override
	public int producto(int numero1, int numero2) {
		return numero1 * numero2;
	}

}
