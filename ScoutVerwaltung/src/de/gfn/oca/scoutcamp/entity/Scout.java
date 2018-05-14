package de.gfn.oca.scoutcamp.entity;

import java.time.LocalDate;

/**
 *
 * @author tlubowiecki
 */
public class Scout {
    
    private int id;
    private String firstname;
    private String lastname;
    private LocalDate birthdate;
    private boolean active;

    public Scout() {
    }
    
    public Scout(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name:")
                .append(firstname)
                .append(" ")
                .append(lastname)
                .append("\n")
                .append("Geburtrsdatum: ")
                .append(birthdate)
                .append("\n")
                .append("Aktiv: ")
                .append(active);
        
        return sb.toString();
    }
}
