package com.java.algos;

public class RotateArray {
	
	int a[] = {1,2,3,4,5,6,7};
	int noOfTimes = 3;
	
	int count = 0;
	
	public void rotateArr() {
		while (count < noOfTimes) {
			count++;
			int temp = a[0];
			for (int i=1; i<a.length; i++) {
				a[i-1] = a[i]; //4,5,6,7,1,2,3
			}
			a[a.length - 1] = temp;
		}
		
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
	}
	
	public static void main(String[] args) {
		RotateArray ra = new RotateArray();
		ra.rotateArr();
	}
}
