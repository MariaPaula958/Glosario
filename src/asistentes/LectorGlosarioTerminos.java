package asistentes;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author danie
 */
public class LectorGlosarioTerminos {
    
    public String leerTermino(String path) throws IOException{
        
        Charset charset = Charset.forName("UTF-8");
        Path inFile = Paths.get(path);
        BufferedReader reader = Files.newBufferedReader(inFile, charset);
        
        String line = null;
        String result = "";

        for (int i = 0; (line = reader.readLine()) != null; i++){
            if(i%2==0){
                result += line.toUpperCase() + "\n";
                System.out.println(i + ": " + line);
            }
        }
        
        reader.close();
        
        return result;
    }
    
    public String leerTermino(String path, String nombreTermino) throws IOException{
        
        Charset charset = Charset.forName("UTF-8");
        Path inFile = Paths.get(path);
        BufferedReader reader = Files.newBufferedReader(inFile, charset);
        
        String line = null;
        String result = "";
        
        int index = 0;
        
        while ((line = reader.readLine()) != null) 
	{
            // Put the line read on upper case
            // (example of processing the received data)
 
            result = line.toUpperCase();
 
            // And display it to the standard output
            // (example of what to do with the processed data)
 
            System.out.println(index + ": " + result);
            
            if(result.equals(nombreTermino.toUpperCase())){
                if (reader.readLine() != null){
                    result = reader.readLine();
                    break;
                } else {
                    return "Error.";
                }
            }
 
            // Update the line index counter for the next line
 
            index ++;
    	}
        
        reader.close();
        
        return result;
    }
    
}
