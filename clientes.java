import java.io.*;
import java.util.*;

public class clientes {

    private int id;
    private String nombre;
    private String email;

    public clientes(int id, String nombre, String email) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
    }

    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public String getEmail() { return email; }

    public void setId(int id) { this.id = id; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setEmail(String email) { this.email = email; }

    @Override
    public String toString() {
        return id + "," + nombre + "," + email;
    }

    
    public static void agregarCliente() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese email: ");
        String email = scanner.nextLine();

        int nuevoId = 1;

        try (BufferedReader br = new BufferedReader(new FileReader("clientes.csv"))) {

            String linea = br.readLine();

            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                nuevoId = Integer.parseInt(datos[0]) + 1;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("clientes.csv", true))) {

            bw.write(nuevoId + "," + nombre + "," + email);
            bw.newLine();
            System.out.println("Cliente agregado correctamente.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}