package com.java2novice.algos;

public class VirtusaTest {
	
	public static void main(String[] args) {
		int[] a = {1};
		VirtusaTest test = new VirtusaTest();
		test.increment(a);
		System.out.println(a[a.length-1]);
	}

	void increment(int[] i) {
		i[i.length - 1]++;
	}
	
	class MyRegex {
	    private String pattern = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
	    private String iP;
	    
	    public MyRegex(String iP) { 
	        // Write your code here
	        this.iP = iP;
	    }
	    
	    public boolean isMatch() {
	        if(iP.matches(pattern)){
	            return true;
	        }
	        return false;
	    }
	}
}
