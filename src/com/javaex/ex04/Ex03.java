package com.javaex.ex04;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int dan;
		int i;
		
		System.out.println("단을 입력하세요");
		System.out.print("단 : ");
		
//		i=0;
		dan = sc.nextInt();
		
		for ( i=1; i<=9; i++) {
			System.out.println(dan+"*"+i+"=" +dan*i);
		}
		
//		for (int i=0; i<1 ; i++ ) {
//			System.out.println(dan+"*");
		
			
		sc.close();
		
	}

}
