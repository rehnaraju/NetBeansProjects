package de.gfn.oca.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Array;
import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.NClob;
import java.sql.PreparedStatement;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Savepoint;
import java.sql.Statement;
import java.sql.Struct;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tlubowiecki
 */
public class ExceptionTest {
    
    private static final Logger LOG = Logger.getLogger("First");
    
    public static void main(String[] args) {
        
        String s = null;
        
        try {
            //System.out.println(args[6]);
            System.out.println(s.contains("Moin"));
            System.out.println("+++++");
        }
        catch(ArrayIndexOutOfBoundsException ex) {
            System.out.println("Es gibt ein INDEX Problem!");
        }
        catch(NullPointerException ex) {
            System.out.println("Es gibt ein NULL Problem!");
        }
        
        try {
            readDataFromFile("test.txt");
        }
//        catch(FileNotFoundException ex) {
//            System.out.println("Datei nicht gefunden!");
//        }
//        catch(IOException ex) {
//            System.out.println("Datei konnte nicht gelesen werden!");
//        }
        catch(Exception ex) {
            //LOG.log(Level.INFO, "Das ist ein Haus von Nikigraus");
            System.out.println("Problem!");
        }
        finally {
            System.out.println("Nach dem Problem!");
        }
        
        //readLocalData(25);
    }
    
    public static String readDataFromFile(String fileName) throws IOException{
        try {
            FileInputStream fis = new FileInputStream(fileName);
            fis.read();
        }
        finally {
            System.out.println("ENDE");
        }
        return null;
    }
    
    public static String readLocalData(int pos) throws IllegalArgumentException {
        
        String[] data = new String[10]; 
        
        String wert = null;
        
        try {
            wert = data[pos];
        }
        catch(Exception ex) {
            ex = new Exception("Ganz böser Fehler");
            throw new IllegalArgumentException();
        }
        
        try {
            wert = data[pos];
        }
        catch(NullPointerException | ArrayIndexOutOfBoundsException ex) {
            //ex = new Exception("Ganz böser Fehler");
            System.out.println(ex.getMessage());
            //throw new IllegalArgumentException();
        }
        catch(Exception ex) {
            
        }
        
        return wert;
    }
}
