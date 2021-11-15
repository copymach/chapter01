package com.javaex.ex02;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {

//		sc = new Scanner (System.in);
		
		Scanner sc = new Scanner (System.in);		
		
		
//		System.out.print("이름을 입력하세요");
		
		System.out.println ("이름을 입력해주세요");
		System.out.print("이름:");
		
		String name =sc.nextLine();
//		ddoublu num = sc.nextLine();
//		doublu num = sc.nextDouble();
		
		System.out.println("당신의 이름은 "+name+" 입니다.");
		
		
		
		sc.close();
		
		
		
	}
	 
	
}
