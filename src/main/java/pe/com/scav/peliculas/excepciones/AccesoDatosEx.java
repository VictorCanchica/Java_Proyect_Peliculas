package pe.com.scav.peliculas.excepciones;

public class AccesoDatosEx extends Exception {

    String mensaje;

    public AccesoDatosEx(String mensaje) {
        this.mensaje = mensaje;
    }
}
