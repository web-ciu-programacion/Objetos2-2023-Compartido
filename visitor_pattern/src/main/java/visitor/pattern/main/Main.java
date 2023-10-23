package visitor.pattern.main;

import visitor.pattern.model.Circulo;
import visitor.pattern.model.Cuadrado;
import visitor.pattern.model.Figura;
import visitor.pattern.visitor.JSONExportVisitor;
import visitor.pattern.visitor.Visitor;
import visitor.pattern.visitor.XMLExportVisitor;

public class Main {

	public static void main(String[] args) {
		Figura fig1 = new Circulo(5, 3, 4);
		fig1.dibujarFigura();

		Figura fig2 = new Cuadrado(10, 2, 3);
		fig2.dibujarFigura();
		
		Visitor visitorXml = new XMLExportVisitor();
		fig1.aceptar(visitorXml);
		fig2.aceptar(visitorXml);
		
		Visitor visitorJson = new JSONExportVisitor();
		fig1.aceptar(visitorJson);
		fig2.aceptar(visitorJson);
	}
}