package modelos;

import asistentes.EscritorGlosarioTerminos;
import asistentes.LectorGlosarioTerminos;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author danie
 */
public class Glosario {
    
    EscritorGlosarioTerminos escritor;
    LectorGlosarioTerminos lector;

    public Glosario() {
        
    }
    
    public boolean agregarTermino(String nombreTermino, String descripcionTermino){
        if(nombreTermino == null | descripcionTermino == null){
            return false;
        } else {
            escritor = new EscritorGlosarioTerminos();
            try {
                escritor.escribirTermino("res/archivoGlosario.txt", nombreTermino, descripcionTermino);
            } catch (IOException ex) {
                return false;
            }
            return true;
        }
    }
    
    public String buscarTermino(String nombreTermino){
        String descripcion;
        try{
            lector = new LectorGlosarioTerminos();
            descripcion = lector.leerTermino("res/archivoGlosario.txt", nombreTermino);
        }catch (IOException e){
            return null;
        }
        return descripcion;
    }
    
    public String listarTerminos(){
        
        String resultado = "";
        try {
            lector = new LectorGlosarioTerminos();
            resultado = lector.leerTermino("res/archivoGlosario.txt");
        } catch (IOException e) {
            return null;
        }
        
        return resultado;
        
    }
    
}
