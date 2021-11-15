package com.javaex.practice;

import java.util.Scanner;

public class Ex18 {

	public static void main (String[]args) {
		
//		화씨를 섭씨로 변환 Fahrenheit Celsius
//		섭씨 공식 = 5/9*(화씨-32)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("화씨 :");
		
		double fah = sc.nextDouble();
		
		
		double cel = (5.0/9.0)*(fah-32) ;
//		double cel = 0.55555555556*(fah-32) ; 
				
		System.out.println("화씨 "+fah+"의 섭씨온도는 "+cel+" 입니다.");
		
		sc.close();
		
	}
}
