package de.gfn.oca.operators;

/**
 *
 * @author Administrator
 */
public class SwitchTest {
    
    static final int A;
    final int B;

    static {
        A = 10;
    }

    public SwitchTest() {
        this.B = 0;
    }
    
    public static void main(String[] args) {
        
        int i = 50;
        
        final int i2 = 25;
        final int i3 = 30;
        
        switch(i) {
            case i3: System.out.println("30...");
            case 50: System.out.println("10...");
            case i2: System.out.println("20...");
            default: System.out.println("nix");
        }
    }
}
