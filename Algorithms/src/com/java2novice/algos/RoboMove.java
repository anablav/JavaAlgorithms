package com.java2novice.algos;
//https://www.geeksforgeeks.org/check-if-a-given-sequence-of-moves-for-a-robot-is-circular-or-not/
public class RoboMove {
	public static boolean isCircular(char[] pathArr) {
		int dir = 0; //North
		int x = 0, y = 0; // X, Y co-ordinates
		
		for(int i=0; i<pathArr.length; i++) {
			if(pathArr[i] == 'R') {
				dir = (dir + 1) % 4;
			} else if(pathArr[i] == 'L') {
				dir = ( 4 + dir - 1) % 4;
			} else {
				if(dir ==0) { // North
					y++;
				} else if(dir == 1) {  // East
					x++;
				} else if(dir == 2) {  // South
					y--;
				}else if(dir == 3) {  // West
					x--;
				}
			}
		}
		return (x==0 && y==0);
	}
	
	public static void main(String[] args) {
		String command = "GRGRGRGR";
		char path[] = command.toCharArray();
		
		if(isCircular(path)) {
	      System.out.println("Given sequence" +
	      " of moves is circular");
	    }
	    else {
	      System.out.println("Given sequence" +
	      " of moves is NOT circular");
	    }
	}
}
