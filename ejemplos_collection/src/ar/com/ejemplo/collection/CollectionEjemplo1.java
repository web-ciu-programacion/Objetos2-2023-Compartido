package ar.com.ejemplo.collection;

import java.util.ArrayList;
import java.util.Collection;

/*
 * En este ejemplo se ve que la collection puede almacenar cualquier tipo de objeto.
 */
public class CollectionEjemplo1 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		Collection c1 = new ArrayList<>();
		c1.add("Lamadrid");
		c1.add(Integer.valueOf(10));
		c1.add(new Estudiante("1098494", "Pablo", "Picaro"));
		// recorrerlo sin stream primero
		for (Object object : c1) {
			System.out.println(object);
		}
	}

}
