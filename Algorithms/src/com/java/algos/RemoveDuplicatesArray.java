package com.java.algos;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RemoveDuplicatesArray {
	
	//Given an array of numbers nums, in which exactly two elements appear only 
	//once and all the other elements appear exactly twice. Find the two elements that appear only once.
	
	public static void main(String[] args) {
		int[] nums =  {1,2,1,3,2,5};
		// Output: [3,5]
		int[] returnArr = getUniqueNumbers(nums);
		for(int num : returnArr) {
			System.out.println(num);
		}
		
		System.out.println("Using HashSet");
		
		returnArr = getUniqueNumbersUsingSet(nums);
		for(int num : returnArr) {
			System.out.println(num);
		}
	}
	
	public static int[] getUniqueNumbers(int[] nums){
		//Implementation here
		Map<Integer, Integer> map = new HashMap<>();
		int[] outputArr = new int[nums.length];
		int count = 0; 
		for(int i : nums) {
			if (map.containsKey(i)) {
				map.put( i, map.get(i) + 1 );
		    } else {
	            map.put(i , 1);
		    }
		}
		for(int i : map.keySet()) {
			if(map.get(i) == 1) {
		       outputArr[count++] = i;
		    }
		}
		
		int[] returnArr = Arrays.copyOf(outputArr, count);
		return returnArr;
	}
	
	public static int[] getUniqueNumbersUsingSet(int[] nums){
		//Implementation here
		Set<Integer> set = new HashSet<>();
		for(int i : nums) {
			if (!set.add(i)) {
				set.remove(i);
		    } 
		}
		int[] outputArr = new int[set.size()];
		int j=0;
		for(int num : set) {
			outputArr[j++] = num;
		}
		return outputArr;
	}
}
