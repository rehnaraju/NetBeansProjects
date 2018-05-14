package de.gfn.oca.basics;

/**
 *
 * @author tlubowiecki
 */
public class InterfaceTest {
    
}

abstract class Jet implements ILanden {

    boolean b;
    
    @Override
    public void fahrwerkAusfahren() {
        
        int i = 10;
        String s = "Moin";
        
        boolean b;
        
        byte b1 = 10;
        b1 = (byte)(b1 + i);
        
    }

    @Override
    public void landen() {
    }

    @Override
    public void landebahnVerlassen() {
    }
}

//class Luftbalon implements ILanden {
//}

interface ILanden {
    
    public static final int x = 10;
    
    static String machWasStatic(String s) {
        
        return null;
    }
    
    default void machWas() {
        
    }
    
    void fahrwerkAusfahren();
    
    void landen();
    
    void landebahnVerlassen();
    
}
