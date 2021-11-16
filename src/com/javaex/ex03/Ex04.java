package com.javaex.ex03;

import java.util.Scanner;

public class Ex04 {
	public static void main (String []args) {
		Scanner sc = new Scanner(System.in);
		
//		8시간까지 시간당 10000원 8시간 초과시 시간당 12000원
		
		System.out.print("근무시간 : ");
		int time = sc.nextInt();
		
		if (time<=8) {
			
		System.out.println("임금은 "+time*10000+"원 입니다");
			
		} else if (time<=9) {
//		9 시간 계산값이 이상하다.
		System.out.println("임금은 "+time*12000+"원 입니다");
			
		} 
		
		
		
		
		
		sc.close();
	}
}
