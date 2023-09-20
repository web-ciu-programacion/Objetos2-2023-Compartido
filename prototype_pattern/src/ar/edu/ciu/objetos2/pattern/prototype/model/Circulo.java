package ar.edu.ciu.objetos2.pattern.prototype.model;

public class Circulo extends Figura {

	// atributos
	private int radio; 
	
	// constructores
	public Circulo() {
	}

	public Circulo(int x, int y, String color, int radio) {
		super(x, y, color);
		this.radio = radio;
	}

	public Circulo(Circulo target) {
		super(target);
		if (target!=null) {
			this.radio = target.getRadio();
		}
	}
	
	// metodos
	@Override
	public Figura clone() {
		return new Circulo(this);
	}

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Circulo) || !super.equals(object)) return false;
        Circulo circulo = (Circulo) object;
        return circulo.getRadio() == this.radio;
    }

	// gets y sets
	public int getRadio() {
		return radio;
	}
}
