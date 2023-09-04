package ar.edu.ciu.objetos2.exceptions;

public class Ejemplo4 {

    public static void main(String[] args) {
        try {
            System.out.println("Paso 1");
            System.out.println("Paso 2");
            throw new MyException("Error inesperado!");
            //System.out.println("Paso 3");
            //System.out.println("Paso 4");
        } catch (MyException e) {
            e.printStackTrace();
        }
    }

}
