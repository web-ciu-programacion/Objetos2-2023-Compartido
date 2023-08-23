package ar.com.ejemplo.collection;

import java.util.HashMap;
import java.util.Map;

public class MapEjemplo1 {

    public static void main(String[] args) {
        Estudiante pepe = new Estudiante("1098494", "Jose", "Sand");
        Estudiante trucho = new Estudiante("1021454", "Ruben", "Moraglio");
        Estudiante lily = new Estudiante("1098546", "Liliana", "Rodriguez");
        Estudiante lau = new Estudiante("1098707", "Laura", "Taccio");

        Map<String, Estudiante> map = new HashMap<>();
        map.put("uno", pepe);
        map.put("dos", trucho);
        map.put("tres", lau);
        map.put("cuatro", lily);
        Estudiante e = map.get("uno");
        System.out.println(e);
    }

}
