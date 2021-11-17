package com.javaex.ex04;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		별을 순차적으로 뿌려주는 코드
		
		int x;
		int y;
		char star;
		
		star = '*';
		
		y=2;
		
		for (y=1 ; y<=6 ; y++) {
		
			for (x=1 ; x<=y ; x++) {
				System.out.print(star);	
			}
			
			System.out.println("\n");
		}

//		내 코드종료
		
//		sum 을 활용한 다른 사람의 해결방법
		
		String star2 = "*";
		
		for (y=1 ; y<=6 ; y++) {
			System.out.println(star2);
			star2 = star2 + "*";
		}
		
	
		
		
		for (y=1;y<=6;y++) {
			
		}
		
		
		
//		역으로 별이 6개부터 1개로 줄어가는 코드
//		while 로 표현해보기
		
		
		
//		호준이 코드
		
		 for(y = 1; y<=6; y++) {
	         
	         for(x= 1; x<=y; x++) {
	            
	            System.out.print("*");
	            
	            if(x==y) {
	               System.out.println();   
	            }
		
	         }
		 }
	} 
}
