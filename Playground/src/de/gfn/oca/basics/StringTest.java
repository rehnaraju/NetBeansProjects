package de.gfn.oca.basics;

/**
 *
 * @author tlubowiecki
 */
public class StringTest {
    
    public static void main(String[] args) {
        
        String s1 = "Das ist ein Haus von Nikigraus!";
        String s2 = "Dch bin ein Jakartianer!";
        
        System.out.println(s1.charAt(0));
        System.out.println(s1.equals(s2));
        System.out.println(s1.substring(0, 5).concat(" Nix ").trim());
        
        StringBuilder sb1 = new StringBuilder();
        //StringBuilder sb2 = new StringBuilder(sb1);
        sb1.append("Das ist ein Haus");
        sb1.append(" ");
        sb1.append("Nikigraus");
        sb1.delete(0, 5).append("... ");
        System.out.println(sb1.capacity());
        System.out.println(sb1.length());
        System.out.println(sb1);
        
        System.out.println("--------");
        
        StringBuilder sb2 = new StringBuilder(10);
        System.out.println(sb2.capacity());
        
        System.out.println("--------");
        
        String s3 = "Hallo";
        String s4 = s3 + " Welt";
        String s5 = s3 + " Welt";
        System.out.println(s4 == s5);
        
        
        
        
    }
    
}
