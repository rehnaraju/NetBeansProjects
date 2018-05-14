package de.gfn.oca.designpatterns.composite;

import java.awt.Point;
import java.util.ArrayList;
import javafx.beans.InvalidationListener;
import javafx.beans.Observable;

/**
 *
 * @author tlubowiecki
 */
public class CompositeTest {
    
    public static void main(String[] args) {
        Student s1 = new Student("Max");
        Student s2 = new Student("Hans");
        Student s3 = new Student("Anna");
        Student s4 = new Student("Petra");
        
        Arbeiter a1 = new Arbeiter("Bob der Baumeister");
        
        Gruppe g1 = new Gruppe();
        g1.add(s1);
        g1.add(s2);
        g1.add(s3);
        
        Gruppe g2 = new Gruppe();
        g2.add(s4);
        g2.add(a1);
        
        g1.add(g2);
        
        g1.goToPos(new Point(20, 23));
    }
}

interface Person {
    public void goToPos(Point pos);
}

class Gruppe implements Person {

    private final ArrayList<Person> liste = new ArrayList<>(25);
    
    public void add(Person p) {
        liste.add(p);
    }
    
    public void remove(Person p) {
        liste.remove(p);
    }
    
    @Override
    public void goToPos(Point pos) {
        
        for(Person p : liste) {
            p.goToPos(pos);
        }
    }
}

class Student implements Person {

    private final String name;
    private Point pos = new Point();

    public Student(String name) {
        this.name = name;
    }
    
    @Override
    public void goToPos(Point pos) {
        System.out.println(name + ": Ich gehe zu neuer Position " + pos);
        this.pos = pos;
        System.out.println(name + ": Neue Position erreicht!");
    }
}

class Arbeiter implements Person {

    private final String name;
    private Point pos = new Point();

    public Arbeiter(String name) {
        this.name = name;
    }
    
    @Override
    public void goToPos(Point pos) {
        System.out.println(name + ": Ich gehe zu neuer Position " + pos);
        this.pos = pos;
        System.out.println(name + ": Neue Position erreicht!");
    }
}