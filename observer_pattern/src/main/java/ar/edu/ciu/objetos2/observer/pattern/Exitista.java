package ar.edu.ciu.objetos2.observer.pattern;

public class Exitista implements MedioDeComunicacion {
    @Override
    public void actualizar(Escrutinio escrutinio) {
        Candidato a = escrutinio.getCandidatoA();
        Candidato b = escrutinio.getCandidatoB();
        Candidato c = escrutinio.getCandidatoC();
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

}
