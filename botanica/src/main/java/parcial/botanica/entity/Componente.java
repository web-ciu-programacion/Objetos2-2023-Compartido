package parcial.botanica.entity;

/*
 * Composite
 * Component
 */
public abstract class Componente implements Prototype {

	public abstract Integer totalDeHojas();
	
	public abstract Double cantidadDeClorofila();

	public abstract Prototype clone();
}
