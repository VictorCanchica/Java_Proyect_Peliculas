package pe.com.scav.peliculas.negocio;
public interface CatalogoPeliculas {
    //creamos los metodos que seran implementados en catalogoPeliculasImpl
    
    
    public void agregarPelicula(String nombrePelicula, String nombreArchivo);
    
    public void listarPeliculas(String nombreArchivo);
    
    public void buscarPelicula(String buscar, String nombreArchivo);
    
    public void iniciarArchivo(String nombreArchivo);
    
}
