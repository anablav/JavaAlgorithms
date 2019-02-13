package com.java.algos;

public class RotateArray {
	
	int a[] = {1,2,3,4,5,6,7};
	int noOfTimes = 3;
	
	int count = 0;
	
	// This is O(m*n) complexity
	public void rotateArr() {
		count = 0;
		while (count < noOfTimes) {
			count++;
			int temp = a[0];
			for (int i=1; i<a.length; i++) {
				a[i-1] = a[i]; //4,5,6,7,1,2,3
			}
			a[a.length - 1] = temp;
		}
		
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + ",");
		}
		System.out.println();
	}
	
	// This is O(n) complexity
		public void rotateArr1() {
			count = 0;
			int tmp[] = new int[noOfTimes];
			for(int j=0; j<noOfTimes; j++) {
				tmp[j] = a[j];
			}
			for (int i=0; i<a.length-noOfTimes; i++) {
				a[i] = a[i+noOfTimes]; //4,5,6,7,1,2,3
			}
			
			for(int k=a.length-noOfTimes; k<a.length; k++) {
				a[k] = tmp[count++];
			}
			
			for(int i=0; i<a.length; i++) {
				System.out.print(a[i] + ",");
			}
			System.out.println();
		}
	
	public static void main(String[] args) {
		RotateArray ra = new RotateArray();
		ra.rotateArr();
		RotateArray ra1 = new RotateArray();
		ra1.rotateArr1();
	}
}
