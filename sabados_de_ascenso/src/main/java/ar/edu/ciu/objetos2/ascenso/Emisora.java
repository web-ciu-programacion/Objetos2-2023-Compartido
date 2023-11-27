package ar.edu.ciu.objetos2.ascenso;

/*
 *  Observador concreto.
 */
public class Emisora {

    private String descripcion;
    private Partido partidoTransmitido;
    private EstadoEmisora estado;
    private Manager manager;

    public Emisora(String descripcion) {
        super();
        this.descripcion = descripcion;
    }

    public void notificarAOyentes(Evento unEvento) {
        if (unEvento.getPartipo()!=this.partidoTransmitido)
            this.estado.notificar(this, unEvento);
    }

    public void generarNotificacion(Integer minuto, String descripcion) {
        Evento evento = new Evento(this.partidoTransmitido, minuto, descripcion);
        this.manager.notificarAEmisoras(evento);
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public void setPartidoTransmitido(Partido partidoTransmitido) {
        this.partidoTransmitido = partidoTransmitido;
    }

	public EstadoEmisora getEstado() {
		return estado;
	}

	public void setEstado(EstadoEmisora estado) {
		this.estado = estado;
	}
}
