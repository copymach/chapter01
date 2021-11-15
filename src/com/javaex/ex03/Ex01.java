package com.javaex.ex03;

import java.util.Scanner;

public class Ex01 {

	public static void main (String []args) {
		
//		점수를 입력받아 60점 이상이면 합격 메시지 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 :");
		int num = sc.nextInt();
		
		
		if(num >=60) {
//			입력한 값이 60점 이상인가 질문이 true 경우에 실행하는 영역
			
			System.out.println("합격입니다.");
			
		}
		
		
		
		
		
		sc.close();
		
	}
}
