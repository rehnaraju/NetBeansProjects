package de.gfn.oca.basics;

import java.util.Random;

/**
 *
 * @author tlubowiecki
 */
public class Datentypen {

    public static void main(String[] args) {

        Datentypen dt = new Datentypen();

        boolean b = true;

        byte b1 = 127;

        short s = 10000;

        int i = 10000000;

        long l = 100_000_000_000L;

        //dt.machWas(s);
        
        int z = 0x10110;
        System.out.println(Integer.toHexString(s));
        
        float f = 0.0f;
        double d = 0.0;
        
        char c = 'a';
        System.out.println(c);
        
        int x = c;
        System.out.println(x);
        
        c = 32500;
        System.out.println(c);
        
        
        int i3 = 1000;
        byte b2 = (byte)i3;
        System.out.println(b2);
        
        int i4 = 10;
        
        //Random
        
        Object o = new Object();
        o = null;
        
        System.gc();
        
        
    }

    void machWas(byte i) {
        System.out.println("BYTE");
    }

    void machWas(short i) {
        System.out.println("SHORT");
    }

    void machWas(int i) {
        System.out.println("INT");
    }

    void machWas(long i) {
        System.out.println("LONG");
    }
}
