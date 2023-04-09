package com.teciezone;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author Viraj_107294
 * Viraj.Wickramasinghe@axiatadigitallabs.com
 * 3/19/2023
 */

public class MovingTotal {
 List<Integer> subs = new ArrayList<>();
 /**
  * Adds/appends list of integers at the end of internal list.
  */
 public void append(int[] list) {
  ArrayList<Integer> list1 = IntStream.of(list)
          .boxed()
          .collect(Collectors.toCollection(ArrayList::new));
  int arraySize = list1.size();
  for (int i = 0; i<=arraySize;i++) {
   Integer collect = list1.get(i) + list1.get(i+1) + list1.get(i+2);
   subs.add(collect);
   if((i) == arraySize){
    break;
   }
  }
 }

 /**
  * Returns boolean representing if any three consecutive integers in the
  * internal list have given total.
  */
 public boolean contains(int total) {
  return subs.contains(total);
 }

 public static void main(String[] args) {
  MovingTotal movingTotal = new MovingTotal();

  movingTotal.append(new int[] { 1, 2, 3, 4 });

  System.out.println(movingTotal.contains(6));
  System.out.println(movingTotal.contains(9));
  System.out.println(movingTotal.contains(12));
  System.out.println(movingTotal.contains(7));

  movingTotal.append(new int[] { 5 });

  System.out.println(movingTotal.contains(6));
  System.out.println(movingTotal.contains(9));
  System.out.println(movingTotal.contains(12));
  System.out.println(movingTotal.contains(7));
 }
}
