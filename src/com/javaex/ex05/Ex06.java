package com.javaex.ex05;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		배열 2가지 비교
		
		int [] arrA = new int [] {10,20,30};
		int [] arrB = new int [] {15,20,31};
		
		
//		두 배열의 크기가 같은가?
		if (arrA.length == arrB.length) {
//			각 방의 값이 같은가 검사
			System.out.println("두 배열의 크기가 같습니다");
			
			for (int i=0 ; i<arrA.length ; i++) {
				if (arrA[i] != arrB[i]) {
					System.out.println(i+"번째가 다릅니다.");
				}
				
			}
			
			
//		두 배열의 크기가 다른 경우	
		} else {
//		배열의 크기가 다른 경우
		System.out.println("두 배열의 크기가 서로 다릅니다");	
		}
		
		
		 /*
		  
	
		int [] leftArray = new int[] {10, 20, 30};
				
		int [] rightArray = new int [] {10, 20, 30};		
			
		for (int i=1 ; i>=3 ; i++) {
			
			if (leftArray == rightArray) {
				System.out.println("두 배열이 같습니다");				
			} else if (leftArray == rightArray) {
				System.out.println("두 배열의 크기가 다룹니다");
			} else {
				System.out.println(i+"번째 값이 다릅니다");
			}
		}
	  */
		
		
	}
	 
}
