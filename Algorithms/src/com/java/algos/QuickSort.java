package com.java.algos;

public class QuickSort {
	int arr[];
	int len;
	
	public void doQuickSort(int low, int high) {
		int i = low;
		int j = high;
		int pivot = arr[low + (high-low)/2];
		
		while(i<=j) {
			while(arr[i] < pivot) {
				i++;
			}
			
			while(arr[j] > pivot) {
				j--;
			}
			
			if(i<=j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
		
		if(low < j) {
			doQuickSort(low, j);
		}
		if(i < high) {
			doQuickSort(i, high);
		}
	}
	
	public void sort(int[] input) {
		arr = input;
		len = arr.length;
		doQuickSort(0, len-1);
	}
	
	public static void main(String[] args) {
		int[] input = {24,2,45,20,56,75,2,56,99,53,12};
		QuickSort qs = new QuickSort();
		qs.sort(input);
		for(int num : input) {
			System.out.println(num + " ");
		}
	}
}
