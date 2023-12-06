package ar.edu.ciu.objetos2.plumasverdes;

public interface Observador {

	public void setSujeto(Sujeto sujeto);

	/*
	 *  Actualiza la información del Led con el último Evento.
	 */
	public void acutalizar(Evento evento);
	
	/*
	 *  Genera el Evento al arrbibar el omnibus a la parada.
	 */
	public void arribo(Omnibus omnibus);

}