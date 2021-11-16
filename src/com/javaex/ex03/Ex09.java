package com.javaex.ex03;

import java.util.Scanner;

public class Ex09 {
	public static void main (String [] args) {
		
		//과목번호입력 강의신 번호 출력
//		과목코드1 = R101호 , 2=R202 , 3=R303 4=R404 
//		나머지는 상담원에게 문의하세요
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("과목을 입력하세요.");
		System.out.println("(1.자바 2.C 3.C++ 4.파이썬)");
		System.out.print("과목번호 : ");
		
		int num= sc.nextInt();
		
		if (num==1) {
			System.out.println("R101호");
			
		} else if (num==2) {
			System.out.println("R202호");			
		} else if (num==3) {
			System.out.println("R303호");
		} else if (num==4) {
			System.out.println("R404호");
		} else {
			System.out.println("싱딤원에게 문의하세요.");
		}
		
		
	
		
		sc.close();
	}
}
