package ar.edu.ciu.objetos2.plumasverdes;

public interface Sujeto {

	public void agregar(Observador observador);
	public void quitar(Observador observador);
	public void notificar(Evento evento);
}
