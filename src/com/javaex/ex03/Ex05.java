package com.javaex.ex03;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		8시간까지 시간당 10000원 8시간 초과시 시간당 1.5배
		Scanner sc = new Scanner(System.in);
		
		System.out.print("근무시간 : ");
		int time = sc.nextInt();
		
		if (time <= 8) {
			System.out.println("임금은 "+time*10000+"원 입니다.");
		}
		
		else if (time >= 9) {
			System.out.println("입금은 "+(time*1.5)*10000+"원 입니다.");
		}
		
		sc.close();
	}

}
