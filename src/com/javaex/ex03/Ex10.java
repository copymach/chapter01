package com.javaex.ex03;

import java.util.Scanner;

public class Ex10 {
	public static void main (String[]args) {

//		switch 명령어를 if else 대신 사용해보기
//		if 의 대답이 모두 참일 경우에 사용가능
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("과목을 입력하세요.");
		System.out.println("(1.자바 2.C 3.C++ 4.파이썬)");
		System.out.print("과목번호 : ");
		
		int num= sc.nextInt();
	
		switch (num) {
			case 1 : 
				System.out.println("R101호 입니다");
				break ;
			
			case 2 :
				System.out.println("R202호 입니다");
				break;
				
			case 3 :
				System.out.println("R303호 입니다");
				break;

			case 4 :
				System.out.println("R404호 입니다");
				break;

			default :
				System.out.println("상담원 문의 ㄱㄱ");
				break;
		}
		
		
		sc.close();
		
	}
}
