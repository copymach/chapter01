package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {
	public static void main (String []args) {
		
//		원화를 달러화로 계산 1달러=1230.95 고정
//		달러로 변경 시 : 원화 금액 / 환율 = 달러화 환전액
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("환전할 원화를 입력하세요 :");
		
		double KRW = sc.nextDouble();
		
		double USD = KRW / 1230.95 ;
		
		System.out.println("받으실 달러는 "+USD);
		
		sc.close();
		
	}
}
