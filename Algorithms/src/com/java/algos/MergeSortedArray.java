package com.java.algos;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class MergeSortedArray {
	
	//A = { 1,4,6,9}
	//B = { 2,4,5,6}

	//No Duplicate Values and Should be sorted.

	//AB = { 1,2,4,5,6,9}
	
	public static void main(String[] args) {
		int a[] = {1,4,6,9};
		int b[] = {2,4,5,6};
		
		System.out.println("Merge Array using TreeSet");
		int[] oArr = mergeArray(a, b);
		for(int num : oArr) {
			System.out.println(num + ",");
		}
		
		System.out.println("Merge Array using Optimized solution");
		oArr = mergeArrayOptimized(a, b);
		for(int num : oArr) {
			System.out.println(num + ",");
		}
	}

	public static int[] mergeArray(int[] a, int[] b){

	  Set<Integer> set = new TreeSet<>();
	  int[] outputArr;
	  
	  for(int i=0; i<a.length; i++) {
	      set.add(a[i]);
	  }

	  for(int j=0; j<b.length; j++) {
	      set.add(b[j]);
	  }
	  
	  outputArr = new int[set.size()];
	  int k=0;
	  for (int num : set ){
	     outputArr[k++] = num;
	  }
	  
	  return outputArr;
	}
	
	public static int[] mergeArrayOptimized(int[] a, int[] b){
		  int[] outputArr = new int[10];
		  int i=0, j=0;
		  int num = -1;
		  int k=0;
		  
		  while (true) {
			  if (i==a.length -1) {
				 for (int m=j; m<b.length; m++) {
					 outputArr[k++] = b[m];
				 }
				 break;
			  } 
			  
			  if (j==b.length -1) {
				 for (int m=i; m<a.length; m++) {
					 outputArr[k++] = a[m];
				 }
				 break;
			  } 
			  
			  if(a[i] < b[j]) {
				  num = a[i];
				  i++;
			  } else if(a[i] > b[j]) {
				  num = b[j];
				  j++;
			  } else {
				  num = a[i];
				  i++;
				  j++;
			  }
			  outputArr[k++] = num;
		  }
		  
		  int oArr[] = new int[k];
		  oArr = Arrays.copyOf(outputArr, k);
		  return oArr;
	}
}
