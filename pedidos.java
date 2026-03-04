public class pedidos {
  private int id;
  private int cliente_id;
  private int producto_id;
  private int cantidad;
  private String fecha;
  public productos(int id, int cliente_id ,int producto_id, int cantidad, String fecha) {
    this.id = id;
    this.cliente_id = cliente_id;
    this.producto_id = producto_id;
    this.cantidad=cantidad;
    this.fecha=fecha;
  }

  public int getId() { return id; }
  public String getclienteid(){return cliente_id;}
  public int getproductoid(){return email;}
  public int getcantidad(){return cantidad;}
  public String getfecha(){return fecha;}
  public void setid(int id){this.id=id;}
  public void setclienteid(int cliente_id){this.cliente_id=cliente_id}
  public void setproductoid(int producto_id){this.producto_id=producto_id}
  public void setcantidad(int cantidad){this.cantidad=cantidad}
  public void setfecha(String fecha){this.fecha=fecha}
  public void setclienteid(int cliente_id) { this.cliente_id = cliente_id; }
  public void setcantidad(int cantidad) { this.cantidad = cantidad; }
  public void setproductoid(int producto_id) { this.producto_id = producto_id; }
  public void setfecha(String fecha) { this.fecha = fecha; }


  @Override
  public String toString() {
    return id + "," + cliente_id + "," + producto_id +","+cantidad,+","+fecha;
  }
}
      