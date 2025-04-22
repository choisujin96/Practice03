package com.javaex.pratice;

public class Ex05 {

	public static void main(String[] args) {
		
		int i = 1;
		boolean flag = true;
		
		while(flag) {
			if(i>=5) {
				flag = false;
			}
			
			System.out.println(i);
			i=i+1; //왜 6이 출력이 안되냐면 이 이후에 println이 없기 때문.
		}
		
		
	}

}
