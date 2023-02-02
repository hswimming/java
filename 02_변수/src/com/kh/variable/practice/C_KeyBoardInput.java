package com.kh.variable.practice;

import java.util.Scanner;

public class C_KeyBoardInput {
	/*
	 * Scanner 클래스
	 * 	- 사용자로부터 입력되는 정수, 실수, 문자열을 처리하는 클래스이다.
	 */
	
	public void input() {
		String name = ""; // (package java.lang;) 구문은 import 생략하고 사용 가능 (ctrl 누르고 String 마우스 좌클릭, 맨 위 확인)
		int age = 0;
		float height = 0;
		char gender = '\u0000'; // 유니코드로 출력하겠다는 뜻 (빈 문자)
		Scanner scanner = new Scanner(System.in); // in -> 키보드로 입력을 받기 위함
		
		/*
		 * scanner.nextLine() : 사용자가 입력한 값을 모두 읽어온다. (공백 포함)
		 * scanner.nextInt() : 사용자가 입력한 정수를 입력받을 때 사용한다.
		 * scanner.nextDouble() : 사용자가 입력한 실수를 입력받을 때 사용한다.
		 * 그 밖에 byte, boolean 등의 기본 자료형을 입력받을 때도 마찬가지로 nextXXXX() 로 입력받으면 된다.
		 */
		
		System.out.print("당신의 이름은 무엇입니까? > "); // out -> 콘솔로 출력
		name = scanner.nextLine();
		// 입력된 값을 엔터 치기 전까지 대기
		// 사용자로부터 입력이 완료되면 해당 값을 변수에 대입 (엔터 치면 name 에 입력값 대입)
		
//		System.out.println(name.charAt(0));
//		System.out.println(name.charAt(1));
		
		System.out.print("당신의 나이는 몇 살 입니까? > ");
		age = scanner.nextInt();
		
		System.out.println("당신의 키는 몇 입니까? (소수점 첫째 자리까지 입력하세요.) > ");
		height = scanner.nextFloat();
		
		scanner.nextLine();
		
		System.out.print("당신의 성별은 무엇입니까? (남/여) > ");
		String line = scanner.nextLine();
		gender = line.charAt(0);
		
		System.out.printf("당신의 이름은 %s이고 나이는 %d세, 키는 %.1fcm, 성별은 %c 입니다.", name, age, height, gender);
		
		scanner.close(); // 종료하지 않으면 메모리가 계속 상주하고 실행되기 때문에 써줘야함 (윈도우는 블루스크린 뜨는 경우가 있음)
	}
}
