package com.java2novice.algos;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstRepeatingChar {
	
	public static void main(String[] args) {
		Map<Character, Integer> map = new LinkedHashMap<>();
		String str = "tester";
		char[] chArr = str.toCharArray();
		
		for(char ch : chArr) {
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}
		
		System.out.println(map);
		
		for(char ch : map.keySet()) {
			if(map.get(ch) > 1) {
				System.out.println("First repeating char : " + ch);
				break;
			}
		}
	}
}
