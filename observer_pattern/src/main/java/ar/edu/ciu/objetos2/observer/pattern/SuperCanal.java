package ar.edu.ciu.objetos2.observer.pattern;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SuperCanal implements MedioDeComunicacion {

    @Override
    public void actualizar(Escrutinio escrutinio) {
        System.out.println("-- Chupate este Informe! --------------------");
        List<Candidato> candidatos = Arrays.asList(escrutinio.getCandidatoA(), escrutinio.getCandidatoB(), escrutinio.getCandidatoC());
        candidatos.stream()
                        .sorted(Comparator.comparing(Candidato::getCantidadDeVotos).reversed())
                        .forEach(
                                c -> System.out.println("  " + c.getDescripcion() + " " + c.getCantidadDeVotos() + " votos.")
                        );
        System.out.println("");
        System.out.println("");
    }

}
