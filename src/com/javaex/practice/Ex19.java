package com.javaex.practice;

public class Ex19 {

	public static void main (String[]args) {
		
//		빛 1년 진행하는 거리 계산 (long 변수 사용)
//		빛의 속도 300000 km/s
//		1min 60sec
//		1h = 60sec * 60min = 3600sec
//		1d = 24h = 3600sec * 24 = 86400
//		1y = 365d = 86400 * 365 =315360000
		
		long lightSpeed = 300000;
		long sec = 60;
		long min = 60;
		long hour = 24;
		long yearDays = 365;
		
		long ld1y = sec*min*hour*yearDays* lightSpeed; 
//		long ld1y = 60*60*24*365* lightSpeed;
		
		System.out.println("빛이 1년 동안 가는 거리는 "+ld1y+" km 입니다");
		
	}
}
