package ar.edu.ciu.objetos2.observer.pattern;

/**
 * Observer - observador
 */
public abstract class MedioDeComunicacion {

    protected JuntaElectoral juntaElectoral;

    public abstract void actualizar();

    public abstract void actualizarEscrituino();

    public void setJuntaElectoral(JuntaElectoral juntaElectoral) {
        this.juntaElectoral = juntaElectoral;
    }

}
