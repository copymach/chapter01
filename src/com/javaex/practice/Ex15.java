package com.javaex.practice;

import java.util.Scanner;

public class Ex15 {

	public static void main (String []args) {
		
//		마일 km 변환 1km=1.609km 지정
//		마일 x km상수 = 변환값
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("마일을 입력하세요 :");
		
		double mile = sc.nextDouble();
		
		double km = mile * 1.609;
		
		System.out.println(mile+"마일은 "+km+"킬로미터 입니다.");
		
		
		
		sc.close();		
				
	}
}
