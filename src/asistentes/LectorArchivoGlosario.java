package asistentes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import modelos.Termino;

public class LectorArchivoGlosario {

    public LectorArchivoGlosario(String archivo) {
    }

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