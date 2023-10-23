package visitor.pattern.visitor;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import visitor.pattern.model.Circulo;
import visitor.pattern.model.Cuadrado;

public class XMLExportVisitor implements Visitor {

	@Override
	public void export(Circulo circulo) {
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(Circulo.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			StringWriter sw = new StringWriter();
			jaxbMarshaller.marshal(circulo, sw);
			String xmlString = sw.toString();
			System.out.println();
			System.out.println("XML Circulo");
			System.out.println(xmlString);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void export(Cuadrado cuadrado) {
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(Cuadrado.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			StringWriter sw = new StringWriter();
			jaxbMarshaller.marshal(cuadrado, sw);
			String xmlString = sw.toString();
			System.out.println();
			System.out.println("XML Cuadrado");
			System.out.println(xmlString);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
}