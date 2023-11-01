package ar.edu.ciu.objetos2.observer.pattern;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SuperCanal extends MedioDeComunicacion {

    @Override
    public void actualizar() {
        System.out.println("-- Chupate este Informe! --------------------");
        List<Candidato> candidatos = Arrays.asList(this.juntaElectoral.getEscritinio().getCandidatoA(), this.juntaElectoral.getEscritinio().getCandidatoB(), this.juntaElectoral.getEscritinio().getCandidatoC());
        candidatos.stream()
                        .sorted(Comparator.comparing(Candidato::getCantidadDeVotos).reversed())
                        .forEach(
                                c -> System.out.println("  " + c.getDescripcion() + " " + c.getCantidadDeVotos() + " votos.")
                        );
        System.out.println("");
        System.out.println("");
    }

    @Override
    public void actualizarEscrituino() {
        this.juntaElectoral.getEscritinio().getCandidatoB().setDescripcion("Pedrro");
        this.juntaElectoral.notificar();
    }

}
