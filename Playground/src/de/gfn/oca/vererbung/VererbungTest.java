package de.gfn.oca.vererbung;

import java.time.LocalDate;

/**
 *
 * @author Administrator
 */
public class VererbungTest {
    
    public static void main(String[] args) {
        
        Sohn s = new Sohn(10);
        System.out.println(s.name);
        s.sayHallo();
        s.sayName();
        
        System.out.println("-------------");
        
        Tochter t = new Tochter();
        System.out.println(t.name);
        t.sayHallo();
        t.sayName();
    }
    
}

class Vater {
    
    private int id = 10;
    protected String name = "Max";
    String location = "Hamburg";
    public LocalDate birthdate = LocalDate.now();

    public Vater() {
    }
    
    public Vater(int id) {
        this.id = id;
        System.out.println("C: VATER");
    }
    
    public void sayHallo() {
        System.out.println("Moin");
    }
    
    public void sayName() {
        System.out.println(name);
    }
}

class Sohn extends Vater {
    
    public String name = "Bob";

    public Sohn(int i) {
        super(i);
        System.out.println("C: SOHN");
    }
    
    @Override
    public void sayName() {
        System.out.println(name);
    }
}

class Tochter extends Vater {
    
    public String name = "Anna";
    
}