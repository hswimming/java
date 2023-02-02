package com.kh.inherit;

import java.util.Scanner;

import com.kh.inherit.practice.Employee;
import com.kh.inherit.practice.Student;

public class Application {

	public static void main(String[] args) {
		
		String name = null;
		int age = 0;
		double height = 0;
		double weight = 0;
		int salary = 0;
		String dept = null;
		
		int count = 0;
		char chr = '\u0000';
		Scanner scanner = new Scanner(System.in);
		
		Student[] students = new Student[3];
		
		students[0] = new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
		students[1] = new Student("김말똥", 21, 187.3, 80.0, 2, "경영학과");
		students[2] = new Student("강개순", 23, 167.0, 45.0, 4, "정보통신공학과");
		
		for (Student student : students) {
			System.out.println(student.information());
		}
		
		Employee[] employee = new Employee[10];
		
		while (true) {
			
			System.out.print("이름 : ");
			name = scanner.nextLine();
			
			System.out.print("나이 : ");
			age = scanner.nextInt();
			
			System.out.print("신장 : ");
			height = scanner.nextDouble();
			
			System.out.print("몸무게 : ");
			weight = scanner.nextDouble();
			
			System.out.print("급여 : ");
			salary = scanner.nextInt();
			
			scanner.nextLine();
			
			System.out.print("부서 : ");
			dept = scanner.nextLine();
			
			employee[count] = new Employee(name, age, height, weight, salary, dept);
			
			count ++;
			
			System.out.print("계속 추가 하시겠습니까? (y or n) : ");
			chr = scanner.nextLine().charAt(0);
			
			if (chr == 'n' || chr == 'N') {
				
				break;
			}
		}
		
		for (int i = 0; i < count; i++) {
			System.out.println(employee[i].information());
			
		}
	}
}
