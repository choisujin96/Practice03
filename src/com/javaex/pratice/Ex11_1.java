package com.javaex.pratice;

import java.util.Scanner;

public class Ex11_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		System.out.print("숫자: ");
		int num = sc.nextInt();
		int sum = 0;
		
		if(num%2 == 0) {
			for(int i=2; i<=num; i+=2) {
				sum +=i;
			}	
				System.out.println("결과값: "+ sum);
				
		}else {
			for(int i=1; i<=num; i+=2) {
				sum+=i;
			}
				System.out.println("결과값: " + sum);
				
		}
		
		 
					
				
	sc.close();			
			
			
	}

	 
}
	