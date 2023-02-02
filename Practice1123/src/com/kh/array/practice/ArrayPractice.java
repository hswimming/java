package com.kh.array.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice { // 완전 다름
	
	public void practice1() {
		
		int array[] = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
			for (int i = 0; i < array.length; i++) {
				System.out.print(array[i]);
		}
	}
	
	public void practice2() { // 다시
		
		int[] array = new int[10];
		
		for (int i = 0; i < array.length; i++) {
				array[i] = array.length - i;
		}
		
		for (int i = 0; i < array.length; i++) {
				System.out.print(array[i] + " ");
		}
	}
	
	public void practice3() {
		
		int num = 0;
		int[] array = null;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("양의 정수 > ");
		num = scanner.nextInt();
		
		array = new int[num];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = i + 1;
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.printf(array[i] + " ");
		}
	}

	public void practice4() {
		
		String[] str = new String[5];
		
		str[0] = "사과";
		str[1] = "귤";
		str[2] = "포도";
		str[3] = "복숭아";
		str[4] = "참외";
		
		System.out.println(str[1]);
	}
	
	public void practice5() {
		
		char ch = '\u0000';
		String str = "";
		char[] array = null;
		int count = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("문자열 : ");
		str = scanner.nextLine();
		
		System.out.println("문자 : ");
		ch = scanner.nextLine().charAt(0);
		
		array = new char[str.length()];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = str.charAt(i);
		}
		
		System.out.println(str + "에 " + ch + "가 존재하는 위치(인덱스) : ");
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] == ch) {
				System.out.print(i + " ");
				
				count++;
			}
		}
		
		System.out.println();
		System.out.println(ch + "개수 : " + count);
	}

	public void practice6() {
		
		int num = 0;
		String[] str = {"월", "화", "수", "목", "금", "토", "일"};
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		num = scanner.nextInt();
		
		if (num >= 0 && num <= 6) {
			System.out.printf(str[num] + "요일");
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}

		
	}

	public void practice7() {
	
		int num = 0;
		int[] array = null;
		int sum = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수 : ");
		num = scanner.nextInt();
		
		array = new int[num];
		
		for (int i = 0; i < array.length; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			array[i] = scanner.nextInt();
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		
		System.out.println();
		System.out.printf("총합 : %d", sum);
		scanner.close();
	}
	
	public void practice8() {
		
		int num = 0;
		int[] array = null;
		int count = 1;
		Scanner scanner = new Scanner(System.in);
		
		
		while(true) {
			
				System.out.println("정수 : ");
				num = scanner.nextInt();
			
			if (num >= 3 && num % 2 != 0) {
				array = new int[num];
				
				for (int i = 0; i < array.length; i++) {
					array[i] = count;
					
					if (i < array.length / 2) {
						count++;
					} else {
						count--;
					}
				}
					
				for (int i = 0; i < array.length; i++) {
					
					if (i < array.length-1) {
						System.out.print(array[i] + ", ");
					} else {
						System.out.println(array[i]);
					}
				}
				
				break;
				
			} else {
					System.out.print("다시 입력하세요.");
			}
		}	
		
	}

	public void practice9() {
		
		int random = 0;
		int[] array = new int[10];
		
		for (int i = 0; i < array.length; i++) {
			
			random = (int) (Math.random() * 10 + 1);
			array[i] = random;
			
			System.out.print(array[i] + " ");
		} 
		
	}

	public void practice10() {
		
		int[] array = new int[10];
		int random = 0;
		
		for (int i = 0; i < array.length; i++) {
			
			array[i] = (int) (Math.random() * 10 + 1);
			System.out.print(array[i] + " ");
		}
		
		System.out.println();
		
		Arrays.sort(array);
		System.out.printf("최대값 : %d\n", array[9]);
		System.out.printf("최소값 : %d\n", array[0]);
		
	}

	public void practice11() {
		
		int[] array = new int[10];
		int random = 0;
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 10 + 1);
			
			for (int j = 0; j < i; j++) {
				
				if (array[i] == array[j]) {
					i--;
					
					break;
				}
			}
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	public void practice12() {
		
		int[] arr = new int[6];
		int random = 0;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) ((Math.random() * 10 + 1) * 4 + 5);
			
			for (int j = 0; j < i; j++) {
				
				if (arr[i] == arr[j]) {
					
					i--;
					break;
				}
			}
		}

		Arrays.sort(arr);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice13() {

		String str = "";
		char[] array = null;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("주민등록번호(-포함)");
		str = scanner.nextLine();
		
		array = new char[str.length()];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = str.charAt(i);
			
			if (i < 8) {
				array[i] = str.charAt(i);
			} else {
				array[i] = '*';
			}
		}
		
		System.out.print(array);
		
	}

}


