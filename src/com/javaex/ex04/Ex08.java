package com.javaex.ex04;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		6의 배수 14의 배수 x를 찾기
//		while 은 반복횟수 미정, for 반복 횟수 정해진 경우 좋다
		
		int i=0;
		
		while (true) {
			
//			i++;
			i=i+1;
			
//			6의 배수&14의 배수인가?
			if ( i%6==0 && i%14==0 ) {
				System.out.println(i);
				break;
			}
			
		}
		
		
		
//		int x;
//		int x2;
//		
//		System.out.println(4%6);
//		x = 1;
//		while (x%6==0 && x%14==0) {
//			x++;
//			
//			break;
//		}
		
	}

}
