package de.FScheunert.EulersProject;

public class Project7 {

    public static void main(String[] args) {

        int counter = 1;
        double number = 3.0;
        while(counter < 10001) {
            if(isPrime(number)) counter++;
            number++;
        }

        System.out.println("Das Ergebnis ist: " + (number-1));

    }

    private static boolean isPrime(double num) {
        if(num > 2 && num%2 == 0) return false;
        for(int i = 2; i < (Math.sqrt(num)+1); i++) if(num%i == 0) return false;
        return true;
    }

}
