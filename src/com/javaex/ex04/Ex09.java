package com.javaex.ex04;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		숫자 입력 -> 3의배수 판별 , 0 입력시 종료
		Scanner sc = new Scanner(System.in);
		
		int x;
		
		boolean action = true;
		
//		while ( true ) {
		while ( action ) {
			
			System.out.println("숫자를 입력하세요.");
			x = sc.nextInt();
			
//			0이면 종료
			if (x == 0) {
				System.out.println("종료");
//				액션을 펄스로 바꿔서 브레이크와 달리 그대로 아래로 내려감
				action = false;
//				break; 탈출
			} else if ( x%3 == 0 ) {
				System.out.println("3의 배수입니다.");
			} else {
				System.out.println("3의 배수가 아닙니다.");
			}
		

			

			

		}
		
//		while 안쓰고 if만 사용해서 해결 시도
//		if ( x == 0 ) {
//			System.out.println("종료");
//		} else if ( x%3 == 0 ) {
//			System.out.println("3의 배수입니다.");
//		} else {
//			System.out.println("3의 배수가 아닙니다.");
//		}
		
		sc.close();
	}

}
