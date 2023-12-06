package ar.edu.ciu.objetos2.plumasverdes;

public class Omnibus {
	
	private Integer interno;
	private Chofer chofer;
	private Sentido sentido;
	
	public Omnibus(Integer interno, Chofer chofer, Sentido sentido) {
		this.interno = interno;
		this.chofer = chofer;
		this.sentido = sentido;
	}

	public Integer getInterno() {
		return interno;
	}

	public Chofer getChofer() {
		return chofer;
	}

	public Sentido getSentido() {
		return sentido;
	}
}
