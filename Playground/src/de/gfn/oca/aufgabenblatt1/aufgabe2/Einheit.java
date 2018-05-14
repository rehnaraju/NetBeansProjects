package de.gfn.oca.aufgabenblatt1.aufgabe2;

/**
 *
 * @author tlubowiecki
 */
public enum Einheit {
    M{
        @Override
        public String toString() {
            return "Meter";
        }
    }, 
    CM{
        @Override
        public String toString() {
            return "Zentimeter";
        }
    }, 
    MM{
        @Override
        public String toString() {
            return "Millimeter";
        }
    }, 
    KM{
        @Override
        public String toString() {
            return "Kilometer";
        }
    };
}
