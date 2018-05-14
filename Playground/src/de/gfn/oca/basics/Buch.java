package de.gfn.oca.basics;

/**
 *
 * @author tlubowiecki
 */
public class Buch {
    
    // Instanzvariablen
    private String autor;
    public String titel;
    
    // Instanzkonstante
    public final double PI = 3.14;
    
    // Klassenvariable
    public static String kleinerText = "Das ist mein Text";
    
    // Klassenkonstante
    public static final double PI_STATIC = 3.14;

    public Buch() {
        super();
    }
    
    public String Buch(String titel) {
        this.titel = titel;
        return "Moin";
    }
    
    public void machWas() {
        System.out.println(autor + ", " + titel);
        machWasStatic();
    }
    
    public static void machWasStatic() {
        System.out.println("Hallo statische Welt!");
        //machWas();
    }
}