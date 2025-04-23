package com.javaex.pratice;

public class Ex09 {
	public static void main(String[] args) {
		
		for(int y=1; y<=10; y++) {
		    //여기서 y출력하지 마셈 y랑 x가 동시에 나타나 y축 숫자가 이중으로 뜸.
			//System.out.println(y);
			
			for(int x=y; x<y+10; x++) {
				
				System.out.print(x + "\t");
				
			}
			
			System.out.println();
			
		}
		
		
		
		
	}

}
