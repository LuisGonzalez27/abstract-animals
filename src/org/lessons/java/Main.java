package org.lessons.java;

public class Main {
    public static void main(String[] args) {
        System.out.println("Cosa fa il cane?");
        Cane newCane = new Cane();
        newCane.dormi();
        newCane.verso();
        newCane.mangia();
        System.out.print("\n");

        System.out.println("Cosa fa il passerotto?");
        Passerotto newPasserotto = new Passerotto();
        newPasserotto.dormi();
        newPasserotto.verso();
        newPasserotto.mangia();
        System.out.print("\n");

        System.out.println("Cosa fa l'aquila?");
        Aquila newAquila = new Aquila();
        newAquila.dormi();
        newAquila.verso();
        newAquila.mangia();
        System.out.print("\n");

        System.out.println("Cosa fa il delfino?");
        Delfino newDelfino = new Delfino();
        newDelfino.dormi();
        newDelfino.verso();
        newDelfino.mangia();

    }
}
