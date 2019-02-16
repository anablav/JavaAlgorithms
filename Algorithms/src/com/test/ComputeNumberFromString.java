package com.test;

public class ComputeNumberFromString {
	//If the numbers are adjacent to each other, then take it as a whole number. add
	// the numbers. If there is a - then subtract the number
	//abc123d4 => 123 + 4 = 127
	//b137d-37hhh9- => 91
	
	public static void main(String[] args) {
		String str = "b137d-37hhh9-1t3k5-df9";
		//String str = "-12345";
		char[] a = str.toCharArray();
		int i=0;
		int sum=0;
		String targetStr = "";
		
		while(i<str.length()) {
			if(a[i] == '-' && i!=str.length()-1 && Character.isDigit(a[i+1])) {
				targetStr = targetStr + "-";
			}
			if(!Character.isDigit(a[i])) {
				i++;
				continue;
			}
			targetStr = targetStr + a[i];
			if((i==str.length() -1) || ((i!=str.length() -1) && !Character.isDigit(a[i+1]))) {
				sum = sum + Integer.parseInt(targetStr);
				targetStr = "";
			} 
			i++;
		}
		System.out.println("Extracted Number " + sum);
	}
}
