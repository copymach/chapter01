package com.javaex.practice;

public class Ex09 {
	public static void main (String[]args) {
		
//		온도 화씨를 섭씨 변환-결괏값이0 나오는 에러수정
//		double f=80.0;
//		System.out.println(5/9*(f-32.0));
		
//		위의 코드로 0으로나옴
//		9/5는 1.8인데 0으로 계산 0곱하면 값도 0
		
		
		double f=80.0;
		System.out.println(5.0/9.0*(f-32.0));
//		System.out.println((f - 32)/1.8); 
		
//		화씨 80도 = 섭씨 26.666 도
//		f - 32 (얼음 어는 온도 섭씨는0도 화씨는 -32도 나온값에서 나누기 1.8 (1.8 = 9/5)

//		정수형 나눌때는 int 나 double 를 쓰든 .0 으로 입력할것 
				
	}
}
