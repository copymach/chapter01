package com.javaex.ex03;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		점수 입력 받아 60점 이상 합격 이하는 불합격 메시지 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 :");
		
		int num = sc.nextInt();

		
		if (num >=60) {
			System.out.println("합격입니다.");
			
			
		} else {
			System.out.println("불합격입니다.");
		}
				
				
		
		System.out.println("프로그램 종료");
		
		sc.close();
	}

}
