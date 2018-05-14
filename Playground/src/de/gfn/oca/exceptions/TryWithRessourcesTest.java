package de.gfn.oca.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author tlubowiecki
 */
public class TryWithRessourcesTest implements AutoCloseable {
    
    public static void main(String[] args) {
        
        FileInputStream fis = null;
        
        try {
            fis = new FileInputStream("test.txt");
        }
        catch(FileNotFoundException ex) {
            
        }
        finally {
            try {
                if(fis != null)
                    fis.close();
            }
            catch(IOException ex) {
                System.out.println("...");
            }
        }
        
        try(FileInputStream fis2 = new FileInputStream("test.txt");
                TryWithRessourcesTest t = new TryWithRessourcesTest()) {
            
        }
        catch(Exception ex) {
            System.out.println("...");
        }
        
        
    }

    @Override
    public void close() throws Exception {
        System.out.println("...");
    }
}
