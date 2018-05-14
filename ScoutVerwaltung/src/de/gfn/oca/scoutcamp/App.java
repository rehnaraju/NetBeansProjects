package de.gfn.oca.scoutcamp;

import de.gfn.oca.scoutcamp.entity.Scout;
import de.gfn.oca.scoutcamp.helper.ScoutHelper;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tlubowiecki
 */
public class App {
    
    private List<Scout> scouts = new ArrayList<>();
    
    private static final String CONTROLS = 
              "\n----------------------------\n"
            + "  N: Neuen Scout anlegen\n"
            + "  L: Alle Scouts auflisten\n"
            + "  X: Programm verlassen\n"
            + "----------------------------\n\n";
    
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("START");
        System.out.println(CONTROLS);
        
        App app = new App();
    
         //TODO: Scouts aus Datenbank oder Datei lesen
         
        try(FileInputStream fis=new FileInputStream("data.ser");
                ObjectInputStream ois =new ObjectInputStream(fis)){
            app.scouts=(List<Scout>)ois.readObject();
            
        }
        catch(FileNotFoundException ex)
        {
            System.out.println("Keine Daten");
        }
        catch(IOException ex)
        {
            System.out.println("can't read this file");
        }
        catch(ClassNotFoundException ex)
        {
            System.out.println("can't find class");
        }
         
        
        
        
        //TODO: Scouts aus Datenbank oder Datei lesen
        boolean exit = false;
        
        while(!exit) {
            
            switch(scanner.next().toUpperCase()) {
                
                case "N":
                    System.out.println("Gib die Daten des Scouts ein.");
                    app.scouts.add(ScoutHelper.setByInput(new Scout(), scanner));
                    System.out.println("Scout wurde gespeichert.");
                    break;
                    
                case "L":
                    System.out.println("\n-----------------");
                    for(Scout s : app.scouts) {
                        System.out.println(s);
                    }
                    System.out.println("\n-----------------\n\n");
                    break;
                    
                case "X": System.out.println("Exit");
                    exit = true;
                    break;
            }
        }
    }
}
    
        
    
    
      /*  private void read()
        {
        //TODO: Scouts in die Datenbank oder Datei schreiben
        try(FileOutputStream fos=new FileOutputStream("data.ser");
                ObjectOutputStream oos=new ObjectOutputStream(fos))
        {
            oos.writeObject(app.scouts);
        }
        
      catch (IOException ex) {
            System.out.println("");
        }
        }*/
    

