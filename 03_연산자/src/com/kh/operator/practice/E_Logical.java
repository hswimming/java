package com.kh.operator.practice;

import java.util.Scanner;

public class E_Logical {
	public void method1() {
		// 사용자가 입력한 정수값이 1 부터 100 사이의 값인지 확인
		int number = 0;
		boolean result = false;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("임의의 정수를 입력해 주세요. > ");
		number = scanner.nextInt();
		
		// 1 <= number <= 100
//		result = 1 <= number <= 100;
		result = (number >= 1) && (number <= 100);
		
		System.out.printf("%d은(는) 1 부터 100 사이의 값인가요? : %b\n", number, result);
		
		scanner.close();
		
	}
}