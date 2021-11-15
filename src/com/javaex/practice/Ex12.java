package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {
	public static void main (String[]args) {
		
//		반지름 입력 원의 면적 구하기. 파이 3.14 상수
//		원의 넓이 : (반지름)×(반지름)×(원주율)
		 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("반지름을 입력하세요:");
		
		double radius = sc.nextDouble();
//		int 보다 double 이 더 좋을 것 같다
		
		double diameter;
		
		diameter = radius * radius * 3.14;
		
		System.out.println("원의 넓이는 "+diameter);
		
		sc.close();
	}
}
