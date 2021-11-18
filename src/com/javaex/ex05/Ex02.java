package com.javaex.ex05;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		배열 연습
		
		int i;
		int[] intArray = new int [5];
//		int 자리에 char float 사용가능
		
		intArray[0] = 3;
		intArray[1] = 6;
		intArray[2] = 7;
		intArray[3] = 2;
		intArray[4] = 55;


//		i<6 로 할 경우 마지막 방이 없어서 에러
		for (i=0;i<5;i++) {
			System.out.println(intArray[i]);
			
		}
		
		System.out.println("=============");
		
		System.out.println(intArray[3]);
		
		System.out.println(intArray[0]);
		
		System.out.println(intArray[1]);
	}

}
