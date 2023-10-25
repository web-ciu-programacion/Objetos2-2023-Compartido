package ar.edu.ciu.objetos2.observer.pattern;

public class Informa implements  MedioDeComunicacion {
    @Override
    public void actualizar(Escrutinio escrutinio) {
        System.out.println("-- El Informante --------------------");
        System.out.println("  Candidato: " + escrutinio.getCandidatoA().getDescripcion() + " votos: " + escrutinio.getCandidatoA().getCantidadDeVotos());
        System.out.println("  Candidato: " + escrutinio.getCandidatoB().getDescripcion() + " votos: " + escrutinio.getCandidatoB().getCantidadDeVotos());
        System.out.println("  Candidato: " + escrutinio.getCandidatoC().getDescripcion() + " votos: " + escrutinio.getCandidatoC().getCantidadDeVotos());
        System.out.println("     (cualquier orden es pura casualidad...)");
        System.out.println("");
        System.out.println("");
    }
}
