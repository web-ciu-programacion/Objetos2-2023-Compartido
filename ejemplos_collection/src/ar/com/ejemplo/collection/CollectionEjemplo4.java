package ar.com.ejemplo.collection;

import java.util.HashSet;
import java.util.Set;

public class CollectionEjemplo4 {

    public static void main(String[] args) {
        Set<Integer> numeros = new HashSet<>();
        numeros.add(1);
        numeros.add(Integer.valueOf(2));
        numeros.add(Integer.valueOf(2));
        numeros.forEach( n -> System.out.println(n) );
    }
}
