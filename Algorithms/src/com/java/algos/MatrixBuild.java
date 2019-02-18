package com.java.algos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MatrixBuild {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int[][] mat = new int[3][3];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat.length; j++) {
				int data = Integer.parseInt(br.readLine());
				mat[i][j] = data;
			}
		}
		
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat.length; j++) {
				System.out.print(mat[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
