package de.gfn.oca.aufgabenblatt3.aufgabe2;

import java.util.Scanner;

/**
 *
 * @author tlubowiecki
 */
public class ProgrammArgumentTest {
    
    public static void main(String[] args) throws MyException {
    
        Scanner s = new Scanner(System.in);
        
        while(true) {
            System.out.print("Zahl:");
            int zahl = s.nextInt();
            if(zahl < -10000 || zahl > 10000) {
                throw new MyException(123, "Fehler");
            }
            
        }
    }
}
