public class clientes {
  private int id;
  private String nombre;
  private String email;
  public productos(int id, String nombre, String email) {
    this.id = id;
    this.nombre = nombre;
    this.categoria = email;
  }

  public int getId() { return id; }
  public String getnombre(){return nombre;}
  public String getemail(){return email;}
  public void setid(int id){this.id=id;}
  public void setNombre(String nombre) { this.nombre = nombre; }
  public void setemail(String categoria) { this.email = email; }

  @Override
  public String toString() {
    return id + "," + nombre + "," + email;
  }
}
      