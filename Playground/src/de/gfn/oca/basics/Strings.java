package de.gfn.oca.basics;

/**
 *
 * @author tlubowiecki
 */
public class Strings {
    
    public static void main(String[] args) {
        
        // StringLiteralPool
        String s1 = "Hallo Welt";
        String s3 = "Hallo Welt";
        s3 = "Hallo zweite Welt";
        
//        Object o1 = new Object();
//        Object o2 = new Object();
//        System.out.println(o1 == o2);
//        System.out.println(o1.equals(o2));
        
        System.out.println(s1.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));
        
        System.out.println("--------");
        
        String s2 = new String("Hallo andere Welt");
        String s4 = new String("Hallo andere Welt");
        
        System.out.println(s2.hashCode());
        System.out.println(s4.hashCode());
        System.out.println(s2 == s4);
        System.out.println(s2.equals(s4));
        
        
        
    }
    
    
    
}
