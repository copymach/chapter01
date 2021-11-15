package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {
	public static void main (String[]args) {
		
//		월급 입력 10년동안 최대 저축액 계산하기

		Scanner sc = new Scanner (System.in);
		
				
		System.out.print("월급을 입력하세요:");
		
		int salary10 =sc.nextInt();

		System.out.println("10년동안 최대 저축액은"+salary10 *(12*10) +"원 입니다.");
	
		sc.close();
		
		
	}
}
