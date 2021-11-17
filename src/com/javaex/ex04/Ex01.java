package com.javaex.ex04;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		반복문 연습

//		int 에 꼬리 붙히기
		int tail = 0;
		
//		초기값
		int i=0;
		
		
//		조건식
		while (i<5) {
			System.out.println("I like Java" + tail);
			
			
//			테일3 대신 i 값에 직접 3을 추가
//			System.out.println("I like Java" + (i+3));
			
//			0부터 시작하는 테일대신 i를 활용해보기
//			System.out.println("I like Java" + i);
//			중간식
			i++;
			
			tail++;
		}
	}

}
