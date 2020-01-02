package com.sist;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		System.out.println("프로그램 시작");
		Scanner sc = new Scanner(System.in);
		try {
			int su = sc.nextInt();
			System.out.println("입력받은 정수 ==> " + su);
			
		} catch (InputMismatchException e) {
			System.out.println("잘못된 값이 입력된 오류.");
			System.out.println("예외 정보  : " + e);
		} finally {
			//예외와 상관 없이 항상 실행되는 코드
			System.out.println("프로그램 종료");
			sc.close();
		}
		
	}

}
