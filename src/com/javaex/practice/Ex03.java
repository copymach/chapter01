package com.javaex.practice;

public class Ex03 {

	public static void main (String [] args) {
		int x = 1;
		int y = 1;
		
		int a = ++x *2;
		int b = y++ *2;
		
		System.out.println("a=" +a);
//		1+1 = 2 * 2 = 4
		System.out.println("b=" +b);
//		1 = 1 * 2 = 2
		System.out.println("x=" +x);
//		x는 증가연산자 전처리 1+1=2 거기에 2를 곱해서 결과는 4?
		System.out.println("y=" +y);
//		증가연산자 후처리라 y는 1 거기에 2를 곱하면 결과는 2
		
	}
}
