package com.javaex.ex05;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		배열 연습2 배열 복사하기
		
		int [] arrA = new int[3];
		
		arrA[0] = 3;
		arrA[1] = 60000;
		arrA[2] = 9;
		
		int [] arrB; 
		arrB = arrA;
		
		for (int i=0; i<arrB.length ; i++) {
			System.out.println(arrB[2]);
		}
		
		System.out.println("==========");
		
		for (int i=0; i<arrA.length ; i++) {
			System.out.println(arrA[i]);
		}
	}

}
