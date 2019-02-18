package com.java.algos;

public class MatrixProduct {
	
	public static void productMatrix(int[][] mat1, int[][] mat2) {
		
		int[][] product = new int[2][3];
		
		for(int i=0; i<mat1.length; i++) {
			for(int j=0; j<mat2[0].length; j++) {
				for(int k=0; k<mat1[i].length; k++) {
					product[i][j] += mat1[i][k] * mat2[k][j];
				}
			}
		}
		
		for(int i=0; i<product.length; i++) {
			for(int j=0; j<product[0].length; j++) {
				System.out.print(product[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int[][] mat1 = { {1,4,6,10},
						 {2,7,5,3}};
		
		int[][] mat2 = { {1,4,6},
				         {2,7,5},
				         {9,0,11},
				         {3,1,0} };
		
		productMatrix(mat1, mat2);
	}
}
