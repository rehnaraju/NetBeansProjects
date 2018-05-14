package de.gfn.oca.aufgabenblatt3.aufgabe1;

/**
 *
 * @author tlubowiecki
 */
public class GleichseitigesDreieck extends DreieckArten {

    public GleichseitigesDreieck(int abc) {
        super(abc, abc, abc);
    }
    
    @Override
    public int berechneWinkel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int hoehe() {
        return (int) Math.round((getA()/2) * Math.sqrt(3.0));
    }
}
