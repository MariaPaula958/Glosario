package asistentes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author danie
 */
public class EscritorGlosarioTerminos {
    
    public void escribirTermino(String path, String nombreTermino, String descripcionTermino) throws IOException{
        // Define the charset for the text
 
        Charset charset = Charset.forName("UTF-8");
 
	// Locate the file to be read
 
	Path inFile = Paths.get(path);
 
	// Open the reader from the specific input file using the charset
 
	BufferedReader reader = Files.newBufferedReader(inFile, charset);
 
	//////////////////////////////////////////////////////
 
	// Define the location for the output file
 
	Path outFile = Paths.get(path);
 
	// Open the writer to the specific output file using the charset
 
	BufferedWriter writer = Files.newBufferedWriter(outFile, charset);
 
	//////////////////////////////////////////////////////
 
	// Define an object to store each line read from file
 
	String line = null;
 
	// Define an index for each line read from file
 
	int index = 0;
 
	// While there are lines to be read on file do the stuff.
	// In case there are not more lines to be read from the file
	// (the "end of the file" has been reached) the reading will
	// return null
 
        while (reader.readLine() != null) 
        {
                // Put the line read on upper case
                // (example of processing the received data)

                if(reader.readLine() == null){
                    
                    String result = nombreTermino.toUpperCase() + "\r\n" + descripcionTermino.toUpperCase() + "\r\n";

                    result = result + "\r\n";

                    // Write the result data to the destination file

                    writer.write(result, 0, result.length());

                }
                // Update the line index counter for the next line

                index ++;
        }

        //////////////////////////////////////////////////////

        // Close the reader and writer objects, this ensure that
        // their buffers will be flushed and all its contents will
        // be written to the disk

        reader.close();
        writer.close();
                
    }
    
}
