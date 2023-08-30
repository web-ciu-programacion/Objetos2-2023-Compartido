package ar.edu.ciu.objetos2.pattern.singleton;

import ar.edu.ciu.objetos2.pattern.singleton.ejemplo1.Empresa;
import ar.edu.ciu.objetos2.pattern.singleton.ejemplo2.Compania;

public class Main {

    public static void main(String[] args) {
        Empresa e1 = Empresa.getInstance();
        Empresa e2 = Empresa.getInstance();
        System.out.println("e1: " + e1.getDescripcion());
        System.out.println("e2: " + e2.getDescripcion());
        e1.setDescripcion("Avanzada");
        System.out.println("e1: " + e1.getDescripcion());
        System.out.println("e2: " + e2.getDescripcion());

        Compania c1 = Compania.getInstance();
        Compania c2 = Compania.getInstance();
        System.out.println("c1: " + c1.getDescripcion());
        System.out.println("c2: " + c2.getDescripcion());
        c2.setDescripcion("Las Pelotas");
        System.out.println("c1: " + c1.getDescripcion());
        System.out.println("c2: " + c2.getDescripcion());

    }

}
