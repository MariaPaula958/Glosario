package modelos;

import asistentes.EscritorArchivoGlosario;
import asistentes.LectorArchivoGlosario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author danie
 */
public class Glosario {
    private List<Termino> terminos;
    private final String archivo;

    public Glosario(String archivo) {
        this.archivo = archivo;
        terminos = new ArrayList<>();
    }

    public void guardarTermino(Termino termino) {
        terminos.add(termino);
        escribirArchivo();
    }

    public void escribirArchivo() {
        EscritorArchivoGlosario escritor = new EscritorArchivoGlosario(archivo);
        escritor.escribir(terminos);
    }

    public void leerArchivo() {
        LectorArchivoGlosario lector = new LectorArchivoGlosario(archivo);
        terminos = lector.leerArchivo(archivo);
    }

    public String buscarTermino(String nombre) {
        leerArchivo();
        for (Termino termino : terminos) {
            if (termino.getNombre().equals(nombre)) {
                return termino.getDescripcion();
            }
        }
        return null;
    }

    public String listarTerminos() {
        leerArchivo();
        String lista = "";
        for (Termino termino : terminos) {
            lista = lista + termino.getNombre() + " - " + termino.getDescripcion() + "\n";
        }
        return lista;
    }
}