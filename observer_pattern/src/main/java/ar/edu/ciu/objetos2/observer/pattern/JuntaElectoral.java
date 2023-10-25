package ar.edu.ciu.objetos2.observer.pattern;

/**
 * Observer - sujeto
 */
public interface JuntaElectoral {

    public void agregar(MedioDeComunicacion unObservador);
    public void quitar(MedioDeComunicacion unObservador);
    public void notificar();

    /**
     * mainBusinessLogic
     */
    public void cargarVotos();

}
