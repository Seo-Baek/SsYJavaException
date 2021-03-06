package com.sist;

/*
 * [문제] Ex02 클래스에서 발생된 예외정보를 대상으로
 * 		 try ~ catch ~ finally 블럭을 이용하여
 * 		  예외를 처리하세요.
 */

public class Ex05 {

	public static void main(String[] args) {
		
		System.out.println("프로그램 시작");
		String str1 = "Korea";
		String str2 = null;		// null : 값이 없는 상태
		try {
			System.out.println("str1 문자열 길이 : " + str1.length());
			System.out.println("str2 문자열 길이 : " + str2.length());
			
		} catch (NullPointerException e) {
			System.out.println("null 값을 갖는 오류.");
			System.out.println("예외정보 : " + e);
		} finally {
			System.out.println("프로그램 종료");
		}
		
	}

}
