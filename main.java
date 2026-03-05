import java.io.*;
import java.util.*;

public class main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int opcion;

        do {
            System.out.println("\n=MENU=");
            System.out.println("1. Ver productos ordenados por precio");
            System.out.println("2. Agregar nuevo cliente");
            System.out.println("3. Calcular total de ventas por producto");
            System.out.println("4. Ver clientes que han realizado compras");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Opción 1 funcionando");
                    break;
                case 2:
                    System.out.println("Opción 2 funcionando");
                    break;
                case 3:
                    System.out.println("Opción 3 funcionando");
                    break;
                case 4:
                    System.out.println("Opción 4 funcionando");
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida");
            }

        } while (opcion != 5);
    }
}