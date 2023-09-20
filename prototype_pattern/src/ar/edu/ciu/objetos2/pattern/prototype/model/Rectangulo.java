package ar.edu.ciu.objetos2.pattern.prototype.model;

public class Rectangulo extends Figura {

	// atributos
	private int base;
	private int altura;

	public Rectangulo() {
	}

	public Rectangulo(int x, int y, String color, int base, int altura) {
		super(x, y, color);
		this.base = base;
		this.altura = altura;
	}

	public Rectangulo(Rectangulo target) {
		super(target);
		if (target!=null) {
			this.base = target.getBase();
			this.altura = target.getAltura();
		}
	}
	
	// metodos
	@Override
	public Figura clone() {
		return new Rectangulo(this);
	}

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Rectangulo) || !super.equals(object2)) return false;
        Rectangulo shape2 = (Rectangulo) object2;
        return shape2.getBase() == this.base && shape2.getAltura() == altura;
    }

	// gets y sets
	public int getBase() {
		return base;
	}

	public int getAltura() {
		return altura;
	}
}
