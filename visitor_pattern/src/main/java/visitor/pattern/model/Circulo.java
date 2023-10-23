package visitor.pattern.model;

import javax.xml.bind.annotation.XmlRootElement;

import visitor.pattern.visitor.Visitor;

@XmlRootElement(name = "circulo")
public class Circulo extends Figura {

	private Integer radio;

	public Circulo() {}

	public Circulo(Integer x, Integer y, Integer radio) {
		super(x, y);
		this.radio = radio;
	}
	
	@Override
	public void dibujar() {
		this.moverXDibujar("Circulo (" + this.x + "," + this.y + ") | Radio: " + this.radio);
		this.moverXDibujar("   - ");
		this.moverXDibujar(" /   \\");
		this.moverXDibujar("|     |");
		this.moverXDibujar(" \\   /");
		this.moverXDibujar("   - ");
	}

	@Override
	public void aceptar(Visitor visitor) {
		visitor.export(this);
	}

	public Integer getRadio() {
		return radio;
	}

	public void setRadio(Integer radio) {
		this.radio = radio;
	}
}