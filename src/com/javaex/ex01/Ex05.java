package com.javaex.ex01;

public class Ex05 {

	public static void main (String [] args) {
		
		double var01 = 2+3.4;
		
		System.out.println(var01);
		
		System.out.println(2+3.4);
		System.out.println("2+3.4");
//		따옴표를 붙혀서 2+3.4를 글자로 처리 계산 안함
		
		long var02 = 123456L;
		float var03 = 1.1f;
		
		System.out.println(var02+var03);
		float result = var02 + var03 ;
		
		System.out.println(result);
		
		
//		강제형변환
		int i = (int)11111.32323232323;
		
		System.out.println(i);
//		소수점을 제외하고 출력
		
		float f01 =12.5f;
		int i01 = (int) f01;
		
		System.out.println(i01);
		System.out.println(f01);
		
		
//		강제형변환
		byte v01 = 10;
		int v02 = (int)v01;
		
		System.out.println(v01);
		System.out.println(v02);
		
//		강제형변환 축소
		
		int v03 = 10; 
//		4byte => 32bit
		byte v04 = (byte)v03;
		
		System.out.println(v03);
		System.out.println(v04);
		
		int v50 = 234305204;
		byte v60 =(byte)v50;
		
		System.out.println(v50);
		System.out.println(v60);
		
		
//		실수를 정수로 변경 - 실제 많이 사용 - 소수 부분이 사라짐, 반올림 아님
		
		double v07 =24423.4424;
		int v08 = (int)v07;
		
		System.out.println(v07);
		System.out.println(v08);
		
		
//		정수를 실수로 변경
		int v09 = 7;
		double v10 = (double)v09;
		
		System.out.println(v10);
		
		
				
				
				
		
		
		
		
	}
	
	
}
