package com.kh.dimension.practice;

import java.util.Arrays;
import java.util.Scanner;

public class DimensionPractice {
	
	public void practice1() {
		
		int[][] array = new int[4][4];
		int value = 1;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = value++;
			}
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.printf("%2d ", array[i][j]);
			}

			System.out.println();
		}
	}

	public void practice2() {
		
		int [][] arr = new int[4][4];
		int value = 16;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = value--;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.printf("%2d ", arr[i][j]);
			}
			
			System.out.println();
		}
	}

	public void practice3() {
		
		String[][] arr = new String[3][3];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = "(" + i + ", " + j + ")";
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			
			System.out.println();
		}
	}
	
	public void practice4() {
		
		int[][] arr = new int[4][4];
		
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = 0; j < arr[i].length-1; j++) {
				arr[i][j] = (int)(Math.random() * 10 + 1);

				arr[i][3] += arr[i][j];
				arr[3][j] += arr[i][j];
				arr[3][3] += arr[i][j];
			}
		}
//
//		for(int i = 0; i < arr.length-1; i++) {
//			arr[3][3] += arr[i][3] + arr[3][i];
//		} // 중복으로 더해짐!!

		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("%3d ", arr[i][j]);
			}

			System.out.println();
		}
	}
	
	public void practice5() {
		
		char[][] arr = null;
		int num1 = 0;
		int num2 = 0;
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("행 크기 : ");
			num1 = scanner.nextInt();
			
			System.out.print("열 크기 : ");
			num2 = scanner.nextInt();
			
			if (num1 >= 1 && num1 <= 10 && num2 >= 1 && num2 <= 10) {
				arr = new char[num1][num2];

				for (int i = 0; i < arr.length; i++) {
					for (int j = 0; j < arr[i].length; j++) {
						arr[i][j] = (char) (int) (Math.random() * 26 + 65);
					}
				}
				
				for (int i = 0; i < arr.length; i++) {
					for (int j = 0; j < arr[i].length; j++) {
						System.out.print(arr[i][j] + " ");
					}
					
					System.out.println();
					
				}
				
				break;
				
			} else {
					System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
			}
					
		}
				
	}
	
	public void practice6() {
		
		String[][] strArr = new String[][] {{"이", "까", "왔", "앞", "힘"}, 
			{"차", "지", "습", "으", "냅"}, {"원", "열", "니", "로", "시"},
			{"배", "심", "다", "좀", "다"}, {"열", "히", "! ", "더", "!! "}};
			
//			for (int j = 0; j < strArr.length; j++) {
//				for (int i = 0; i < strArr[j].length; i++) {
//					System.out.print(strArr[i][j]);
//				}
//				
//				System.out.println();
//				
//			}
			
			for (int i = 0; i < strArr.length; i++) {
				for (int j = 0; j < strArr.length; j++) {
					System.out.print(strArr[j][i]);
				}
				
				System.out.println();
				
			}
		}
	
	public void practice7() {
		
		int num = 0;		
		int sum = 0;
		int value = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("행의 크기 : ");
		num = scanner.nextInt();
		
		char arr[][] = new char[num][];
		for (int i = 0; i < arr.length; i++) {
			System.out.printf(" %d 행의 크기 : ", i);
			sum = scanner.nextInt();
			
			arr[i] = new char[sum];
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (char)(97 + value++); 	
				
				System.out.print(arr[i][j] + " ");
			}

			System.out.println();
			
		}	
	}
		
	public void practice8() {
		
		int value = 0;
		
		String array[] = new String[] 
				{"강건강", "남나나", "도대담", "류라라", "문미미", "박보배", 
						"송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하"};
		
		String arr1[][] = new String[3][2];
		String arr2[][] = new String[3][2];
		
		System.out.println("== 1분단 ==");
		
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				arr1[i][j] = array[value++];
				
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("== 2분단 ==");
		
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				arr2[i][j] = array[value++];
				
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public void practice9() {
		
		int value = 0;
		
		String array[] = new String[] 
				{"강건강", "남나나", "도대담", "류라라", "문미미", "박보배", 
						"송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하"};
		
		String arr1[][] = new String[3][2];
		String arr2[][] = new String[3][2];
		
		System.out.println("== 1분단 ==");
		
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				arr1[i][j] = array[value++];
				
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("== 2분단 ==");
		
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				arr2[i][j] = array[value++];
				
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("==============================");
		
		String student = "";
		String str = "";
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("검색할 학생 이름을 입력하세요 : ");
		student = scanner.nextLine();
		
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				if (student.equals(arr1[i][j])) {
					if (j == 0) {
						str = "왼";
						System.out.printf("검색하신 %s 학생은 1분단 %d줄 %s쪽에 있습니다.", student, i+1, str);
					} else {
						str = "오른";
						System.out.printf("검색하신 %s 학생은 1분단 %d줄 %s쪽에 있습니다.", student, i+1, str);
					}
				}
			}
		}
			
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				if (student.equals(arr2[i][j])) {
					if (j == 0) {
						str = "왼";
						System.out.printf("검색하신 %s 학생은 2분단 %d줄 %s쪽에 있습니다.", student, i+1, str);
					} else {
						str = "오른";
						System.out.printf("검색하신 %s 학생은 2분단 %d줄 %s쪽에 있습니다.", student, i+1, str);
					}
				}
			}
		}
	}
}