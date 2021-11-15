package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {

	public static void main (String [] args) {
//		직사각형 둘레 면적 구하기(가로세로 변수 double 쓸것)
//		직사각형의 둘레는 {(가로의 길이)+(세로의 길이)}×2
//		직사각형 면적은 가로 x 세로
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로를 입력하세요:");
		
		double width = sc.nextDouble();
		
		System.out.print("세로를 입력하세요:");
		
		double height = sc.nextDouble();
		
		double round = (width + height)*2;
		double area = width * height;
		
		System.out.print("사각형의 넓이는 :"+area);
		System.out.print("사각형의 둘레는 :"+round);
		
		sc.close();
		
	}
}
