package ar.edu.ciu.objetos2.pattern.state;

import ar.edu.ciu.objetos2.pattern.state.model.Banco;
import ar.edu.ciu.objetos2.pattern.state.model.Persona;

public class Main {

  public static void main (String[] args){

    Persona persona1 = new Persona("Juan","Perez",22);
    Persona persona2 = new Persona("Gustavo","Gomez",71);
    Persona persona3 = new Persona("Gabriela","Rojas",82);
    Persona persona4 = new Persona("Sabrina","Gonzalez",42);

    Banco banco = new Banco();
    banco.atender(persona1);

    banco.suspenderVentanilla();
    //No la atiende xq es menor de 65
    banco.atender(persona4);
    //los atiende son mayores de65
    banco.atender(persona2);
    banco.atender(persona3);

    banco.cerrarVentanilla();
    banco.atender(persona4);
  }
}
