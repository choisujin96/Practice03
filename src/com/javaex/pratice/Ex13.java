package com.javaex.pratice;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.");
		System.out.print("숫자: ");
		int num = sc.nextInt();
		
		int result = 0;
		
		for(int i=1; i<=num; i++) {
			result += i;
			
		}
		sc.close();
		System.out.println("합계: " + result);
	}
	

}
