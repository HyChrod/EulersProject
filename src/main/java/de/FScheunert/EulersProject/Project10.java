package de.FScheunert.EulersProject;

import java.util.LinkedList;

public class Project10 {

    public static void main(String[] args) {

        long sum = 0;
        for(int i = 2; i < 2000000; i++)
            if(isPrime(i)) sum += i;

        System.out.println("Das Ergebnis ist: " + sum);

    }

    private static boolean isPrime(double num) {
        if(num > 2 && num%2 == 0) return false;
        for(int i = 2; i < (Math.sqrt(num)+1); i++) if(num%i == 0) return false;
        return true;
    }

}
