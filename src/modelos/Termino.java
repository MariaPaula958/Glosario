package modelos;

/**
 *
 * @author danie
 */
public class Termino {
    
    private final String nombre;
    private final String descripcion;

    public Termino(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }
    
}
