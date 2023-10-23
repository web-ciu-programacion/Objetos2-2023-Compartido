package parcial.botanica.entity;

/*
 * Composite
 * Leaf
 */
public class Hoja implements Componente {

	private Double superficie; // m2
	private Double clorofilaEstimada; // umol/m2;
	private State estado;

	public Hoja(Double superficie, Double clorofilaEstimada, State estado) {
		this.superficie = superficie;
		this.clorofilaEstimada = clorofilaEstimada;
		this.estado = estado;
	}
	
	private Hoja(Hoja target) {
		this(target.getSuperficie(), target.getClorofilaEstimada(), target.getEstado());
	}
	
	public Double cantidadDeClorofila() {
		return this.estado.cantidadDeClorofila(this);
	}

	public Double getSuperficie() {
		return superficie;
	}

	public Double getClorofilaEstimada() {
		return clorofilaEstimada;
	}

	public State getEstado() {
		return estado;
	}

	@Override
	public Integer totalDeHojas() {
		return 1;
	}

	@Override
	public Prototype clone() {
		return new Hoja(this);
	}
}
