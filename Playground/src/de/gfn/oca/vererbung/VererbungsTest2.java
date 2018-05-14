package de.gfn.oca.vererbung;

/**
 *
 * @author tlubowiecki
 */
public class VererbungsTest2 {
    
    public static void main(String[] args) {
        
        Mutter m = new Mutter();
        System.out.println(m.zahl);
        m.zeigeZahl();
        
        System.out.println("-------");
        
        Kind k = new Kind();
        System.out.println(k.zahl);
        k.zeigeZahl();
        
        System.out.println("-------");
        
        Mutter m1 = new Kind();
        System.out.println(m1.zahl);
        m1.zeigeZahl();
        
        AbstractMensch am = new Mutter();
        am.zeigeZahl();
        
    }
    
}

abstract class AbstractMensch {
    
    int i;
    
    abstract void zeigeZahl();
    
    void showI() {
        System.out.println(i);
    }
    
}


class Mutter extends AbstractMensch {
    
    int zahl = 10;
    
    void zeigeZahl() {
        System.out.println(zahl);
    }
    
    Number zeigeAndereZahl(int i) {
        return 1;
    }
    
}

class Kind extends Mutter {
    
    int zahl = 20;
    
    void zeigeZahl() {
        System.out.println(zahl);
    }
    
    Byte zeigeAndereZahl(int i) {
        return 1;
    }
}
