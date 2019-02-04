package com.java.algos;

public class SaladBarCombination {
	
	public static void combinationUtil(String[] salad, String[] data, int start, int end, int index, int r) {
		if(index == r) {
			for(int j=0; j<r; j++) {
				System.out.print(data[j]);
				System.out.print(" ");
			}
			System.out.println();
			return;
		}
		
		for(int i=start; i<=end; i++) {
			data[index] = salad[i];
			combinationUtil(salad, data, i+1, end, index+1, r);
		}		
	}
	
	public static void printCombination(String[] salad, String[] data, int start, int end, int index, int r) {		
		data = new String[r];
		combinationUtil(salad, data, start, end, index, r);
	}
	
	public static void main(String[] args) {		
		String[] salad = {"carrot", "lettuce", "tomato"};
		String[] data = null;
		
		for(int recur=1; recur<=salad.length; recur++) { 
			printCombination(salad, data, 0, salad.length - 1, 0, recur);
		}
	}
}
