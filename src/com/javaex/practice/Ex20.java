package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {

	public static void main (String[]args) {
		
//		동전 종류별 갯수 입력으로 총금액 계산
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("500원 갯수 : ");
		int krw500 = sc.nextInt();
		
		System.out.print("100원 갯수 : ");
		int krw100 = sc.nextInt();
		
		System.out.print("50원 갯수 : ");
		int krw50 = sc.nextInt();
		
		System.out.print("10원 갯수 : ");
		int krw10 = sc.nextInt();

		int total = (krw500*500) + (krw100*100) + (krw50*50) + (krw10*10);
		
		System.out.println("동전의 총합은 "+total+"원 입니다.");
	
		
		
		sc.close();
	}
}
