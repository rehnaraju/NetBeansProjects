package de.gfn.oca.aufgabenblatt1.aufgabe2;

/**
 *
 * @author tlubowiecki
 */
public class QuadratDefinition {
    
    private int a;
    private Einheit e;

    public QuadratDefinition(int a, Einheit e) {
        this.a = a;
        this.e = e;
    }
    
    public int flaeche() {
        return a * a;
    }
    
    public static int flaeche(QuadratDefinition q) {
        return q.a * q.a;
    }

    @Override
    public String toString() {
        return flaeche() + " " + e;
    }
    
    
}
