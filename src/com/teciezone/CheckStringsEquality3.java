package com.teciezone;

/**
 * @author Viraj
 * 3/26/2023
 */

public class CheckStringsEquality3 {
    public static void main(String[] args) {
        String string1 = "Java";
        String string2 = string1.intern();

        String string3 = new String("Java").intern();

        System.out.println("1."+" == operator result for string1 and string2 : " + (string1 == string2));
        System.out.println("2."+" == operator result for string1 and string3 : " + (string1 == string3));
        System.out.println("3."+" equals() method result for string1 and string2 : " + string1.equals(string2));
    }
}
