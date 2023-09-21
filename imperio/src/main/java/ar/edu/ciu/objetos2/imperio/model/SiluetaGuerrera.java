package ar.edu.ciu.objetos2.imperio.model;

public class SiluetaGuerrera {

    private static SiluetaGuerrera instance;

    private Double resistencia;

    private SiluetaGuerrera() {
        super();
        this.resistencia = 100.00;
    }

    public static SiluetaGuerrera getInstance() {
        if (instance==null)
            instance = new SiluetaGuerrera();
        return instance;
    }

    public Double danioProducidoPor(Militar unMilitar) {
        return unMilitar.coeficienteDeGenerarDanio() * this.resistencia;
    }

}
