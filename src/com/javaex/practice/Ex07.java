package com.javaex.practice;

public class Ex07 {
	public static void main (String []args) {
		
		int i = 10;
		int n = ++i %2;
		
		System.out.println(i);
//		증가 연산자 적용 11
		System.out.println(n);
//		증가 이후 값 대입 10+1 = 11 나머지 2 = 1  
	}
}
