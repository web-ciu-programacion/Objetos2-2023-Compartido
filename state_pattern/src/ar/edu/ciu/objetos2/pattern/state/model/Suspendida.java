package ar.edu.ciu.objetos2.pattern.state.model;

public class Suspendida extends EstadoVentanilla{

  @Override
  public void atender(Persona persona) {
    //el cajero esta ocupado pero si hay una persona
    //mayor la atiende igual
    if(persona.isMayorDeEdad()){
      System.out.println("Atendiendo a: " + persona.getNombre());
    }
    else{
      System.out.println("Por favor espere 5 minutos");
    }
  }

}
