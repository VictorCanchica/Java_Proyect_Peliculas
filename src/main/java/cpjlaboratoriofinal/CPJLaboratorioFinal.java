package cpjlaboratoriofinal;
import java.util.Scanner;
import pe.com.scav.peliculas.negocio.*;

public class CPJLaboratorioFinal {

    private static final Scanner scanner = new Scanner(System.in);
    private static int opcion = -1;
    private static final String nombreArchivo = "c:\\catalogoPeliculas\\peliculas.txt";
    private static final CatalogoPeliculas cp = new CatalogoPeliculasImpl();

    public static void main(String[] args) {

    while (opcion != 0) {
        try {
            System.out.println("Elige opcion:"
                        + "\n1.- Iniciar catalogo peliculas"
                        + "\n2.- Agregar pelicula"
                        + "\n3.- Listar Peliculas"
                        + "\n4.- Buscar Pelicula"
                        + "\n0.- Salir");            
                
                opcion = Integer.parseInt(scanner.nextLine());

                
                switch (opcion) {
                    case 1:
                      cp.iniciarArchivo(nombreArchivo);
                        break;
                    case 2:
                        System.out.println("Introduce el nombre de una pelicula a agregar:");
                        String nombre = scanner.nextLine();
                      cp.agregarPelicula(nombre, nombreArchivo);
                        break;
                    case 3:
                      cp.listarPeliculas(nombreArchivo);
                        break;
                    case 4:
                        System.out.println("Introduce el nombre de una pelicula a buscar:");
                        String buscar = scanner.nextLine();
                      cp.buscarPelicula(nombreArchivo, buscar);
                        break;
                    case 0:
                        System.out.println("¡ Adios n_n !");
                        break;
                    default:
                        System.out.println("Opcion no reconocida");
                        break;
                }
                System.out.println("\n"); 

            } catch (Exception e) {
                System.out.println("Error!");
            }
        }
    }
}
  

