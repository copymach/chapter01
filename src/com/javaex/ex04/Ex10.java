package com.javaex.ex04;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		반복문 continue 배우기
		
		 
//		1 부터 10까지 반복
		for (int i =1 ; i<=10 ; i++) {
			
//			2의 배수이면서 3의 배수냐?
			
			if ( (i%2==0) && (i%3==0) ) {
//				6이면 끝내라
//				break;
				continue;
			}
			
			System.out.println(i);
			
		} // for 문의 끝
		
	}

}
