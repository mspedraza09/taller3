public class Producto {
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
  public String getNombre(){return nombre;}
  public int getStock(){return stock;}
  public float getPrecio(){return precio;}
  public String getCategoria(){return categoria;}
  public void setId(int id){this.id=id;}
  public void setNombre(String nombre) { this.nombre = nombre; }
  public void setPategoria(String categoria) { this.categoria = categoria; }
  public void setPrecio (float precio) { this.precio = precio; }
  public  void setStock(int stock){this.stock=stock;}

  @Override
  public String toString() {
    return id + "," + nombre + "," + categoria + "," + precio +","+stock;
  }
}
      