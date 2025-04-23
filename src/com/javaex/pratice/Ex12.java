package com.javaex.pratice;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		System.out.print("숫자: ");
		int num = sc.nextInt();
		int result = 1; //곱셈이니 초기값 1로 지정 
		
		//5를 입력 //5번 증식할 예정임
		for(int i=1; i<=num; i++) { 
			result *=i; //result에 i를 곱해
		
		}
		System.out.println("결과값: " + result);
		/*
		1*1=1  (result*i=result)
		1*2=2	(result*i=result)
		2*3=6
		6*4+24
		24*5=120
		*/
	}
	
}
