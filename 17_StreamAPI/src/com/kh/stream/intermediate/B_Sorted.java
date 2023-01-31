package com.kh.stream.intermediate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import com.kh.stream.vo.Student;

public class B_Sorted {
	/*
	 * 정렬
	 * 	- 스트림의 요소들이 최종 처리 되기 전에 중간 단계에서 요소들을 정렬해서 최종 처리 순서를 변경할 수 있다.
	 * 	- IntStream, LongStream, DoubleStream은 요소를 오름차순으로 정렬한다. (내림차순 불가능)
	 * 	- Stream<T>은 요소가 Comparable 인터페이스를 구현해야 정렬할 수 있다. (구현하지 않을 경우 예외가 발생한다.)
	 */
	public void method1() {
		List<Student> students = Arrays.asList(
				new Student("황수영", 28, "여자", 80, 50),
				new Student("아롱이", 15, "여자", 80, 80),
				new Student("보리", 10, "여자", 90, 90),
				new Student("홍시", 25, "여자", 50, 80)
			);
		
		List<String> names = Arrays.asList("황수영", "아롱이", "보리", "아롱이", "보리", "못난이", "홍시");
		
		// Comparable 인터페이스 구현 내용에 따라서 정렬 (오름차순 정렬)
		// sorted()
		names.stream()
			.distinct()
			.sorted()
			.forEach(name -> System.out.print(name + " "));
		
		System.out.println();
		System.out.println();
		
		// Comparable 인터페이스 구현 내용에 반대로 정렬 (내림차순 정렬)
		// sorted((Comparator.reverseOrder()))
		names.stream()
			.distinct()
			
			// 방법 1
//			.sorted((String name1, String name2) -> {
//				return name2.compareTo(name1);
//			})
			
			// 방법 2
			.sorted((Comparator.reverseOrder())) // reverseOrder() -> static 메소드
			
			.forEach(name -> System.out.println(name + " "));
		
		System.out.println();
		
		// students 정렬
		students.stream()
//				.sorted()
				// Comparable 인터페이스를 구현해야 사용 가능, 정의되어 있는 내용을 반대로 재정의 (내림차순)
				.sorted(Comparator.reverseOrder())
//				.sorted((Student s1, Student s2) -> {return s1.getAge() - s2.getAge();}) // 오름차순
//				.sorted((s1, s2) -> s2.getAge() - s1.getAge()) // 내림차순
				.forEach(student -> System.out.println(student));
	}
	
	public void method2() {
//		int[] array = {3, 5, 1, 4, 2}; // 배열 선언과 동시에 배열 인스턴스 생성
		
//		int[] array;
		
//		array = new int[] {3, 5, 1, 4, 2};
		
		// 오름차순 정렬
		Arrays.stream(new int[] {3, 5, 1, 4, 2})
			  .sorted() // 기본 타입 
			  .forEach(value -> System.out.print(value + " "));

		System.out.println();
		
		// 내림차순 정렬
		Arrays.stream(new int[] {3, 5, 1, 4, 2})
		  	  .boxed() // 기본 타입의 데이터를 인스턴스 타입으로 boxing
		  	  .sorted(Comparator.reverseOrder()) // boxing 된 데이터로 내림차순 정렬
		  	  .forEach(value -> System.out.print(value + " "));
	}
}