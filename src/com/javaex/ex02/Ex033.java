package com.javaex.ex02;

import java.util.Scanner;

public class Ex033 {

		public static void main (String [] args) {
			
			Scanner sc = new Scanner(System.in);
//			ctrl shift o 를 눌러 상단에 import를 불러올것
//			sc.close(); 종료 명령어 잊지말자

			System.out.println("이름을 입력해주세요");
			System.out.print("이름:");
			
			String name = sc.nextLine() ;
//			System.out.println("당신의 이름은 "+name+ "입니다");
			
			
			
			System.out.println("나이를 입력해주세요");
			System.out.print("나이:");
			
			int age = sc.nextInt();
//			System.out.println("당신의 이름은 "+age+" 입니다");
			
			
			sc.nextLine();
//			나이 먼저 입력하면 일어나는 버그, 코드 추가해서 엔터입력하여 버그 회피 - 개행문자를 받아 처리 
			
			
			System.out.println("키를 입력해주세요");
			System.out.print("키:");
			
			double height=sc.nextDouble();
			
			
//			System.out.println("당신의 이름은 "+name+" 나이는 "+ age +"입니다");
				
			
			
			System.out.println("당신의 이름은 "+name+" 나이는 "+ age +"입니다 키는 "+height+" 입니다");
			
			
			sc.close();
			
		}
}
