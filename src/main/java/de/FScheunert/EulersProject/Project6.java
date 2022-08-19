package de.FScheunert.EulersProject;

public class Project6 {

    public static void main(String[] args) {

        int sum = 0;
        int powSum = 0;
        for(int i = 1; i <= 100; i++) {
            sum += i;
            powSum += Math.pow(i, 2);
        }

        System.out.println("Das Ergebnis ist: " + (int)(Math.pow(sum, 2) - powSum));

    }

}
