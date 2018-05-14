package de.gfn.oca.designpatterns.singleton;

/**
 *
 * @author tlubowiecki
 */
public class SingletonTest {
    
    public static void main(String[] args) {
        
        DBVerbindung bd1 = DBVerbindung.getInstance();
        DBVerbindung bd2 = DBVerbindung.getInstance();
        DBVerbindung bd3 = DBVerbindung.getInstance();
        
    }
}

class DBVerbindung {
    
    private static DBVerbindung instance = new DBVerbindung();

    private DBVerbindung() {
    }
    
    static DBVerbindung getInstance() {
        
//        if(instance == null) {
//            instance = new DBVerbindung();
//        }
        return instance;
    }
}
