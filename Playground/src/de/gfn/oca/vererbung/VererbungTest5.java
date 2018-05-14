/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.oca.vererbung;

/**
 *
 * @author tlubowiecki
 */
public class VererbungTest5 {
    
    public static void main(String[] args) {
        
        A1 a = new B1();
        //a = new C1();
        
        C1 c = null;
        
        if(a instanceof C1)
            c = (C1) a; // ClassCastException
        
        C1 c2 = new C1();
        A1 a1 = c2;
        C1 c3 = (C1) a1;
        
        //B1 b1 = new C1();
    }
    
}

class A1 {
    
}

class B1 extends A1 {
    
}

class C1 extends A1 {
    
}
