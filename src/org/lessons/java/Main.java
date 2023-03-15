package org.lessons.java;

public class Main {
    public static void main(String[] args) {
        Animale[] animali = new Animale[] { new Cane(), new Passerotto(), new Aquila(), new Delfino() };

        for (Animale animale : animali) {
            animale.dormi();
            animale.verso();
            animale.mangia();

            if (animale instanceof IVolante) {
                ((IVolante) animale).vola();
            }

            if (animale instanceof INuotante) {
                ((INuotante) animale).nuota();
            }

            System.out.println();
        }

        /*
        Scrivere un programma che istanzi animali che volano o nuotano e richiamare i metodi faiVolare / faiNuotare
        passandoglieli come parametro.
         */

        Passerotto passerotto2 = new Passerotto();
        faiVolare(passerotto2);

        Delfino delfino2 = new Delfino();
        faiNuotare(delfino2);

    }
    /*
    Scrivere un programma avente 2 metodi :
      -void faiVolare(IVolante animale)
      -void faiNuotare(INuotante animale)
    */
    public static void faiVolare(IVolante animale) {
        animale.vola();
    }

    public static void faiNuotare(INuotante animale) {
        animale.nuota();
    }

}
