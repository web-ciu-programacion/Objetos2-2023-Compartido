package ar.edu.ciu.objetos2.imperio.model;

import java.util.ArrayList;
import java.util.List;

public class Milicia extends Ciudadano implements Militar {

    private List<Arma> armas;
    public Milicia(String nombre, String legajo) {
        super(nombre, legajo, TipoCiudadano.MILICIA);
    }

    @Override
	public Double coeficienteDeGenerarDanio() {
        return 0.5 + this.armas.size()*0.1;
	}

    @Override
    public Double poderDeGenerarDanio(SiluetaGuerrera silueta) {
    	return silueta.danioProducidoPor(this);
    }

    public void add(Arma arma) {
        if (this.armas==null)
            this.armas = new ArrayList<>();
        this.armas.add(arma);
    }

}
