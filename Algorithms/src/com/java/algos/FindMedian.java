package com.java.algos;

public class FindMedian {
	
	public static void main(String[] args) {
		int[] oddArr = {10,20,30,40,50,60,70,80};
		int mid = -1;
		//even
		if(oddArr.length%2 == 0) {
			mid = oddArr.length/2;
			System.out.println("Median is : " + (oddArr[mid] + oddArr[mid-1])/2);
		} else {
			mid = oddArr.length/2;
			System.out.println("Median is : " + oddArr[mid]);	
		}
	}
}
