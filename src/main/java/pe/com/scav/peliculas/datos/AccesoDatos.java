package pe.com.scav.peliculas.datos;
import pe.com.scav.peliculas.domain.Pelicula;
import java.util.*;
import pe.com.scav.peliculas.excepciones.*;
public interface AccesoDatos {
    
    public boolean existe (String nombreArchivo)throws AccesoDatosEx;
    
    public List<Pelicula> listar (String nombreArchivo)throws EscrituraDatosEx;
    
    public void  escribir(Pelicula pelicula, String nombreArchivo,boolean anexar)throws EscrituraDatosEx;
    
    public String buscar(String nombreArchivo, String buscar) throws LecturaDatosEx;
       
    public void crear(String nombreArchivo) throws AccesoDatosEx;
    
    public void borrar (String nombreArchivo)throws AccesoDatosEx;;
}
