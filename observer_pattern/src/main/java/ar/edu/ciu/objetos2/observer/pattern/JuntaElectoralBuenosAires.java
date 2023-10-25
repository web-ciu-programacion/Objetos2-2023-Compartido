package ar.edu.ciu.objetos2.observer.pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Observer - Sujeto concreto
 */
public class JuntaElectoralBuenosAires implements JuntaElectoral {

    private Escrutinio escrutinio;
    private List<MedioDeComunicacion> mediosDeComunicacion;

    public JuntaElectoralBuenosAires() {
        super();
        Candidato micaela = new Candidato();
        micaela.setDescripcion("Micaela");
        micaela.setCantidadDeVotos(0);
        Candidato pedro = new Candidato();
        pedro.setDescripcion("Pedro");
        pedro.setCantidadDeVotos(0);
        Candidato roberto = new Candidato();
        roberto.setDescripcion("Roberto");
        roberto.setCantidadDeVotos(0);
        this.escrutinio = new Escrutinio();
        this.escrutinio.setCandidatoA(micaela);
        this.escrutinio.setCandidatoB(pedro);
        this.escrutinio.setCandidatoC(roberto);
        this.mediosDeComunicacion = new ArrayList<>();
    }

    @Override
    public void agregar(MedioDeComunicacion unObservador) {
        this.mediosDeComunicacion.add(unObservador);
    }

    @Override
    public void quitar(MedioDeComunicacion unObservador) {
        this.mediosDeComunicacion.remove(unObservador);
    }

    @Override
    public void notificar() {
        this.mediosDeComunicacion.forEach( m -> m.actualizar(this.escrutinio));
    }

    /**
     * mainBusinessLogic
     */
    @Override
    public void cargarVotos() {
        // actualiza el estado
        this.escrutinio.getCandidatoA().sumarVotos(this.generarVotos());
        this.escrutinio.getCandidatoB().sumarVotos(this.generarVotos());
        this.escrutinio.getCandidatoC().sumarVotos(this.generarVotos());
        // notifica a los medios
        this.notificar();
    }

    private Integer generarVotos() {
        return (int)(Math.random()*180);
    }

}
