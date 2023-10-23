package visitor.pattern.model;

import visitor.pattern.visitor.Visitor;

public abstract class Figura {

	private static final String CARACTER_DESPLAZAMIENTO = " ";
	
	protected Integer x;
	protected Integer y;

	protected Figura() {}

	protected Figura(Integer x, Integer y) {
		this.x = x;
		this.y = y;
	}
	
	protected abstract void dibujar();
	
	public void dibujarFigura() {
		this.moverY();
		this.dibujar();
	}

	private void moverY() {
		for (int i = 0; i < this.y; i++) {
			System.out.println(CARACTER_DESPLAZAMIENTO);
		}
	}

	protected void moverXDibujar(String linea) {
		for (int i = 0; i < this.x; i++) {
			System.out.print(CARACTER_DESPLAZAMIENTO);
		}
		System.out.println(linea);
	}

	// Implementado por Visitor Pattern.
	public abstract void aceptar(Visitor visitor);

	public Integer getX() {
		return x;
	}

	public void setX(Integer x) {
		this.x = x;
	}

	public Integer getY() {
		return y;
	}

	public void setY(Integer y) {
		this.y = y;
	}
}