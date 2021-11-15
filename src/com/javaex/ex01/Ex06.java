package com.javaex.ex01;

public class Ex06 {

	public static void main(String[] args) {

//		자동형변환 연습
		double v01 = 5/4;
		System. out.println(v01); 
		//같은 자료형끼리만 된다 사람 1.25으로 계산, 자바는 정수/정수 -> 정수 1 -> 1.0  
		double v02 = (double)5 / 4 ;
		System. out.println(v02); 
		// (d)5/4 -> 5.0 /4 -> 5.0/4.0 -> 1.25 
		double v03 = 5 / (double)4 ;
		System. out.println(v03);
		// 5/(d)4 -> 5/4.0 -> 5.0 / 4.0 -> 1.25
		double v04 = (double)5 / (double)4 ;
		System. out.println(v04);
		// (d)5 / (d)4 -> 5.0/4.0 -> 1.25
		int v05 = (int)1.3 + (int)1.8 ;
		System. out.println(v05);
	
		// 1
		int v06 = (int) (1.3 + 1.8 ) ;
		System. out.println(v06);
		// int 3.1 ---> 3 l 
		
	}
	
}
