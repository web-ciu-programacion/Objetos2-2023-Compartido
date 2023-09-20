package ar.edu.ciu.objetos2.pattern.prototype.model;

import java.util.Objects;

public abstract class Figura {

	// atributos
	private int x;
	private int y;
	private String color;

	// constructores
	public Figura() {
	}

	public Figura(Figura target) {
		if (target!=null) {
			this.x = target.getX();
			this.y = target.getY();
			this.color = target.getColor();
		}
	}

	public Figura(int x, int y, String color) {
		this.x = x;
		this.y = y;
		this.color = color;
	}

	// metodos
	public abstract Figura clone();

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Figura)) return false;
        Figura shape2 = (Figura) object2;
        return shape2.getX() == this.x && shape2.getY() == this.y && Objects.equals(shape2.color, color);
    }

	// gets y sets
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public String getColor() {
		return color;
	}
}
