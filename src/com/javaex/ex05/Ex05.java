package com.javaex.ex05;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		배열 연습
		
		int [] arrA = new int[3];
		
		arrA[0] = 3;
		arrA[1] = 6;
		arrA[2] = 9;
		
		
		
		
		
		int [] arrB = new int[3];
		
		arrB[1] = 100;
		
		
		for (int i=0 ; i<arrA.length ; i++ ) {
			arrB[i] = arrA[i];
		}
		
		System.out.println("============");
		
		
		for (int i = 0 ; i<arrB.length ; i++) {
			System.out.println(arrA[i]);
		}
	}

}
