package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {
	
	public static void main (String []args) {
		
//		구의 반지름 입력 -> 구의 부피 계산
//		구의부피 v=4/3*파이3.14*반지름r^3
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("반지름 :");
		
		double radius = sc.nextDouble();
		
		
		double area = 4.0/3.0*3.14*(radius*radius*radius);
//		double area = 1.33333333333*3.14*(radius*radius*radius);

		
		System.out.println("구의 부피는 : "+area);
		
		System.out.println("깃 테스트 버전2");
		
		System.out.println("깃 테스트 버전4");
		System.out.println("깃 테스트 버전4");
		
		
		System.out.println("깃 테스트 버전5");
		System.out.println("깃 테스트 버전5");
		
		sc.close();
		
	}
}
