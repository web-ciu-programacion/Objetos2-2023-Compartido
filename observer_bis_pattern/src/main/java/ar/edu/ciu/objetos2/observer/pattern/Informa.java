package ar.edu.ciu.objetos2.observer.pattern;

public class Informa extends MedioDeComunicacion {

    @Override
    public void actualizar() {
        System.out.println("-- El Informante --------------------");
        System.out.println("  Candidato: " + this.juntaElectoral.getEscritinio().getCandidatoA().getDescripcion() + " votos: " + this.juntaElectoral.getEscritinio().getCandidatoA().getCantidadDeVotos());
        System.out.println("  Candidato: " + this.juntaElectoral.getEscritinio().getCandidatoB().getDescripcion() + " votos: " + this.juntaElectoral.getEscritinio().getCandidatoB().getCantidadDeVotos());
        System.out.println("  Candidato: " + this.juntaElectoral.getEscritinio().getCandidatoC().getDescripcion() + " votos: " + this.juntaElectoral.getEscritinio().getCandidatoC().getCantidadDeVotos());
        System.out.println("     (cualquier orden es pura casualidad...)");
        System.out.println("");
        System.out.println("");
    }

    @Override
    public void actualizarEscrituino() {
        this.juntaElectoral.getEscritinio().getCandidatoC().setDescripcion("Roverto");
        this.juntaElectoral.notificar();
    }

}
