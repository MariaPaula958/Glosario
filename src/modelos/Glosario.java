package modelos;

import asistentes.EscritorArchivoGlosario;
import asistentes.LectorArchivoGlosario;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase control en la cual se utilizarán los metodos que almacenarán y gestionarán
 * los Terminos guardados.
 * 
 * @author Daniel Antolinez
 * @author Maria Paula Reodriguez
 * @version 20231026
 */
public class Glosario {
    private List<Termino> terminos;
    private final String archivo;

    public Glosario(String archivo) {
        this.archivo = archivo;
        terminos = new ArrayList<>();
    }

    /**
     * Guardara el termino en una lista y llamara el metodo escribirArchivo.
     * 
     * @param termino 
     */
    public void guardarTermino(Termino termino) {
        terminos.add(termino);
        escribirArchivo();
    }

    /**
     * Crea un Objeto de EscritorArchivoGlosario().
     * Escribirá en un archivo .txt la lista de Terminos guardados
     */
    public void escribirArchivo() {
        EscritorArchivoGlosario escritor = new EscritorArchivoGlosario(archivo);
        escritor.escribir(terminos);
    }

    /**
     * Crea un objeto de LectorArchivoGlosario().
     * Leera el archivo de texto el cual contendra los Terminos guardados
     */
    public void leerArchivo() {
        LectorArchivoGlosario lector = new LectorArchivoGlosario(archivo);
        terminos = lector.leerArchivo(archivo);
    }
    
    /**
     * Clase la cual va a buscar en la lista de 
     * Terminos una coincidencia de busqueda
     * 
     * @param nombre
     * @return String
     */
    public String buscarTermino(String nombre) {
        leerArchivo();
        for (Termino termino : terminos) {
            if (termino.getNombre().equals(nombre)) {
                return termino.getDescripcion();
            }
        }
        return null;
    }
    
    /**
     * Clase que retornará un String con todos los terminos guardados.
     * 
     * @return String
     */
    public String listarTerminos() {
        leerArchivo();
        String lista = "";
        for (Termino termino : terminos) {
            lista = lista + termino.getNombre() + " - " + termino.getDescripcion() + "\n";
        }
        return lista;
    }
}