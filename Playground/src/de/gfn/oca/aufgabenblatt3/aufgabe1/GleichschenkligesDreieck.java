package de.gfn.oca.aufgabenblatt3.aufgabe1;

/**
 *
 * @author tlubowiecki
 */
public class GleichschenkligesDreieck extends DreieckArten {

    public GleichschenkligesDreieck(int ab, int c) {
        super(ab, ab, c);
    }
    
    @Override
    public int berechneWinkel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int hoehe() {
        return (int) Math.round(Math.sqrt(getA() * getA() - Math.pow(getC()/2, 2)));
    }
    
}
