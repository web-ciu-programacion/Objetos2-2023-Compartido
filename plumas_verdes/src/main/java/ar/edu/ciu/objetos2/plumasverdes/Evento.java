package ar.edu.ciu.objetos2.plumasverdes;

import java.time.LocalDateTime;

public class Evento {

	private LocalDateTime fechaYHora;
    private Omnibus omnibus;
    private Dec dec;

    public Evento(Omnibus omnibus, Dec dec) {
        this.omnibus = omnibus;
        this.dec = dec;
        this.fechaYHora = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return 
          "  ARRIBO a DEC: " + this.dec.getNumero() + " - " + this.dec.getDescripcion() + "\n" + 
          "  Fecha hora: " + this.fechaHora() + "\n" + 
          "  Interno: " + this.omnibus.getInterno() + "\n" + 
          "  Sentido: " + this.omnibus.getSentido().getDescripcion();
    }
	private String fechaHora() {
		return fechaYHora.getHour() + ":" + fechaYHora.getMinute() + ":" + fechaYHora.getSecond() + " - " + fechaYHora.getDayOfMonth() + "/" + fechaYHora.getMonthValue() + "/" + fechaYHora.getYear();
	}
}
