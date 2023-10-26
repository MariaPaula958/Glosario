package modelos;

/**
 * Clase que crea la estructura del Termino guardado en el glosario.
 * 
 * @author Daniel Antolinez
 * @author Maria Paula Rodriguez
 * @version 20231026
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
