package com.javaex.ex04;

public class Ex031 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1에서 10까지 정수의 합이 55 출력 for 문 사용
		
		int i;
		int i2;
		int sum;
		
		
//		i=1;
//		i2 = 0 ;
		
		sum = 0 ;
		for (i=1 ; i<=10 ; i++) {			
			sum = sum+i;
//			sum+=i; 위 코드와 같은 효과
			
			System.out.println(i);
			
		}
		
		System.out.println("1부터 10까지 정수의 합은 "+sum+" 입니다.");
		
//	    공식으로 구하기
	    int n;
		n = 10;
	    System.out.println("공식으로 구해보면 "+ n * (n + 1) / 2); // 55
		
		
//		while ( i<=10) {
//			
//			i++;
//			i2 = i+i;
//			System.out.println("1 부터 10까지 정수의 합은 "+(i2)+"입니다.");
//			
//		}
	}

}
