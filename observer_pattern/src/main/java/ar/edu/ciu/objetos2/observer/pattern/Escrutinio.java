package ar.edu.ciu.objetos2.observer.pattern;

/**
 * Observer - Estado
 */
public class Escrutinio {
    private Candidato candidatoA;
    private Candidato candidatoB;
    private Candidato candidatoC;

    public Candidato getCandidatoA() {
        return candidatoA;
    }

    public void setCandidatoA(Candidato candidatoA) {
        this.candidatoA = candidatoA;
    }

    public Candidato getCandidatoB() {
        return candidatoB;
    }

    public void setCandidatoB(Candidato candidatoB) {
        this.candidatoB = candidatoB;
    }

    public Candidato getCandidatoC() {
        return candidatoC;
    }

    public void setCandidatoC(Candidato candidatoC) {
        this.candidatoC = candidatoC;
    }
}
