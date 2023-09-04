package ar.edu.ciu.objetos2.exceptions;

import java.io.File;
import java.util.Scanner;

/*
 * Observar que en Ejemplo1 y Ejemplo2 no es obligatorio hacer el try/catch (son Runtime)
 * En este Ejemplo3 si es obligatorio (son Exception)
 */
public class Ejemplo3 {

    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("/home/ariel/temporal/lamadrid.txt"));
            while (input.hasNextLine()) {
                String line = input.nextLine();
                System.out.println(line);
            }
            input.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
