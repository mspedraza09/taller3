public class Productos {
  private int id;
  private String nombre;
  private String categoria;
  private float precio;
  private int stock; 
  public Productos(int id, String nombre, String categoria, float precio, int stock) {
    this.id = id;
    this.nombre = nombre;
    this.categoria = categoria;
    this.precio=precio;
    this.stock = stock;
  }

  public int getId() { return id; }
  public String getnombre(){return nombre;}
  public int getstock(){return stock;}
  public float getprecio(){return precio;}
  public String getcategoria(){return categoria;}
  public void setid(int id){this.id=id;}
  public void setNombre(String nombre) { this.nombre = nombre; }
  public void setcategoria(String categoria) { this.categoria = categoria; }
  public void setprecio (float precio) { this.precio = precio; }
  public  void setstock(int stock){this.stock=stock;}

  @Override
  public String toString() {
    return id + "," + nombre + "," + categoria + "," + precio +","+stock;
  }
}
      