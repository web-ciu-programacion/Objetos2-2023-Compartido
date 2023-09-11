package ar.edu.ciu.objetos2.pattern.state.model;

// context
public class Ventanilla {

  private String cajero;
  private EstadoVentanilla estado;

  public Ventanilla() {
    this.estado = new Abierta();
  }

  public void atender(Persona persona) {
    estado.atender(persona);
  }

  public void suspender() {
    estado = new Suspendida();
  }

  public void cerrar() {
    estado = new Cerrada();
  }

  public void abrir() {
    estado = new Abierta();
  }

  public String getCajero() {
    return cajero;
  }

  public void setCajero(String cajero) {
    this.cajero = cajero;
  }
}
