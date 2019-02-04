package com.java.algos;
import java.util.HashSet;
import java.util.Set;

public class SaladBar {
	
	public static void main(String[] args) {
		
		String[] a = {"Tomato", "Carrot", "Lettuce"};
		
		Set<String> set = new HashSet<>(); 
		
		Set<String> completeset = new HashSet<>(); 
		
		for (int i=0; i<a.length; i++) {
			System.out.println(a[i]);
			completeset.add(a[i]);
			set = new HashSet<>();
			for(int j=0; j<a.length; j++) {
				if(i != j) {
					set.add(a[j]);
				}
			}
			System.out.println(set);
		}
		System.out.println(completeset);
	}
}
