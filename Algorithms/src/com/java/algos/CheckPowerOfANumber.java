package com.java.algos;

public class CheckPowerOfANumber {
	
	//x=10, y=1000  TRUE
	//x=10, y=500 FALSE
	public boolean checkPowerOf10(int num) {
		if(num % 10 != 0 || num == 0) {
			return false;
		}
		if(num == 10) {
			return true;
		}
		return checkPowerOf10(num/10);
	}
	
	//x=2, y=64 TRUE
	public boolean checkNumberIsAPowerOfAotherNumber(int x, int y) {
		if(y % x != 0 || y == 0) {
			return false;
		}
		if(y == x) {
			return true;
		}
		return checkNumberIsAPowerOfAotherNumber(x, y/x);
	}
	
	public static void main(String[] args) {
		
		CheckPowerOfANumber cp = new CheckPowerOfANumber();
		System.out.println("1000 is a Power of 10 : " +  cp.checkPowerOf10(1000));
		
		System.out.println("500 is a Power of 10 : " +  cp.checkPowerOf10(500));
		
		System.out.println("1024 is a Power of 2 : " +  cp.checkNumberIsAPowerOfAotherNumber(2, 1024));
		
		System.out.println("12 is a Power of 2 : " +  cp.checkNumberIsAPowerOfAotherNumber(2, 12));
	}
}
