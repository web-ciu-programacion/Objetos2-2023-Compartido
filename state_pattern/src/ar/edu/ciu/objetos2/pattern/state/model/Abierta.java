package ar.edu.ciu.objetos2.pattern.state.model;

public class Abierta extends EstadoVentanilla{

  @Override
  public void atender(Persona persona) {
    System.out.println("atendiendo a: "+ persona.getNombre());
  }

}
