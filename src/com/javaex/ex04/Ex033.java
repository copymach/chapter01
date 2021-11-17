package com.javaex.ex04;

import java.util.Scanner;

public class Ex033 {
	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		
		int dan;
		int i;
		
		dan = sc.nextInt();
		
		System.out.println("단을 입력하세요.");
		System.out.print("단 : ");
		
		
		for (i=1 ; i<=10; ++i) {
			System.out.println(dan+" * "+" = ");
		}
		
		sc.close();
	}
}
