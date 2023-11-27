package ar.edu.ciu.objetos2.ascenso;

import java.util.ArrayList;
import java.util.Collection;

/*
 * Sujeto concreto.
 */
public class Manager {

    private Collection<Emisora> emisoras;

    public Manager() {
        super();
        this.emisoras = new ArrayList<>();
    }

    public void agregar(Emisora unaEmisora) {
        this.emisoras.add(unaEmisora);
        unaEmisora.setManager(this);
    }

    public void notificarAEmisoras(Evento unEvento) {
        this.emisoras.forEach( emisora -> emisora.notificarAOyentes(unEvento));
    }

}
