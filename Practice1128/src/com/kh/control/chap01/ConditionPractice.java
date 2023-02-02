package com.kh.control.chap01;

import java.util.Scanner;

public class ConditionPractice {

	public void practice3() {
		
		int korea = 0;
		int math = 0;
		int english = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("국어점수 : ");
		korea = scanner.nextInt();
		System.out.print("수학점수 : ");
		math = scanner.nextInt();
		System.out.print("영어점수 : ");
		english = scanner.nextInt();
		
		scanner.close();
		
		if (korea >= 40 && math >= 40 && english >= 40 && (korea + math + english) / 3 >= 60) {
			System.out.println("국어 : " + korea);
			System.out.println("수학 : " + math);
			System.out.println("영어 : " + english);
			System.out.println("합계 : " + (korea + math + english));
			System.out.println("평균 : " + ((korea + math + english) / 3.0));
			System.out.println("축하합니다, 합격 입니다!");
			
		} else {
			System.out.println("불합격 입니다.");
		}
		
	}

	public void practice4() {
		
		int num = 0;
		String str = ""; 
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("1~12 사이의 정수 입력 : ");
		num = scanner.nextInt();
		
			switch(num) {
				
				case 12 :
				case 1 :
				case 2 :
					str = "겨울";
					
					break;
				case 3 :
				case 4 :
				case 5 :
					str = "봄";
					
					break;
				case 6 :	
				case 7 :	
				case 8 :	
					str = "여름";
					
					break;
				case 9 :	
				case 10	:
				case 11 :
					str = "가을";
					
					break;
					
				default : str = "잘못 입력된 달";
				
			} 
			
			System.out.println(num + "월은 " + str + " 입니다");
			scanner.close();
	}

	public void practice5() {
		
		String ID = "";
		int PW = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("아이디 : ");
		ID = scanner.nextLine();
		System.out.print("비밀번호 : ");
		PW = scanner.nextInt();
		
		if(ID.equals("hsy") && PW == 8826)  {
			System.out.println("로그인 성공");
		} else if (ID.equals("hsy") && PW != 8826 ) {
			System.out.println("비밀번호가 틀렸습니다.");
		} else {
			System.out.println("아이디가 틀렸습니다.");
		}
		
		scanner.close();
		
	}

	public void practice6() {
		
		String level = "";

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		level = scanner.nextLine();
		
		switch (level) {
			
			case "관리자" :
				level = "회원관리, 게시글관리\n" + "게시글 작성, 댓글 작성\n" + "게시글 조회";
				
				break;
			case "회원" :	
				level = "게시글 작성, 댓글 작성\n" + "게시글 조회";
				
				break;
			case "비회원" :
				level = "게시글 조회";

				break;
			default :
				level = "잘못 입력했습니다.";	
		}
		
		System.out.println(level);
		
		scanner.close();
	}

	public void practice7() {
		
//		1. 시험문제
//		int[] iarr = new int[10];
//		System.out.println(iarr);
//		System.out.println(iarr[5]);
		
//		2. 시험문제
//		int[] iArr = {1, 2, 3, 4, 5};
//		
//		for (int i = 0; i < iArr.length; i++) {
//			System.out.print(iArr[i]);
//		}
		
//		3. 시험문제
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("1이상의 숫자를 입력하세요 : ");
//		int num = sc.nextInt();
//
//		int sum = 0;
//		if(num >= 0) {
//			int i = 1;
//			while(i <= num) {
//				sum += i;
//				
//				i++;
//			}
//			System.out.println("1부터 " + num + "까지의 합은 " + sum + "입니다.");
//		} else {
//			System.out.println("숫자가 1이상이 아닙니다.");
//		}
		
		double tall = 0.0;
		double  weight = 0.0;
		double sum = 0.0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("키(m)를 입력해 주세요 : ");
		tall = scanner.nextDouble();
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		weight = scanner.nextDouble();
		
		sum = weight / (tall * tall);
		
		if(sum < 18.5) {
			System.out.println("BMI 지수 : " + sum);
			System.out.println("저체중");
			
		} else if(sum >= 18.5 && sum < 23) {
			System.out.println("BMI 지수 : " + sum);
			System.out.println("정상체중");
			
		} else if (sum >= 23 && sum < 25) {
			System.out.println("BMI 지수 : " + sum);
			System.out.println("과체중");
			
		} else if (sum >= 25 && sum < 30) {
			System.out.println("BMI 지수 : " + sum);
			System.out.println("비만");
			
		} else {
			System.out.println("BMI 지수 : " + sum);
			System.out.println("고도 비만");
		}
		
		scanner.close();
	}

	public void practice8() {
		
		int num1 = 0;
		int num2 = 0;
		int sum = 0;
		char ch = '\u0000';
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("피연산자1 입력 : ");
		num1 = scanner.nextInt();
		
		System.out.print("피연산자2 입력 : ");
		num2 = scanner.nextInt();
		
		scanner.nextLine();
		
		System.out.print("연산자를 입력 (+, -, *, /, %) : ");
		ch = scanner.nextLine().charAt(0);
		
		if(num1 >= 0 && num2 >= 0) {
			switch(ch) {
			
				case '+' :
					System.out.println();
					
					break;
				case '-' :
					sum = num1 - num2;
					
					break;
				case '*' :
					sum = num1 * num2;
					
					break;
				case '/' :
					sum = num1 / num2;
					
					break;
				case '%' :
					sum = num1 % num2;
					
					break;
					
				default :
					System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
					
				return;	
				
			}
			
		} else {
			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
		}
		
		System.out.printf("%d " + "%c " + "%d = " + "%d", num1, ch, num2, sum );
	}

	public void practice9() {
		
		int middleTest = 0;
		int finalTest = 0;
		int homeWork = 0;
		int check = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("중간 고사 점수 : ");
		middleTest = scanner.nextInt();
		
		System.out.print("기말 고사 점수 : ");
		finalTest = scanner.nextInt();
		
		System.out.print("과제 점수 : ");
		homeWork = scanner.nextInt();
		
		System.out.print("출석 회수 : ");
		check = scanner.nextInt();
		
		System.out.println("========== 결과 ==========");
		
		double total = (middleTest * 0.2) + (finalTest * 0.3) + (homeWork * 0.3) + ((check * 5) * 0.2);
		
		if(total >= 70 && check >= 14) {
			System.out.println("총점 : " + total);
			System.out.println("PASS");
		} else if(total < 70 && check >= 14) {
			System.out.printf("FAIL [점수 미달]" + "(총점 : %.1f)", total);
		} else if(total >= 70 && check < 14) {
			System.out.printf("FAIL [출석 횟수 부족]" + "(%d / 20)", check);
		} else {
			System.out.printf("FAIL [출석 횟수 부족]" + "(%d / 20)", check);
			System.out.println();
			System.out.printf("FAIL [점수 미달]" + total);
		}
	}
	
	public void practice10() {

		int num = 0;
		Scanner scanner = new Scanner(System.in);

		System.out.println("실행할 기능을 선택하세요.");
		System.out.println("1. 메뉴 출력");
		System.out.println("2. 짝수/홀수");
		System.out.println("3. 합격/불합격");
		System.out.println("4. 계절");
		System.out.println("5. 로그인");
		System.out.println("6. 권한 확인");
		System.out.println("7. BMI");
		System.out.println("8. 계산기");
		System.out.println("9. pass/Fail");
		
		System.out.print("선택 : ");
		num = scanner.nextInt();
		
		switch(num) {
			case 1 :
				new ConditionPractice().practice10();
				
				break;
			case 3 :
				new ConditionPractice().practice3();
				
				break;
			case 4 :
				new ConditionPractice().practice4();
				
				break;
			case 5 :
				new ConditionPractice().practice5();
				
				break;
			case 6 :
				new ConditionPractice().practice6();
				
				break;
			case 7 :
				new ConditionPractice().practice7();
				
				break;
			case 8 :
				new ConditionPractice().practice8();
				
				break;
			case 9 :
				new ConditionPractice().practice9();
		}
		
		scanner.close();
	}
	
	public void practice11() {
		
//		반복문 예제 11번
//		int num = 0;
//		int ball = 0;
//		int total = 0;
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.print("시작 숫자 : ");
//		num = scanner.nextInt();
//		System.out.print("공차 : ");
//		ball = scanner.nextInt();
//		
//		for (int i = 0; i < 10 ; i++) {
//			total = num + (ball * i);
//			
//			System.out.print(total + " ");
//		}
	}
}
