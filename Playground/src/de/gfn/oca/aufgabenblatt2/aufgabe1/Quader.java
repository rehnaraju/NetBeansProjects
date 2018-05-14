package de.gfn.oca.aufgabenblatt2.aufgabe1;

import java.util.Scanner;

public class Quader {
    
    private double länge;
    private double breite;
    private double höhe;

    public Quader(double länge, double breite, double höhe) {
        this.länge = länge;
        this.breite = breite;
        this.höhe = höhe;
    }

    public void berechneVolumen() {
        double volumen = länge * breite * höhe;
        System.out.println("Das Volumen beträgt " + volumen + " cm³");
    }

    public void berechneKantenLänge() {
        double längeAllerKanten = 4 * länge + 4 * breite + 4 * höhe;
        System.out.println("Die Länge aller Kanten beträgt " + längeAllerKanten + " cm.");
    }
    
    public void berechneOberfläche() {
        double oberFläche = 2 * (länge * breite + länge * höhe + breite * höhe);
        System.out.println("Die Oberfläche des Quaders beträgt " + oberFläche + " cm².");
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Länge (in cm): ");
        double länge = scanner.nextDouble();
        
        System.out.print("Breite (in cm): ");
        double breite = scanner.nextDouble();
        
        System.out.print("Höhe (in cm): ");
        double höhe = scanner.nextDouble();
        
        Quader q = new Quader(länge, breite, höhe);
        
        q.berechneVolumen();
        
        q.berechneKantenLänge();
        
        q.berechneOberfläche();
    }
}
