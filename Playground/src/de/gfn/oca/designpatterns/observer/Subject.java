package de.gfn.oca.designpatterns.observer;

/**
 *
 * @author tlubowiecki
 */
public interface Subject {
    
    void addObserver(Observer o);
    
    void removeObserver(Observer o);
    
    void setStatus(Status s);
    
    void notifyObserver();
}
