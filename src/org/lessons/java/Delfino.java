package org.lessons.java;

public class Delfino extends Animale implements INuotante {
    public void verso() {
        System.out.println("Uiiiiiiiiiiiiii");
    }

    public void mangia() {
        System.out.println("Pesci, Calamari!");
    }

    @Override
    public void nuota() {
        System.out.println("Sto nuotando!!!");
    }

}