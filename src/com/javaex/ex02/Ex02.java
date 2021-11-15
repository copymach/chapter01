package com.javaex.ex02;

import java.util.Scanner;

public class Ex02 {

	public static void main (String[] args) {
		
		Scanner sc = new Scanner (System.in); 
//		ctrl + shift + o 임포트 자동 부르기 - 에러메시지 사라짐
		
		
		
		System.out.println("숫자를 입력하세요.");
		
//		int num = 6 ;
		int num = sc.nextInt() ;
		
		System.out.println("입력한 숫자는 " + num + " 입니다.");
		
		
		sc.close();
//		sc 스캐너 메모리 반환 항상 종료해주자. 마지막 태그 닫듯이 sc 쓸떄 미리 작성
		
	}
}
