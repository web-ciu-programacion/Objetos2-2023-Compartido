package ar.edu.ciu.objetos2.plumasverdes;

import java.util.ArrayList;
import java.util.Collection;

/*
 * Sujeto concreto.
 */
public class Central implements Sujeto {

    private Collection<Observador> decs;

    public Central() {
        super();
        this.decs = new ArrayList<>();
    }

	@Override
	public void agregar(Observador observador) {
		observador.setSujeto(this);
		this.decs.add(observador);
	}

	@Override
	public void quitar(Observador observador) {
		this.decs.remove(observador);
	}

	@Override
	public void notificar(Evento evento) {
		if (this.decs!=null) {
			this.decs.forEach( dec -> {
				dec.acutalizar(evento);
			});
		}
	}
}
