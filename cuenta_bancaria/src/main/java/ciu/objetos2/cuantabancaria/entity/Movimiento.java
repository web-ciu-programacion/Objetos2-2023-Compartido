package ciu.objetos2.cuantabancaria.entity;

public class Movimiento {

	private Double monto;
	private TipoMovimiento tipoDeMovimiento;
	private String comentario;

	public Movimiento(Double monto, TipoMovimiento tipoDeMovimiento, String comentario) {
		this.monto = monto;
		this.tipoDeMovimiento = tipoDeMovimiento;
		this.comentario = comentario;
	}

	public Double getMonto() {
		return monto;
	}

	public TipoMovimiento getTipoDeMovimiento() {
		return tipoDeMovimiento;
	}

	public String getComentario() {
		return comentario;
	}
}
