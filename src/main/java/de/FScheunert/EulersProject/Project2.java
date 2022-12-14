package de.FScheunert.EulersProject;

public class Project2 {

    /**
     * Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:
     *
     * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
     *
     * By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
     */

    public static void main(String[] args) {

        int last = 1;
        int sum = 0;

        for(int i = 2; i < 4000000; i += last) {
            if(i % 2 == 0) sum += i;
            last = i-last;
        }

        System.out.println("Das Ergebnis ist: " + sum);

    }

}
