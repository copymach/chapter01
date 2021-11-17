package com.javaex.ex04;

import java.util.Scanner;

public class Ex02 {
	public static void main (String [] args) {
//		구구단 출력
		Scanner sc = new Scanner(System.in);
		
		int dan;
		int i;
		
		
		System.out.println("단을 입력해주세요.");
		System.out.print("단 : ");
		
		dan = sc.nextInt();
		i = 1;

		while (i<=9) {
			System.out.println(dan+"*"+i+"="+dan*i);
//			i에 1씩 올려보자
			i++;
			
//			i=i+3; 3개씩 넘겨서 1 3 5...
//			i=2; 무한 에러
		}
		

		
		
		sc.close();

		
		
	}
}
