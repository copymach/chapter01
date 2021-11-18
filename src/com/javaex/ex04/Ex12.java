package com.javaex.ex04;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		숫자를 입력받아 더하는 프로그램 0은 종료
		
		Scanner sc = new Scanner(System.in);
		int num, num1, num2, num3, num4, sum;
		
		System.out.println("숫자를 입력하세요. [0 입력은 종료]");
		
//		sum을 쓰기 전에 0을 넣어서 초기화 
		sum = 0;
		
		
		
		
		/*
//		do while 문 연습 		
		do {
//			숫자를 입력받는다 -> 합을 구한다 -> 합계를 출력한다
			
			num = sc.nextInt();
			
//			숫자 누적 합산
			sum = sum + num;
			System.out.println("합계 : "+sum);
				
//			반복 조건 : 숫자가 0이 아니면 반복 = true 
		} while(num !=0 ) ; 
//		do while 종료
		*/
		
		
//		while 문으로 누적 숫자 계산 식 표현 위와 같은 결과
		
		while (true) {
			num = sc.nextInt();
			sum = sum+num;
			System.out.println("합계 = "+sum);
			
			
//			num이 0 이면 끝 while문을 나가라 break 
			if ( num==0 ) {
				break;
			}
			
		}
		

		
		
		
		/*
		억지로 만든 계산 코드

		num1 = sc.nextInt();		
		System.out.println("합계 ="+num1);
		
		num2 = sc.nextInt();
		System.out.println("합계 ="+(num1+num2));
		
		num3 = sc.nextInt();		
		System.out.println("합계 ="+(num1+num2+num3));
		
		num4 = sc.nextInt();
		System.out.println("합계 ="+(num1+num2+num3+num4));
		*/
		

		System.out.println("종료");
		
		sc.close();
	}

}
