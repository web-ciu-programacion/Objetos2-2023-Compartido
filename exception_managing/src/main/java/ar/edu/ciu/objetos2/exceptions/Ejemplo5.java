package ar.edu.ciu.objetos2.exceptions;

public class Ejemplo5 {

    public static void main(String[] args) {
        try {
            System.out.println("Paso 1");
            System.out.println("Paso 2");
            metodo();
            System.out.println("Paso 3");
            System.out.println("Paso 4");
        } catch (MyException e) {
            e.printStackTrace();
        }
    }

    private static void metodo() throws MyException {
        System.out.println("Paso 2.1");
        throw new MyException("Error Inesperado!");
    }

}
