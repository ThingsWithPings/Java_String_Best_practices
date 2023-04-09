package com.teciezone;

/**
 * @author Viraj
 * 3/25/2023
 */

public class CheckStringsEquality2 {
    public static void main(String[] args) {
        String a = "one";
        String b = "one";
        String c = "ONE";

        String d = new String("one");

        System.out.println("1."+" == operator result for a and b : " + (a == b));
        System.out.println("2."+" == operator result for a and c : " + (a == c));
        System.out.println("4."+" equals() method result for a and b : " + a.equals(b));
        System.out.println("5."+" equals() method result for a and c : " + a.equalsIgnoreCase(c));
        System.out.println("2."+" == operator result for a and d : " + (a == d));
        System.out.println("6."+" equals() method result for a and d : " + a.equals(d));
    }
}
