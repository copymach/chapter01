package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {

	public static void main (String [] args){
	
//	상품 구매 10% 부가세 vat
//	실제 부가세계산과 다름
//	상품가격: 7500 <--부가세포함
//	부가세: 750   상품가격의 10%
//	잔액: 받은돈-상품가격
	
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("상품가격 :");
	double price = sc.nextDouble();
	
	System.out.print("받은돈 :");
	double pay = sc.nextDouble();
	
	double vat = price / 10;
	double balance = pay - price ;
	
	System.out.println("==========================");
	System.out.println("받은돈 : "+pay);
	System.out.println("상품가격 : "+price);
	System.out.println("부가세 : "+vat);
	System.out.println("잔액 : "+balance);
	sc.close();
	
	
	}
}
