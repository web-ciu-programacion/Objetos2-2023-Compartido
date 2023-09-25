package numero.mayor;

import java.util.Arrays;
import java.util.List;

public class Cliente {

	public static void main(String[] args) {
		Persona p1 = new Persona(35);
		Persona p2 = new Persona(19);
		Persona p3 = new Persona(62);
		Persona p4 = new Persona(41);
		Persona p5 = new Persona(50);
		List<Persona> personas = Arrays.asList(p1, p2, p3, p4, p5);
		Strategy s = new PreJava8();
		System.out.println(s.mayorEdad(personas));
	}

}
