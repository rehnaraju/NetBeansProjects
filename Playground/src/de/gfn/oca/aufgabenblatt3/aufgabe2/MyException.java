package de.gfn.oca.aufgabenblatt3.aufgabe2;

/**
 *
 * @author tlubowiecki
 */
public class MyException extends Exception {
    
    private int meldungsNr;

    public MyException(String message) {
        super(message);
    }
    
    public MyException(int meldungsNr, String message) {
        super(message + " " + meldungsNr);
        this.meldungsNr = meldungsNr;
    }

    public int getMeldungsNr() {
        return meldungsNr;
    }
}
