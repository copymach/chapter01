package com.javaex.ex04;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1 - 20까지 수에서 2의 배수와 3의 배수를 제외한 숫자 출력
//		for continue 사용 해서 제작
		
		int x;
		
		for (x=1 ; x<=20 ; x++) {
			
			
//			2의 배수 이거나 3의 배수의 숫자라면 아무것도 안해야한다 
			if (x%2==0 || x%3==0) {
										
				continue;
			}
		
		System.out.println(x);
		
		}
}
	
}