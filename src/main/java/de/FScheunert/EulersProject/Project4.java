package de.FScheunert.EulersProject;

public class Project4 {

    /**
     *A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
     *
     * Find the largest palindrome made from the product of two 3-digit numbers.
     */

    public static void main(String[] args) {

        int palindrome = 0;
        for(int a = 101; a <= 9999; a++) {
            for(int b = 9999; b >= a; b--) {

                int result = a*b;
                char[] chars = String.valueOf(result).toCharArray();
                if(chars.length%2 != 0) continue;

                for(int i = 0; i < (chars.length/2); i++) {
                    if (chars[i] != chars[chars.length - (1 + i)]) break;
                    if(i == ((chars.length/2)-1) && result > palindrome) palindrome = result;
                }

            }

        }

        System.out.println("Das Ergebnis ist: " + palindrome);

    }

}
