package de.gfn.oca.basics;

import static java.lang.System.out;
import static de.gfn.oca.basics.Buch.*;


/**
 *
 * @author tlubowiecki
 */
public class Start {
    
    static String text = "Das ist ein kurzer Text";
    
    // psvm
    static public void main(String... args) {
        
        //sout
        System.out.println(text);
        
//        ArrayList list = new ArrayList();
//        HashSet set = new HashSet();
//        LinkedList list2 = new LinkedList();
        
        Buch b = new Buch();
        b.machWas();
        System.out.println(b.kleinerText);
        System.out.println(b.titel);
        
        System.out.println("---------");
        
        machWasStatic();
        System.out.println(kleinerText);
        
        System.out.println("---------");
        
        //Buch b2 = new Buch("Java ist auch eine Insel");
        //System.out.println(b2.kleinerText);
        
        System.out.println("---------");
        
        //b2.kleinerText = "Neuer Text";
        System.out.println(b.kleinerText);
        out.println(Buch.kleinerText);
        
        String s5 = "Moin";
        
        s5 = s5 + " Hamburg";
        
        String s6 = new String("Moin");
        
        String[] arr3 = new String[10];
        
        Object[][][] arr4 = new Object[10][][];
        
    }
}