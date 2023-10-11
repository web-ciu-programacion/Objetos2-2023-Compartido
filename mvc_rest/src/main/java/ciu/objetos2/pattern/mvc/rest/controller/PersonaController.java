package ciu.objetos2.pattern.mvc.rest.controller;

import java.util.Collection;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ciu.objetos2.pattern.mvc.rest.model.Persona;
import ciu.objetos2.pattern.mvc.rest.store.Store;

@RestController
@RequestMapping("/personas")
public class PersonaController {

	@GetMapping("/listar")
	public Collection<Persona> lista() {    
		return Store.getInstance().findAll();
	}
	
	@PostMapping("/agregar")
	public Persona agregar(@RequestBody Persona p) {
		Store.getInstance().add(p);
		return p;
	}
}