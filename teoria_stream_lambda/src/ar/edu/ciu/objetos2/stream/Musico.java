package ar.edu.ciu.objetos2.stream;

public class Musico {

	// atributos
	private Long id;
	private String nombre;
	private Integer edad;
	private String genero;

	// constructor
	public Musico(Long id, String nombre, Integer edad, String genero) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero;
	}

	// gets
	public Long getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public String getGenero() {
		return genero;
	}

	public Integer getEdad() {
		return edad;
	}

}
