package pe.com.scav.peliculas.datos;

import java.io.*;
import java.util.*;
import pe.com.scav.peliculas.domain.Pelicula;

public class AccesoDatosImpl implements AccesoDatos {

    @Override
    public boolean existe(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        return archivo.exists();
    }

    @Override
    public List<Pelicula> listar(String nombreArchivo) {
        BufferedReader entrada = null;
        List<Pelicula> peliculas = new ArrayList();
        try {
            File archivo = new File(nombreArchivo);
            entrada = new BufferedReader(new FileReader(nombreArchivo));
            String linea = null;
            linea = entrada.readLine();
            while (linea != null) {
                Pelicula pelicula = new Pelicula(linea);
                peliculas.add(pelicula);
                linea = entrada.readLine();
            }

            entrada.close();

        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
        return peliculas;
    }

    @Override
    public void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) {
        PrintWriter salida = null;
        try {
            File archivo = new File(nombreArchivo);
            salida = new PrintWriter(new FileWriter(nombreArchivo, anexar));
            salida.println(pelicula.toString());
            salida.println();
            salida.close();
            System.out.println("Pelicula Agregada");

        } catch (IOException ex) {
            ex.printStackTrace(System.out);

        }

    }

    @Override
    public String buscar(String nombreArchivo, String buscar) {
        BufferedReader entrada = null;

        File archivo = new File(nombreArchivo);
        int i = (-1);
        String resultado = "Pelicula no encontrada";
        String linea = null;
        try {
            entrada = new BufferedReader(new FileReader(nombreArchivo));
            linea = entrada.readLine();
            while (linea != null) {
                if (buscar != null && buscar.equalsIgnoreCase(linea)) {
                    resultado = "Pelicula: " + linea + "se encuentra en el indice " + i;
                    break;
                }
                linea = entrada.readLine();
                i++;
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
        return resultado;
    }
    @Override
    public void crear(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo));
            salida.close();
            System.out.println("Archivo creado correctamente");
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }

    
    @Override
    public void borrar(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        archivo.delete();
        System.out.println("Archivo borrado correctamente");
    }


}
 