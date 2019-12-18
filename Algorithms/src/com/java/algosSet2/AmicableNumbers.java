package com.test;

//Sum of divisors of first number is equal to the secondnumber and vice versa
public class AmicableNumbers {
	
	public static boolean isAmicable(int a, int b) {
		
		int sumA = 0;
		int sumB = 0;
		
		for(int i=1; i<=a/2; i++) {
			if(a%i == 0) {
				sumA += i;
			}
		}
		
		for(int i=1; i<=b/2; i++) {
			if(b%i == 0) {
				sumB += i;
			}
		}
		
		return (sumA == b && sumB == a);
	}
	
	public static void main(String[] args) {
		System.out.println(isAmicable(220, 284));
	}
}
