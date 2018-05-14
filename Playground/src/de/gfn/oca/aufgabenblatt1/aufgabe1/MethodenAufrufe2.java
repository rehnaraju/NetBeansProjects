package de.gfn.oca.aufgabenblatt1.aufgabe1;

class MethodenAufrufe2 {
// Instanzmethode

    public void instMethode() {
        System.out.println("Instanzmethode der Klasse " + "MethodenAufrufe2");
        MethodenAufrufe1 instanz1 = new MethodenAufrufe1();
        instanz1.instMethode1();
        MethodenAufrufe1.klsMethode2();
    }
// Klassenmethode

    public static void klsMethode() {
        System.out.println("Klassenmethode der Klasse "+ "MethodenAufrufe2");
        MethodenAufrufe1 instanz2 = new MethodenAufrufe1();
        instanz2.instMethode1();
        MethodenAufrufe1.klsMethode2();
    }
}
