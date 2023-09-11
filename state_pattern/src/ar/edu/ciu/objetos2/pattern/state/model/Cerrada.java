package ar.edu.ciu.objetos2.pattern.state.model;

public class Cerrada extends EstadoVentanilla{

  @Override
  public void atender(Persona persona) {
    System.out.println("Ventanilla cerrrada!");
  }

}
