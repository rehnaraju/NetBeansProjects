package de.gfn.oca.flowcontrol;

/**
 *
 * @author itomski
 */
public class FlowControlTest {
    
    public static void main(String[] args) {
        
        if(true) {
            
        }
        else {
            
        }
        
        
        if(true)
            System.out.println("Moin");
        else
            System.out.println("Nix");
        
        
        if(true) {
            
        }
        else if(true) {
            
        }
        else if(true) {
            
        }
        else {
            
        }
        
        
        if(true)
            System.out.println("Moin");
        else 
            if(true)
                System.out.println("Nix");
            else 
                if(true)
                    System.out.println("Ende");
                else;
        
        int i = 10;
        
        // Ternary-Operator
        String s = (i < 10)? "Moin" : (i > 20)? "Groß": "Klein";
        
        System.out.println("-----------------");
        
        Wochentage w = Wochentage.DI;
        
        switch(w) {
            case MO:
                System.out.println("Montag");
                break;
            case DI:
                System.out.println("Dienstag");
            case MI:
                System.out.println("Mittwoch");
            case DO:
                System.out.println("Donnerstag");
            case FR:
                System.out.println("Freitag");
            case SA:
                System.out.println("Samstag");
            case SO:
                System.out.println("Sonntag");
        }
        
        System.out.println("---------------");
        
        int j = 40;
        
        final int a = 10;
        final int b = 20;
        
        switch(j) {
            default:
                System.out.println("30...");
            
            case a:
                System.out.println("10...");
                break;
            case b:
                System.out.println("20...");
                break;
        }
    }
}

enum Wochentage {
    
    MO, DI, MI, DO, FR, SA, SO;
    
}
