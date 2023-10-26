package modelos;

import gui.VentanaPrincipal;

/**
 *
 * @author GESTEC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Glosario glosario = new Glosario("res/archivoGlosario.txt");
        VentanaPrincipal ventana = new VentanaPrincipal(glosario);
        ventana.setVisible(true);
    }
    
}
