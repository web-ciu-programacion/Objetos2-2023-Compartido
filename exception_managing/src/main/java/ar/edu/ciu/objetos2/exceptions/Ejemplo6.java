package ar.edu.ciu.objetos2.exceptions;

import java.io.File;
import java.util.Scanner;

public class Ejemplo6 {

    public static void main(String[] args) {
        Scanner input = null;
        try {
            input = new Scanner(new File("/home/ariel/temporal/lamadrid.txtS"));
            while (input.hasNextLine()) {
                String line = input.nextLine();
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Siempre pasa por acá...");
            input.close();
        }
    }

    // Hacer ejercicios 15, 16 y 17 del Ejercicio5.pdf de la carpeta doc

}
