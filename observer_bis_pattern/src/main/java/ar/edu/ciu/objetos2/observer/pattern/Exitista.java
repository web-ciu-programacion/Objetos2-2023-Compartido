package ar.edu.ciu.objetos2.observer.pattern;

public class Exitista extends MedioDeComunicacion {

    @Override
    public void actualizar() {
        Candidato a = this.juntaElectoral.getEscritinio().getCandidatoA();
        Candidato b = this.juntaElectoral.getEscritinio().getCandidatoB();
        Candidato c = this.juntaElectoral.getEscritinio().getCandidatoC();
        Candidato primero = null;
        if (
                a.getCantidadDeVotos()>=b.getCantidadDeVotos() &&
                a.getCantidadDeVotos()>=c.getCantidadDeVotos()
        ) {
            primero = a;
        } else if (b.getCantidadDeVotos()>c.getCantidadDeVotos()) {
            primero = b;
        } else {
            primero = c;
        }
        System.out.println("-- El Exitista INFORMA!!! --------------------");
        System.out.println("  GANADOR (parcial): " + primero.getDescripcion());
        System.out.println("  El resto no existe!");
        System.out.println("");
        System.out.println("");
    }

    @Override
    public void actualizarEscrituino() {
        this.juntaElectoral.getEscritinio().getCandidatoC().setDescripcion("Roverto");
        this.juntaElectoral.notificar();
    }

}
