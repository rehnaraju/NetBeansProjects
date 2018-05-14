/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.oca.vererbung;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tlubowiecki
 */
public class VererbungTest2 {
    
    public static void main(String[] args) {
        
        K1 k1 = new K1();
        k1.machWas();
        k1.machWasK1();
        
        System.out.println("--------");
        
        K2 k2 = new K2();
        k2.machWas();
        k2.machWasK1();
        k2.machWasK2();
        
        System.out.println("--------");
        
        K1 k11 = new K2();
        //k11 = new K1();
        k11.machWas();
        k11.machWasK1();
        
        System.out.println("--------");
        
        I1 i1 = new K3();
        i1.machWas();
        i1.machWasI1();
        
        System.out.println("--------");
        
        List<String> l = new ArrayList<>();
        
        K1 k12 = new K2();
        K2 k22 = (K2)k12;
        
        Byte b = 1;
        Integer i = 1;
        Number n = b;
        i = (Integer) n;
    }
}

class K1 {
    
    void machWas() {
        System.out.println(K1.class.getName());
    }
    
    void machWasK1() {
        System.out.println(K1.class.getName());
    }
}

class K2 extends K1 {
    
    void machWas() {
        System.out.println(K2.class.getName());
    }
    
    void machWasK2() {
        System.out.println(K2.class.getName());
    }
    
}

interface I2 {
    
    void machWas();
    
    void machWasAnderes1();
    
    void machWasAnderes2();
}


interface I1 extends I2, Serializable {
    
    void machWas();
    
    default void machWasI1() {
        System.out.println(I1.class.getName());
    }
}

class K3 implements I1 {
    
    @Override
    public void machWas() {
        System.out.println(K3.class.getName());
    }
    
    public void machWasI1() {
        //super.machWasI1();
    }
    
    void machWasK3() {
        System.out.println(K3.class.getName());
    }

    @Override
    public void machWasAnderes1() {
    }

    @Override
    public void machWasAnderes2() {
    }
}
