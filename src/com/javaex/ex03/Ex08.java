package com.javaex.ex03;

import java.util.Scanner;

public class Ex08 {
	public static void main (String []args) {
		
//		중복 if문
//		숫자입력받아 양수 짝수 홀수 출력 / 음수면 음수표시 0이면 0
//		힌트 % 활용 나머지가0 이면 짝수
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("숫자를 입력하세요");
		System.out.print("숫자 : ");
		
		int num = sc.nextInt();
		
		if (num>0) {
			
			if (num%2 == 0) {
//			num을 2로 나누었을때 0이면 짝수
				System.out.println("짝수");
			} else {
				System.out.println("홀수");
			}
		
						
		} else if (num<0) {
//			num이 0보다 작으면 음수
			System.out.println("음수");
		} else {
			System.out.println("0");
		}
		
		
		sc.close();
	}
}
