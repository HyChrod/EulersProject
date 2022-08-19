package de.FScheunert.EulersProject;

public class Project5 {

    /**
     * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
     *
     * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
     */

    private static final int FROM = 1;
    private static final int TO = 20;

    public static void main(String[] args) {

        int number = TO;
        while(!evenlyDivisable(number)) number++;

        System.out.println("Das Ergebnis ist: " + number);

    }

    private static boolean evenlyDivisable(int number) {
        for(int i = FROM; i <= TO; i++) if(number%i != 0) return false;
        return true;
    }

}
