package com.java2novice.algos;

import java.util.HashMap;
import java.util.Map;

public class FindIndexesOfArraySum {	
	public static void main(String[] args) {
		int[] arr = {2,4,5,8,1,6,3,9,12};
		int sum = 6;
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0; i<arr.length; i++) {
			int val = arr[i];
			if(map.containsKey(sum - val)) {
				System.out.println(val + " , " + i);
				System.out.println("Indexes for sum : " + sum + " are " + i + " , " + map.get(sum-val));
			} else {
				System.out.println(val + " , " + i );
				map.put(val, i);
			}
		}
	}
	
	/* FROM PAYPAL interview and infosys interview
	 public static void findSum(){

    int[] arr = {5,1,3,7,4};
    int target = 9;
    Map<Integer, Integer> map = new HashMap<>();
    
    for(int i=0; i<arr.length; i++){
        if(map.containsKey(target-arr[i])){
            System.out.println("index1:" + map.get(target-arr[i]) + " index2:" + i + " Key1: " + target-arr[i] + " key2:" +                 
                                                  arr[i]);
            break;
        } else{
            map.put(arr[i], i);
        }
    	}
	}

	5=0, 1=1, 3=2, 7=3, 
	
	index1: 0, index2: 4, key1: 5, key2: 4
		 */
}
