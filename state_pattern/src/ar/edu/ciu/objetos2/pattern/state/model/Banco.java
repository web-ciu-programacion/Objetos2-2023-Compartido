package ar.edu.ciu.objetos2.pattern.state.model;

public class Banco {

  private String nombre;
  private String direccion;
  private Ventanilla ventanilla;

  public Banco() {
    ventanilla = new Ventanilla();
  }

  public void atender(Persona persona){
    System.out.println(persona.getNombre() + " ingresa a la fila");
    ventanilla.atender(persona);
  }

  public void suspenderVentanilla(){
    ventanilla.suspender();
  }

  public  void cerrarVentanilla(){
    ventanilla.cerrar();
  }

  public void abrirVentanilla(){
    ventanilla.abrir();
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getDireccion() {
    return direccion;
  }

  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }
}
