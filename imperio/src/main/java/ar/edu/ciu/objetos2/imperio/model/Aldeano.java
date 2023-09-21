package ar.edu.ciu.objetos2.imperio.model;

public class Aldeano extends Ciudadano implements Militar {

    private Boolean estaCansado;

    public Aldeano(String nombre, String legajo, Boolean estaCansado) {
        super(nombre, legajo, TipoCiudadano.ALDEANO);
        this.estaCansado = estaCansado;
    }

	@Override
	public Double coeficienteDeGenerarDanio() {
        return 0.1 + (this.estaCansado?0.00:0.1);
	}

	@Override
	public Double poderDeGenerarDanio(SiluetaGuerrera silueta) {
    	return silueta.danioProducidoPor(this);
	}
}
