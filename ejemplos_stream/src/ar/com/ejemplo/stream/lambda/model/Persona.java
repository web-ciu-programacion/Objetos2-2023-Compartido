package ar.com.ejemplo.stream.lambda.model;

public class Persona {

	// atributos
	protected String nombre;
	protected String apellido;
	protected Pais paisNatal;
	protected Sexo sexo;

	// constructor
	public Persona(String nombre, String apellido, Sexo sexo, Pais paisNatal) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.paisNatal = paisNatal;
		this.sexo = sexo;
	}

	// gets
	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public Pais getPaisNatal() {
		return paisNatal;
	}

	public Sexo getSexo() {
		return sexo;
	}
	
}
