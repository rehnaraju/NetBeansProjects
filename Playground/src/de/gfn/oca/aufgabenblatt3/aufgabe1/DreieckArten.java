package de.gfn.oca.aufgabenblatt3.aufgabe1;

/**
 *
 * @author tlubowiecki
 */
public abstract class DreieckArten implements FlaechenInhalt{
    
    private final int a;
    
    private final int b;
    
    private final int c;

    public DreieckArten(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }
    
    public int flaeche() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public int umfang() {
        return a + b + c;
    }
    
    public abstract int berechneWinkel();
}
