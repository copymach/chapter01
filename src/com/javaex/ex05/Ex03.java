package com.javaex.ex05;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		배열 연습
		
		int[] intArray = new int [4]; 
		
		
//		new int [] 안에 숫자 안넣게 착각 주의
		int[] intArray2 = new int[] {1,2,3};
		
		int[] intArray3 = {4,5,6};
				
		intArray[0] = 3;
		intArray[1] = 7;
		intArray[2] = 13;
		intArray[3] = 55;
		
		
		
		System.out.println(intArray[1]);
		System.out.println(intArray2[2]);
		System.out.println(intArray3[2]);
		
		System.out.println("==============");
		
//		intArray.length = 4
		for (int i=0 ; i<intArray.length ; i++) {
			System.out.println(intArray[i]);	
		}
		
		System.out.println("==============");
		
		/*
		int[] intArray = new int [3]; //3은 방의 갯수
		
		intArray[0] = 3;
		intArray[1] = 13;
		intArray[2] = 7;
		
		
		System.out.println(intArray[1]);
		
		for (int i=0 ; i<3 ; i++) {
			System.out.println(intArray[i]);	
		}
		
		*/
		
		System.out.println("==============");
		
//		칸 추가 불가 - 나중에 생길 칸이 있으면 미리 공백 만들것
		char[] charArray = new char [3];
		 
		
		charArray[0] = 'A';
		charArray[1] = '한';
		charArray[2] = 'z';
		
		for (int i = 0 ; i<3 ; i++) {
			System.out.println(charArray[i]);
		}
		
		
	}

}
