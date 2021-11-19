package com.javaex.ex05;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		string 비교 연습
		
		String name1 = "고구마";
		String name2 = "감자";
		String name3 = new String("고구마");
		
		
		boolean result = name1.equals(name3);
		
		System.out.println("String 과 new String으로 참거짓 비교 "+name1==name3);
		
		System.out.println("eqauals 로 참거짓 비교 "+result);
	}

}
