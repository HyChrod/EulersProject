package de.FScheunert.EulersProject;

import javax.sound.midi.Soundbank;

public class Project9 {

    public static void main(String[] args) {

        int product = 0;
        for(int a = 1; a < 332; a++)
            for(int b = (a+1); b < 500; b++) {

                double c = Math.sqrt(a*a + b*b);
                if((a+b+c) != 1000) continue;
                product = (int)(a*b*c);

            }

        System.out.println("Das Ergebnis ist: " + product);

    }

}
