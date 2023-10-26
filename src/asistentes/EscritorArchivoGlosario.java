package asistentes;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.List;
import modelos.Termino;

public class EscritorArchivoGlosario {
    private final String archivo;

    public EscritorArchivoGlosario(String archivo) {
        this.archivo = archivo;
    }

    public void escribir(List<Termino> terminos) {
        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(archivo), "UTF-8"))) {
            for (Termino termino : terminos) {
                writer.write(termino.getNombre() + " -> ");
                writer.write(termino.getDescripcion());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}