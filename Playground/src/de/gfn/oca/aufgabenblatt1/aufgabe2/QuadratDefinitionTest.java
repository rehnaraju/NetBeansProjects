package de.gfn.oca.aufgabenblatt1.aufgabe2;

/**
 *
 * @author tlubowiecki
 */
public class QuadratDefinitionTest {
    
    public static void main(String[] args) {
        
        QuadratDefinition q = new QuadratDefinition(10, Einheit.M);
        //System.out.println(q.flaeche());
        System.out.println(q);
        System.out.println("---------------");
        
        System.out.println(QuadratDefinition.flaeche(q));
        
    }
    
}
