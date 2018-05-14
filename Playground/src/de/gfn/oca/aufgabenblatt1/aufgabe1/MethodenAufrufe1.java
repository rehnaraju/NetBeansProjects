package de.gfn.oca.aufgabenblatt1.aufgabe1;


class MethodenAufrufe1 {
// Instanzmethoden

    public void instMethode1() {
        System.out.println("1. Instanzmethode der Klasse " + "MethodenAufrufe1");
        instMethode2();
        MethodenAufrufe1.klsMethode1();
    }

    public void instMethode2() {
        System.out.println("2. Instanzmethode der Klasse " + "MethodenAufrufe1");
    }
// Klassenmethoden

    public static void klsMethode1() {
        System.out.println("1. Klassenmethode der Klasse " + "MethodenAufrufe1");
    }

    public static void klsMethode2() {
        System.out.println("2. Klassenmethode der Klasse " + "MethodenAufrufe1");
        MethodenAufrufe1 instanz = new MethodenAufrufe1();
        instanz.instMethode2();
        MethodenAufrufe1.klsMethode1();
    }
}
