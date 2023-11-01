package ar.edu.ciu.objetos2.observer.pattern;

/**
 * Observer - sujeto
 */
public interface JuntaElectoral {

    public void agregar(MedioDeComunicacion unObservador);
    public void quitar(MedioDeComunicacion unObservador);
    public void notificar();
    public Escrutinio getEscritinio();

    /**
     * mainBusinessLogic
     */
    public void cargarVotos();

}
