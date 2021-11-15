package com.javaex.ex01;

public class Ex07 {

	public static void main (String [] args) {
		
		System.out.println("부호연산자");
		int var = -3;
		int pVar = +var;
		int mVar = -var;
		
		System.out.println(pVar); // +(-3) = -3
		System.out.println(mVar); // -(-3) = +3
	}
	
}
