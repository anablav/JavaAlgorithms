package com.java.algos;

import java.io.*;
import java.util.*;

/*
 * a[] = { 10, 20, 30, 40, 50 ,20, 30, 30 }
 * Output : 30
 *
 * If you need more classes, simply define them inline.
 */

public class FindMaxDup {
  public void findMaxDup(int[] a) {
    
    Map<Integer, Integer> map = new HashMap<>();
    
    for(int i=0; i<a.length; i++){
      if(map.containsKey(a[i])){
        map.put(a[i], map.get(a[i]) + 1);
      } else {
        map.put(a[i], 1);
      }
    }
    
    System.out.println(map);
    
    Set<Map.Entry<Integer, Integer>> set = map.entrySet();
    List<Map.Entry<Integer, Integer>> list = new ArrayList<>(set);
    Collections.sort(list, new DupComparator());
    
    System.out.println("Max Dup " + list.get(0).getKey());
  }
  
  public static void main(String[] args) {
   int[] a =  { 10, 20, 30, 40, 50 ,20, 30, 30 };
   FindMaxDup s = new FindMaxDup();
   s.findMaxDup(a);
  }
}
  
  class DupComparator implements Comparator<Map.Entry<Integer, Integer>> {
    public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
      if(o2.getValue() > o1.getValue()){
        return 1;
      } else {
        return -1;
      }
    }
  }




