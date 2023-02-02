package com.kh.control.practice;

public class E_Break {
	/*
	 * break 문
	 * 	 [표현법]
	 * 		반복문 / switch(조건식) {
	 * 			[break;]
	 * 		}
	 *
	 * 		- break 문은 반복문과 switch 문의 실행을 중지하고 빠져나갈 때 사용한다.
	 * 		- 반복문이 중첩되어 있는 경우 break 문이 포함되어 있는 반복문만 빠져나간다. 
	 */
	
	public void method1() {
		// 1 ~ 10 까지 출력
		for (int i = 1; i <= 10; i++) {
			
			if (i == 5) {
				break;
			}
			
			System.out.print(i + " ");
		}

		// 2 ~ 9 단 까지 출력
		for (int i = 2; i <= 9; i++) {
			if (i == 3) {
				break;
			}
			
			for (int j = 1; j <= 9 ; j++) {
//				if (i == 3) { // 가장 가까운 for 문으로 빠져나가서 for 문이 다시 실행됨
//					break;
//				}
				System.out.printf("%d X %d = %d\n", i, j, (i * j));
				
			}
		}
	}

	public void method2() {
		// 1부터 랜덤값 (1 ~ 10) 까지의 합계를 반복문을 통해서 출력한다.
		// 단, 랜덤값이 5가 나오면 프로그램을 종료한다.
		
		int sum = 0;
		int random = 0;
		
		while(true) {
			sum = 0; // 초기화 해주지 않으면 기존 값에 계속 누적됨
			random = (int) (Math.random() * 10 + 1);
			
			if(random == 5) {
				break;
			}
			
			for (int i = 1; i <= random; i++) {
				sum += i; // 누적대입
			}
			
			System.out.printf("1부터 %d 까지의 합계 : %d\n", random, sum);
		}
		
		System.out.printf("랜덤값이 %d이므로 프로그램을 종료합니다.", random);
		
	}
	
}
