package de.gfn.oca.vererbung;

import java.util.function.Predicate;

/**
 *
 * @author tlubowiecki
 */
public class VererbungTest4 {
    
    public static void main(String[] args) {
        
        B b = new B();
        System.out.println(b.zahl);
        System.out.println(b.getAndereZahl());
        
        System.out.println("--------");
        
        A a = b;
        System.out.println(a.zahl);
        System.out.println(a.getAndereZahl());
        
    }
}

class A {
    
    static int zahl = 10;
    
    static int getZahl() {
        return zahl;
    }
    
    static int getAndereZahl() {
        return zahl + 2;
    }
}

class B extends A {
    
    //static int zahl = 15;
    
    static int getZahl() {
        getAndereZahl();
        return zahl;
    }
    
    static int getAndereZahl() {
        return zahl + 4;
    }
}

interface I {
    
    static int ZAHL = 10;
    
    static int getZahl() {
        return ZAHL;
    }
}

class IImpl implements I {
    
    static void machWas() {
        System.out.println(ZAHL);
        System.out.println(I.getZahl());
    }
}



