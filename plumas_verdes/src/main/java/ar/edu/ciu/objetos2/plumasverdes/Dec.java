package ar.edu.ciu.objetos2.plumasverdes;

/*
 *  Observador concreto.
 */
public class Dec implements Observador {

	private Integer numero;
    private String descripcion;
    private Sujeto sujeto;

    public Dec(Integer numero, String descripcion) {
        super();
        this.numero = numero;
        this.descripcion = descripcion;
    }

	@Override
	public void acutalizar(Evento evento) {
		System.out.println("===>>> DEC: " + this.numero + " - " + this.descripcion);
		System.out.println(evento.toString());
	}

	@Override
	public void arribo(Omnibus omnibus) {
		Evento evento = new Evento(omnibus, this);
		this.sujeto.notificar(evento);
	}

	public Integer getNumero() {
		return numero;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setSujeto(Sujeto sujeto) {
		this.sujeto = sujeto;
	}
}