package de.gfn.oca.persistanze;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tlubowiecki
 */
public class SerializeTest {
    
    public static void main(String[] args) {
        
//        List<SerTestObj> liste = new ArrayList<>();
//        SerTestObj o1 = new SerTestObj();
//        o1.setText("Das ist ein Haus von Nikigraus!");
//        liste.add(o1);
//        
//        SerTestObj o2 = new SerTestObj();
//        o2.setText("Das ist ein anderer Text...");
//        liste.add(o2);
//        
//        // Datei einlesen
//        try(FileOutputStream fos = new FileOutputStream("test.ser");
//                ObjectOutputStream oos = new ObjectOutputStream(fos)) {
//            
//            oos.writeObject(liste);
//            
//        }
//        catch(FileNotFoundException ex) {
//            System.out.println("Datei nicht gefunden");
//        }
//        catch(IOException ex) {
//            System.out.println("Daten konnten nicht geschrieben werden");
//            System.out.println(ex.getMessage());
//        }
        
        
        // Datei einlesen
        try(FileInputStream fis = new FileInputStream("test.ser");
                ObjectInputStream ois = new ObjectInputStream(fis)) {
            
            ArrayList<SerTestObj> fromFile = (ArrayList<SerTestObj>) ois.readObject();
            for(SerTestObj o : fromFile) {
                System.out.println(o.getText());
                System.out.println(o.getZahl());
            }
        }
        catch(ClassNotFoundException ex) {
            System.out.println("Problem mit Daten");
        }
        catch(FileNotFoundException ex) {
            System.out.println("Datei nicht gefunden");
        }
        catch(IOException ex) {
            System.out.println("Daten konnten nicht gelesen werden");
        }
    }
}

class SerTestObj implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private String text;
    
    private String zahl;
    
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    
    public String getZahl() {
        return zahl;
    }

    public void setZahl(String zahl) {
        this.zahl = zahl;
    }
}
