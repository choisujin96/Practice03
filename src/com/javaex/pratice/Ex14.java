package com.javaex.pratice;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요:");
		int num = sc.nextInt();
		int result = 0;
		
		System.out.println("\n======= 덧셈 계산기 =======");
		
		for(int i=1; i<=num; i++) {
			result+=i;
			System.out.print(i);   // i 값이 하나씩 증가하면서 그 과정이 그대로 출력
			
			if (i < num) {
		        System.out.print("+"); //"마지막 숫자 뒤에는 +를 출력하지 마!"
		    }
			
		
		}
		System.out.println();
		System.out.println("\n" + "합계: " + result);
		System.out.println("==========================");
		sc.close();

	}

}
