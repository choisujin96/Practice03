package com.javaex.pratice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		System.out.print("숫자:");
		int num = sc.nextInt();
		
		//int i=1; i<=7; i++
		
		for(int y=1; y<=num; y++) {
			
		for(int x=1; x<=y; x++) {
			System.out.print(y);
		}

		System.out.println("");
		}
			
			
	
		
	 sc.close();
	}

}
