package ciu.objetos2.pattern.mvc.mvcpattern.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import ciu.objetos2.pattern.mvc.mvcpattern.model.Persona;

@Controller
public class PersonaController {

	@RequestMapping("/lista")
	public String lista(Model modelo) {    
		Persona p1= new Persona("Ricardo","Espinoza",33);
		Persona p2= new Persona("Ricardo","Iorio",30);
		Persona p3= new Persona("Ruben","Moraglio",40);

		List<Persona> personas= Arrays.asList(p1,p2,p3);
		modelo.addAttribute("personas", personas);
		return "lista";
	}
}
