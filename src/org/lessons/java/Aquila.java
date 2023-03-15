package org.lessons.java;

public class Aquila extends Animale implements IVolante {
    public void verso() {
        System.out.println("kreeee-ee-ee");
    }

    public void mangia() {
        System.out.println("Carne!");
    }

    @Override
    public void vola() {
        System.out.println("Sto volando!!!");
    }
}
