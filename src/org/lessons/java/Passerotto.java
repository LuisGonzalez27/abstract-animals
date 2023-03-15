package org.lessons.java;

public class Passerotto extends Animale implements IVolante{
    public void verso() {
        System.out.println("Cip-cip-cip");
    }

    public void mangia() {
        System.out.println("Cereali o semi!");
    }

    @Override
    public void vola() {
        System.out.println("Sto volando!!!");
    }

}