package ar.edu.ciu.objetos2.pattern.templateMethod;

import ar.edu.ciu.objetos2.pattern.templateMethod.model.Empleado;
import ar.edu.ciu.objetos2.pattern.templateMethod.model.Operario;
import ar.edu.ciu.objetos2.pattern.templateMethod.model.Vendedor;

/*
 *  Utilizar el debugger
 */
public class Main {

    public static void main(String[] args) {
        Empleado op1 = new Operario(30000.0, 0, 7);
        System.out.println("El sueldo de op1 es: " + op1.getSueldo(3.1));

        Empleado ve1 = new Vendedor(15000.0, 5, 2);
        System.out.println("El sueldo de ve1 es: " + ve1.getSueldo(3.1));

        ve1.setNombre("Lamadrid");
        System.out.println("El nombre invertido de ve1 es: " + ve1.getNombreInverso());
    }

}
