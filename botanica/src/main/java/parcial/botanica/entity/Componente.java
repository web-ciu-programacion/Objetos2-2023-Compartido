package parcial.botanica.entity;

/*
 * Composite
 * Component
 */
public interface Componente extends Prototype {

	public Integer totalDeHojas();
	
	public Double cantidadDeClorofila();

	public Prototype clone();
}
