package com.javaex.practice;

public class Ex06 {
	public static void main (String []args) {
		int i = 10;
		int n = i++ %2;
		
		System.out.println(i);
//		i = 10 - i값 뒤에++이 붙어서 후처리라 10이 그대로 내려옴
		System.out.println(n);
//		증가이전 값 대입 10 나머지 2 = 0 
		
	}
}
