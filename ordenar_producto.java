import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.util.*;

public class CRUDAproductos{
    //Menú que se implementará en el main
    // System.out.println("Dígite la opción que quiere realizar: \n1.Buscar producto por id\n2.Lista de
    // productos de menor a mayor cantidad \nAgregar un producto");
    // switch (opcion){
    //     case 1:
            
    //         public Producto buscarPorId(int id) throws IOException {
    //         cargarTodo();
    //         return idxId.get(id);
    //         }
    //         break;
    //     case 2:
    //         break;
    //     case 3:
            
    //         public boolean crear(Producto nuevoProducto) throws IOException {
    //         cargarTodo();

    //         if (idxId.containsKey(nuevo.getId())) {
    //             System.out.println(" ID ya existe.");
    //             return false;
    //         }

    //         try (BufferedWriter bw = Files.newBufferedWriter(
    //             archivo, StandardOpenOption.CREATE, StandardOpenOption.APPEND)) {
    //             bw.write(nuevoProducto.toString());
    //             bw.newLine();
    //         }
    //             cargarTodo();
    //             return true;
    //         }
    //         break;
        
    // }
    

    public class CRUDAarchivos{
        private final Path archivo;
        private final String header = "id, nombre, categoria, precio, stock";

        //constructor
        public CRUDArchivos(String nombreArchivo) {
            this.archivo = Path.of(nombreArchivo);
        }
  
        private List<Producto> data = new ArrayList<> //Para crear una lista de productos
        private final Map<Integer, Producto> idxid = new HashMap<>();
        private final Map<String, Producto> idxcategoria = new HashMap<>();

        private String norm(String s) {
            return (s == null) ? "" : s.trim().toLowerCase();
        }

        private void cargarTodo() throws IOException{
            asegurarArchivo(); 
            data = leerProductos;
            construirIndices;
        }

        //Verificar que el archivo exista
        private void asegurarArchivo(){
            String nombreArchivo = "productos.cvs"
            File archivo = new File (nombreArchivo);

            if(!archivo.exists()){
                Files.createFile("pedidos.cvs")
            }
            else {
                // si existe pero está vacío, ponemos header
                List<string> lines = Files.readAllLines("pedidos.cvs");
                if (lines.isEmpty()) {
                    Files.write(archivo, List.of(header),
                    StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
                }
             }
        }
        
        //Leer los productos 
        private List<Producto> leerProductos() throws IOException{
            List<String> lineas = Files.readAllLines("productos.csv");
            List<Producto> productos = new ArrayList<>();

            for (int i = 1; i < lineas.size();i++){
                String[] partes = lineas.get(i).split(",");

                int id = Integer.parseInt(partes[0]);
                String nombre = partes[1];
                String categoria = partes[2];
                float precio = Float.parseFloat(partes[3]);
                int stock = Integer.parseInt(partes[4]);
        
                productos.add(new Producto(id, nombre, categoria, precio, stock));
            }
            return productos;
        }

        public void construirIndices(){
            idxid.clear();
            idxcategoria.clear();

            for(Producto u : data){
                idxid.put(u.getId(),u);
                String llaveCategoria = norm(u.getCategoria());
                idxcategoria.put(u.getCategoria);
                if (!idxcategoria.containsKey(ciudadKey)) {
                    idxcategoria.put(ciudadKey, new ArrayList<>());
                }
                idxCiudad.get(llaveCategoria).add(u);
            }

        }
        
        private void guardarTodo() throws IOException {
            List<String> out = new ArrayList<>();
            out.add(header);
            for (Producto u : data) out.add(u.toString());

            Files.write(archivo, out,
                StandardOpenOption.CREATE,
                StandardOpenOption.TRUNCATE_EXISTING);
            }


    }

}







