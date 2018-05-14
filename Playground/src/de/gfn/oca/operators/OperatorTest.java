package de.gfn.oca.operators;

/**
 *
 * @author Administrator
 */
public class OperatorTest {
    
    public static void main(String[] args) {
        
        Object o = new Object();
        o = null;
        
        if(o != null && o.hashCode() > 10) {
            System.out.println("Moin");
        }
        
        System.out.println("--------");
        
        byte b = 10;
        short s = 25;
        
        b += s;
        b = (byte)(b + s);
        
        int i = 2;
        
        long l = i + 100L;
        
        float f = l + 100.0F;
        
        double d = l + 100.0;
        
        int i2 = 100, i3 = 300, i4 = 500;
        
        System.out.println("------");
        
        b = 10;
        b += b++;
        
        System.out.println(b);
        
        machWas("Moin");
        
    }
    
    static int machWas(String... str) {
        
        return 0;
    }
    
//    static int machWas(String str, int... zahlen) {
//        
//        return 0;
//    }
}
