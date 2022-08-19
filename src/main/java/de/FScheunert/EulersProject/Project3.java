package de.FScheunert.EulersProject;

public class Project3 {

    /**
     * The prime factors of 13195 are 5, 7, 13 and 29.
     *
     * What is the largest prime factor of the number 600851475143 ?
     */

    public static void main(String[] args) {

        double max = 600851475143.0;
        double prime = 1;

        for(double i = 2; i <= max; i++) {
            if (isPrimeAndDivider(i, max)) {
                prime = i;
                max /= i;
            }
        }

        System.out.println("Das Ergebnis ist: " + prime);

    }

    private static boolean isPrimeAndDivider(double num, double max) {
        if(num > 2 && num%2 == 0) return false;
        for(int i = 2; i < Math.sqrt(num); i++) if(num%i == 0) return false;
        return max%num == 0;
    }

}
