package visitor.pattern.model;

import javax.xml.bind.annotation.XmlRootElement;

import visitor.pattern.visitor.Visitor;

@XmlRootElement(name = "cuadrado")
public class Cuadrado extends Figura {

	private Integer lado;

	public Cuadrado() {}

	public Cuadrado(Integer x, Integer y, Integer lado) {
		super(x, y);
		this.lado = lado;
	}

	@Override
	protected void dibujar() {
		this.moverXDibujar("Cuadrado (" + this.x + "," + this.y + ") | Lado: " + this.lado);
		this.moverXDibujar("-----");
		this.moverXDibujar("|   |");
		this.moverXDibujar("|   |");
		this.moverXDibujar("-----");
	}

	@Override
	public void aceptar(Visitor visitor) {
		visitor.export(this);
	}

	public Integer getLado() {
		return lado;
	}

	public void setLado(Integer lado) {
		this.lado = lado;
	}
}
