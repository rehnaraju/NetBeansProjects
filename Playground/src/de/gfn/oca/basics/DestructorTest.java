package de.gfn.oca.basics;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tlubowiecki
 */
public class DestructorTest {
    
    static int x = 15;
    
    
    public static void main(String[] args) {
        
        Hero spiderman = new Hero();
        
        spiderman = null;
        
        System.gc();
        
        try {
            Thread.sleep(10000);
        } catch (InterruptedException ex) {
            Logger.getLogger(DestructorTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        int x;
        {
            x = 10;
            
            {
                System.out.println(x);
                //int x = 15;
                {
                    System.out.println(x);
                }
            }
        }
        
        x = -15;
        System.out.println(x);
        System.out.println(DestructorTest.x);
        
        byte b = 10;
//        b += 15;
//        byte b2 = 17;
//        b += b2;
        
//        b++;
//        ++b;
        
        int wert = 10 + ++b; 
        
        b--;
        --b;
        
        
    }
}

class Hero {

    public Hero() {
        System.out.println("YEAAAAA!!!!!");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("UGHHHHH!!!!!");
    }
}
