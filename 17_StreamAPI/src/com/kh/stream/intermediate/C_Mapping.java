package com.kh.stream.intermediate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import com.kh.stream.vo.Student;

public class C_Mapping {
	/*
	 * 매핑
	 * 	- 중간 처리 기능으로 스트림의 요소를 다른 타입의 요소로 대체하는 역할을 한다.
	 * 	  - map() : 요소를 대체하는 요소로 구성된 새로운 스트림을 생성한다.
	 * 	  - flatMap() : 하나의 요소를 복수의 요소들로 구성된 새로운 스트림을 생성한다.
	 * 	  - asDoubleStream() : IntStream을 DoubleStream으로 변환해서 리턴한다.
	 * 	  - asLongStream() : IntStream을 LongStream으로 변환해서 리턴한다.
	 * 	  - boxed() : int, long, double 요소를 Integer, Long, Double 요소로 박싱해서 스트림을 생성한다.
	 */
	public void method1() {
		List<Student> students = Arrays.asList(
			new Student("황수영", 28, "여자", 80, 50),
			new Student("아롱이", 15, "여자", 80, 80),
			new Student("보리", 10, "여자", 90, 90),
			new Student("홍시", 25, "여자", 50, 80)
		);
		
		students.stream()
				.map((Student student) -> {return student.getName();})
				.forEach(System.out::println);
		
		System.out.println();
		
		double avg = students.stream()
							// stream의 요소의 타입을 IntStream으로 변환
							.mapToInt((Student student) -> {return student.getMath();})
							.average()
							.getAsDouble(); // 여기까지 호출해야 평균값을 구할 수 있다.
		
		System.out.println("수학 점수의 평균 : " + avg);
	}
	
	public void method2() {
		List<String> list = Arrays.asList("Java11 Lambda", "StreamAPI Filtering Mapping");
		
		list.stream().forEach(System.out::println);
		
		list.stream()
//			.flatMap((String str) -> {
//				String[] array = str.split(" ");
//				
//				return Arrays.stream(array);
//			})
		
			.flatMap(str -> Arrays.stream(str.split(" ")))
			.forEach(System.out::println);
	}
	
	public void method3() {
		int[] array1 = {1, 2, 3, 4, 5};
		double[] array2 = {1.1, 2.2, 3.3, 4.4, 5.5};
		
		Arrays.stream(array1)
//			  .asDoubleStream()
			  .asLongStream() // 출력된 데이터 타입은 Integer 타입이 아닌 Long 타입
//			  .asDoubleStream()
			  .forEach(value -> System.out.print(value + " "));
		
		System.out.println();
		
		Arrays.stream(array2)
			  // 기본 타입의 데이터를 인스턴스 타입으로 박싱
			  .boxed()
			  .sorted(Comparator.reverseOrder())
			  // 인스턴스 타입을 다시 Double 타입으로 바꾸려면? (언박싱 없음)
			  .mapToDouble(value -> value.doubleValue())
			  .forEach((value -> System.out.print(value + " ")));
	}
}