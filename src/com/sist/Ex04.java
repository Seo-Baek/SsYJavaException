package com.sist;

/*
 * 예외처리
 * 	- 실행시간에서 발생하는 예외(오류)를 프로그램으로 처리.
 * 	- 관련 키워드
 * 		1.try ~ catch ~ finally 블럭
 * 		2.throw 키워드
 */
/*	1.try ~ catch ~ finally 블럭
 * 		형식)
 * 			try {
 * 					예외가 발생할 가능성이 있는 코드;
 * 			} catch(예외클래스 참조변수) {
 * 					참조변수 : 예외 정보를 넘겨받는 변수
 * 					예외 발생 시 실행되는 내용;
 * 			} finally {
 * 					// 생략이 가능함.
 * 					예외와 상관없이 실행되는 코드;
 * 			}
 * 
 */

public class Ex04 {

	public static void main(String[] args) {
		
		System.out.println("프로그램 시작");
		
		int num1 = 10, num2 = 0, result = 0;
		
		try {
			//0으로 나눈 경우 - error 발생
			result = num1 / num2;
		} catch (ArithmeticException e) {
			System.out.println("산술적 예외가 발생함.");
			System.out.println("예외정보 : " + e);
			// 참조변수 정보를 불러와 어떤 예외가 발생하였는지 알려줌.
		}
		
		System.out.println("result ==> " + result);
		
		System.out.println("프로그램 종료");	
	}

}
