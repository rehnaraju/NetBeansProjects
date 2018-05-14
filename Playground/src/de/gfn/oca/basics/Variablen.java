package de.gfn.oca.basics;

/**
 *
 * @author tlubowiecki
 */
public class Variablen {
    
    int x;
    static int y;
    String s = "INSTANZ"; // null

    public Variablen() {
        this(10.0);
        System.out.println("C: 1");
    }
    
    public Variablen(int i) {
        System.out.println("C: 2");
    }
    
    public Variablen(int i, int j) {
        this(i);
        System.out.println("C: 3");
    }
    
    public Variablen(double d) {
        this(d, 10);
        System.out.println("C: 4");
    }
    
    public Variablen(int i, double d) {
        this(i, i + 5);
        System.out.println("C: 5");
    }
    
    public Variablen(double d, int i) {
        this(i, d);
        System.out.println("C: 6");
    }
    
    public static void main(String[] args) {
     
        //Variablen v = new Variablen();
        
        ModiTest mt = new ModiTest();
        //mt.zahl = 100000;
        
        byte b = 10;
        b = (byte) ModiTest.machWas(true, 1);
    }
}

class ModiTest {
    
    private int zahl;
    
    static int machWas(int i) {
        System.out.println("INT");
        return 2;
    }
    
    static int machWas(boolean b) {
        System.out.println("BOOL");
        return 2;
    }
    
    static int machWas(int i, boolean b) {
        System.out.println("INT, BOOL");
        return 2;
    }
    
//    static int machWas(boolean b, int i) {
//        System.out.println("BOOL, INT");
//        return 2;
//    }
    
    static int machWas(boolean b, long i) {
        System.out.println("BOOL, LONG");
        return 2;
    }
    
    static int machWas(boolean b, int... i) {
        System.out.println("BOOL, INT VARARG");
        return 2;
    }
    
    static int machWas(byte b) {
        System.out.println("BYTE");
        return 2;
    }
    
    static int machWas(short s) {
        System.out.println("SHORT");
        return 2;
    }
    
    static int machWas(double d) {
        System.out.println("DOUBLE");
        return 2;
    }
    
}
