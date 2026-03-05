import java.io.*;
import java.util.*;

public class pedidos {

    private int id;
    private int cliente_id;
    private int producto_id;
    private int cantidad;
    private String fecha;

    public pedidos(int id, int cliente_id, int producto_id, int cantidad, String fecha) {
        this.id = id;
        this.cliente_id = cliente_id;
        this.producto_id = producto_id;
        this.cantidad = cantidad;
        this.fecha = fecha;
    }

    public int getId() { return id; }
    public int getCliente_id() { return cliente_id; }
    public int getProducto_id() { return producto_id; }
    public int getCantidad() { return cantidad; }
    public String getFecha() { return fecha; }

    public void setId(int id) { this.id = id; }
    public void setCliente_id(int cliente_id) { this.cliente_id = cliente_id; }
    public void setProducto_id(int producto_id) { this.producto_id = producto_id; }
    public void setCantidad(int cantidad) { this.cantidad = cantidad; }
    public void setFecha(String fecha) { this.fecha = fecha; }

    @Override
    public String toString() {
        return id + "," + cliente_id + "," + producto_id + "," + cantidad + "," + fecha;
    }

   
    public static void clientesConCompras() {

        Set<Integer> clientesCompraron = new HashSet<>();
        List<String> nombres = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("pedidos.csv"))) {

            String linea = br.readLine();

            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                clientesCompraron.add(Integer.parseInt(datos[1]));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader br = new BufferedReader(new FileReader("clientes.csv"))) {

            String linea = br.readLine();

            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                int id = Integer.parseInt(datos[0]);

                if (clientesCompraron.contains(id)) {
                    nombres.add(datos[1]);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

       
        for (int i = 0; i < nombres.size() - 1; i++) {
            for (int j = 0; j < nombres.size() - i - 1; j++) {

                if (nombres.get(j).compareTo(nombres.get(j + 1)) > 0) {

                    String temp = nombres.get(j);
                    nombres.set(j, nombres.get(j + 1));
                    nombres.set(j + 1, temp);
                }
            }
        }

        System.out.println("\nClientes que han realizado compras:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}