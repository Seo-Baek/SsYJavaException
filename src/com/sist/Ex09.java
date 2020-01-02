package com.sist;

/*
 * 	2. throws 키워드
 * 		- 예외 처리를 위임시키는 명령어.
 * 			형식) 메소드명 throws 예외처리클래스 {    }
 * 		- throws 지정된 메소드를 호출할 경우
 * 		   메소드 내에서 예외가 발생하면 해당 예외를
 * 		   호출한 곳으로 위임시켜서 예외를 처리하는 방법
 */

public class Ex09 {

	static void exception1() throws Exception{
		String str1 = "java";
		String str2 = null;
		System.out.println("str1 문자열 길이 ==> " + str1.length());
		System.out.println("str2 문자열 길이 ==> " + str2.length());
	}
	static void exception2() throws Exception{
		int num1 = 15, num2 = 0, result = 0;
		result = num1 / num2;
		System.out.println("result ==> " + result);
	}
	
	public static void main(String[] args)  {
		
		try {
			exception1();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			exception2();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

