package com.javaex.ex03;

import java.util.Scanner;

public class Ex07 {
	public static void main (String []args) {
		Scanner sc = new Scanner(System.in);
		
//		90점 A등급, 80점이상89점이면 B, 70점이상79 C 
//		60점이상69 D, 60점 미만F
		
		System.out.print("점수를 입력하세요 : ");
		
		int point = sc.nextInt();
		
		
		if (point>=90) {
			System.out.println("A등급");
		} else if (point>=80) {
//			중복하는 and and 를 지우고 간단하게 만들기
//		} else if (90>point && point>=80) {
			System.out.println("B등급");
		} else if (point>=70) {
//		} else if (80>point && point>=70) {
			System.out.println("C등급");
		} else if (point>=60) {
//		} else if (70>point && point>=60) {
			System.out.println("D등급");
		} else {
			System.out.println("F등급");
		}
			
		
		
		
		sc.close();
	}
}
