package ar.edu.ciu.objetos2.exceptions;

public class Ejemplo1 {

    //TODO Basarse en: https://javadesdecero.es/intermedio/manejo-de-excepciones/
    public static void main(String[] args) {
        int[] nums = new int[5];

        try {
            System.out.println("Antes de que se genere la excepción.");
            nums[8] = 10;
            System.out.println("Post asignacion vector.");
        } catch (ArrayIndexOutOfBoundsException exc) {
            // Capturando la excepción
            System.out.println("Índice fuera de los límites!");
        }

        System.out.println("Después de que se genere la excepción.");
    }

}
