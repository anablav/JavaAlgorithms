package com.java.algos;

public class BinarySearch {
	
	public int findElement(int[] arr, int start, int end, int elem) {
		while(start<=end) {
			int mid = start + (end - start) / 2;
			if(arr[mid] == elem) {
				return mid;
			} else if (arr[mid] > elem) {
				end = mid-1;
			} else {
				start = mid+1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] arr = {2, 4, 6, 8, 10, 12, 14, 16};
		BinarySearch bs = new BinarySearch();
		int elem = 18;
		int index = bs.findElement(arr, 0, arr.length-1, elem);
		if (index >= 0) {
			System.out.println("Element " + elem + " is found at " + index);
		} else {
			System.out.println("Element NOT FOUND");
		}
	}
}
