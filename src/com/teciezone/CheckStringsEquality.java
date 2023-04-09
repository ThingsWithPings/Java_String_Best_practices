package com.teciezone;

/**
 * @author Viraj
 * 3/25/2023
 */

public class CheckStringsEquality {
 public static void main(String[] args) {

  String str1 = "TopJava";
  String str2 = "TopJava";

  String str3 = new String("TopJava");
  String str4 = new String("TopJava");
  String str5 = new String("Dog");

  System.out.println("1."+" == opearator result for str1 and str2 : " + (str1 == str2));
  System.out.println("2."+" == opearator result for str3 and str4 : " + (str3 == str4));
  System.out.println("3."+" == opearator result for str1 and str3 : " + (str1 == str3));
  System.out.println("4."+" equals() method result for str1 and str2 : " + str1.equals(str2));
  System.out.println("5."+" equals() method result for str3 and str4 : " + str3.equals(str4));
  System.out.println("6."+" equals() method result for str1 and str3 : " + str1.equals(str3));
  System.out.println("7."+" equals() method result for str4 and str5 : " + str4.equals(str5));
 }
}
