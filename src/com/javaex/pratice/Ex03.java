package com.javaex.pratice;

public class Ex03 {

	public static void main(String[] args) {
		
		int x, y;
		for(x=0; x<4; x++) {
			for(y=2; y>=0; y--) { //y가 2일때 한번찍고-> 1일때 한번찍고 -> 0일때 한번 찍고 -> -1일땐 튕겨서 *가 3개
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
