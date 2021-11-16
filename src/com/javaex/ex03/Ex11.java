package com.javaex.ex03;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		월 입력 -> 해당월 일수 출력
//		30일 4 6 9 11
//		28일 2
//		31일 1 3 5 7 8 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("월을 입력하세요.");
		
		int month = sc.nextInt();
		
		/* 스위치 문법 절약 
		 * 
		switch (month) {
			case 1 :
				System.out.println("31일");
				break;
		
			case 2 :
				System.out.println("28일");
				break;
			case 3 :
				System.out.println("31일");
				break;
			case 4 :
				System.out.println("30일");
				break;
			case 5 :
				System.out.println("31일");
				break;
			case 6 :
				System.out.println("30일");
				break;
			case 7 :
				System.out.println("31일");
				break;
			case 8 :
				System.out.println("31일");
				break;
			case 9 :
				System.out.println("30일");
				break;
			case 10 :
				System.out.println("31일");
				break;
			case 11 :
				System.out.println("30일");
				break;
			case 12 :
				System.out.println("31일");
				break;
				
			default :
				System.out.println("잘못 입력하셨습니다");
				break;
		}
		*/
		
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
			System.out.println("31일");
			break;
	
		case 4:
		case 6:
		case 9:
		case 11:
			
			System.out.println("30일");
			break;
	
		case 2 :
			System.out.println("28일");
			break;
					
		default :
			System.out.println("잘못 입력하셨습니다");
			break;
	}
	
		
		sc.close();
	}

}
