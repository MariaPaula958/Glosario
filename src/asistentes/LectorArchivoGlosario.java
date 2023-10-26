package asistentes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import modelos.Termino;

/**
 * Clase la cual leera el archivo de texto y guardara los terminos
 * 
 * @author Daniel Antolinez
 * @author Maria Paula Rodriguez
 * @version 20231026
 */
public class LectorArchivoGlosario {

    public LectorArchivoGlosario(String archivo) {
    }
    
    /**
     * Metodo que leera el archivo y retornará una lista de Terminos
     * a la clase que llama el metodo
     * 
     * @param archivo
     * @return List
     */
    public List<Termino> leerArchivo(String archivo) {
        List<Termino> terminos = new ArrayList<>();
        String linea;

        try {
            BufferedReader br = new BufferedReader(new FileReader(archivo));

            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(" -> ");
                String nombre = datos[0];
                String descripcion = datos[1];

                Termino termino = new Termino(nombre, descripcion);
                terminos.add(termino);
            }

            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return terminos;
    }
    
}