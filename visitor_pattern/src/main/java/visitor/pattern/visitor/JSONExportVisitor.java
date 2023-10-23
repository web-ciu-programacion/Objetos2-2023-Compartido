package visitor.pattern.visitor;

import com.google.gson.Gson;

import visitor.pattern.model.Circulo;
import visitor.pattern.model.Cuadrado;

public class JSONExportVisitor implements Visitor {

	@Override
	public void export(Circulo circulo) {
		Gson gson = new Gson();
		String jsonString = gson.toJson(circulo);
		System.out.println();
		System.out.println("JSON Circulo");
		System.out.println(jsonString);
	}

	@Override
	public void export(Cuadrado cuadrado) {
		Gson gson = new Gson();
		String jsonString = gson.toJson(cuadrado);
		System.out.println();
		System.out.println("JSON Cuadrado");
		System.out.println(jsonString);
	}

}
