package de.gfn.oca.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author tlubowiecki
 */
public class ObserverTest {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        TV tv = new TV();
        
        tv.addObserver(new Scout("Max"));
        tv.addObserver(new Scout("Peter"));
        tv.addObserver(new Tier());
        tv.addObserver(new Tier());
        tv.addObserver(new Tier());
        tv.addObserver(new Scout("Anna"));
        
        while(true) {
            Status s = Status.valueOf(scanner.next().toUpperCase());
            tv.setStatus(s);
        }
    }
}

class TV implements Subject {

    private List<Observer> observer = new ArrayList<>();
    private Status status = Status.AUS;
    
    @Override
    public void addObserver(Observer o) {
        observer.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observer.remove(o);
    }

    @Override
    public void setStatus(Status s) {
        status = s;
        notifyObserver();
    }
    
    @Override
    public void notifyObserver() {
        for(Observer o : observer) {
            o.update(status);
        }
    }
}

class Scout implements Observer {

    private String name;

    public Scout(String name) {
        this.name = name;
    }

    @Override
    public void update(Status s) {
        
        switch(s) {
            case AN: System.out.println(name + ": Super!"); break;
            case PAUSE: System.out.println(name + ": Neeee. Dann gehe ich Pipi machen!"); break;
            case AUS: System.out.println(name + ": Ich bin Müde. Ins Bett!"); break;
        }
    }
}

class Tier implements Observer {
    
    @Override
    public void update(Status s) {
        
        switch(s) {
            case AN: System.out.println("Tier: Versteckt sich!"); break;
            case PAUSE: System.out.println("Tier: Klaut die Chips"); break;
            case AUS: System.out.println("Tier: Holt sich das ganze Essen"); break;
        }
        
    }
}