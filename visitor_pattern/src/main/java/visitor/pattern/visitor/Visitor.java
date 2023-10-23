package visitor.pattern.visitor;

import visitor.pattern.model.Circulo;
import visitor.pattern.model.Cuadrado;

public interface Visitor {

	public void export(Circulo circulo);
	public void export(Cuadrado cuadrado);
}
