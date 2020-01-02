package com.sist;

import java.util.InputMismatchException;
import java.util.Scanner;

/*다중 catch문
 * 	- catch 문을 여러 개 사용하여 예외를 처리하는 방식.
 * 	- catch 문은 순차적으로 수행된다.
 * 	- 예외를 처리하는 가장 상위의 Exception 클래스는 
 * 	    맨 마지막 줄에 와야 한다.
 * 	  (만약 첫 문장에 오는 경우 error 발생)
 */

public class Ex07 {

	public static void main(String[] args) {
		
		System.out.println("프로그램 시작");
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		String str = "s";
		int[] arr = { 10, 20, 30, 40, 50 };
		
		try {
			num = sc.nextInt();	// 오류가 발생할 가능성이 있는 코드
			System.out.println("num ==> " + num);
			
			System.out.println("str 길이 ==> " + str.length());
			
			arr[5] = 100;	// 오류가 발생할 가능성이 있는 코드
			
		} catch(InputMismatchException e) {
			System.out.println("타입 불일치 예외 발생");
			System.out.println("예외정보 : " + e);
		} catch(NullPointerException e) {
			System.out.println("예외 정보 : " + e);
			System.out.println("값이 없는 예외 발생 ");
		}catch(Exception e){
			System.out.println("모르는 예외 발생");
			System.out.println("예외 정보 : "  + e);
		} finally {
		
			sc.close();
		}
		
		System.out.println("포르그램 종료");
	}

}
