package com.java.algos;

public class Array2DToMatrix {
	
	public static void printMatrix(int[][] mat) {
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				System.out.print(mat[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int[][] mat = { {1,2,3,4} ,
				        {5,6,7,8},
				        {9,10,11,12} };
		
		printMatrix(mat);
	}
}
