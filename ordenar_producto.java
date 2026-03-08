import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.util.*;

public class CRUDAproductos{
    System.out.println("Dígite la opción que quiere realizar: \n1.Buscar producto por id\n2.Lista de
    productos de menor a mayor cantidad");
    switch (opcion){
        case 1:
            break;
        case 2:
            break;
        case 3:
            break;
    }

    public class CRUDAarchivos{
        private final Path archivo;
        private final String header = "id, nombre, categoria, precio, stock";

        //constructor
        public CRUDArchivos(String nombreArchivo) {
            this.archivo = Path.of(nombreArchivo);
        }
  
        private List<Productos> data = new ArrayLis<> //Para crear una lista de productos
        private final Map<id, Producto> idxid = new HashMap<>();
        private final Map<String, Producto> idxcategoria = new HashMap<>();

        private String norm(String s) {
            return (s == null) ? "" : s.trim().toLowerCase();
        }

        public void cargarTodo() throws IOException{
            asegurarArchivo(); 
            data = leerProductos;
            construirIndices;
        }
    }

}

//Verificar que el archivo exista
public void asegurarArchivo(){
    String nombreArchivo = "productos.cvs"
    File archivo = new File (nombreArchivo);

    if(!archivo.exists()){
        Files.createFile("pedidos.cvs")
    }
}

//Leer los productos 
public List<Usuario> leerProductos() throws IOException{
    List<String> lineas = File.readAllLines("productos.cvs");
    List<Productos> productos = new ArrayList<>();

    for (int i = 1; i < lineas.size();i++){
        String[] partes = lineas.get(i);

        int id = Integer.parseInt(partes[0]);
        String nombre = partes[1];
        String categoria = partes[2];
        float precio = Float.parseFloat(partes[3]);
        int stock = Integer.parseInt(partes[4]);
        
        productos.add(new Producto(id, nombre, categoria, precio, stock));
    }
}

