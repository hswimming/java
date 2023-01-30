package com.kh.stream.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import com.kh.stream.vo.Student;

public class A_Filtering {
	
	/*
	 * 필터링
	 * 	- 필터링 중간 처리 기능으로 요소를 걸러내는 역할을 한다.
	 * 	- distinct()는 중복을 제거하는 메소드이다.
	 * 	- filter(Predicate)는 매개값으로 전달되는 Predicate가 false를 리턴하는 요소를 제거한다.
	 */
	
	// 중복 제거
	public void method1() {
		List<Student> students = Arrays.asList(
			new Student("황수영", 28, "여자", 80, 70),
			new Student("황수영", 28, "여자", 80, 70),
			new Student("황수영", 28, "여자", 80, 70),
			new Student("아롱이", 15, "여자", 80, 80),
			new Student("보리", 10, "여자", 90, 80)
		);
		
		List<String> names = Arrays.asList("황수영", "아롱이", "아롱이", "보리");
		Stream<String> stream = names.stream();
		
//		forEach -> 최종 처리 메소드
//		stream.forEach(name -> System.out.println(name));
		stream.forEach(System.out::println);
		
//		이미 최종 처리 메소드까지 호출된 스트림은 다시 사용할 수 없다. (다시 스트림을 얻어와야 한다.)
//		stream.distinct().forEach(System.out::println); // 에러 발생
		
		System.out.println();
		
		names.stream().distinct().forEach(System.out::println);
		
		System.out.println();
		
//		students.stream().forEach((Student student) -> {System.out.println(student);});
		students.stream().forEach(student -> System.out.println(student)); // 람다식
		
		System.out.println();
		
//		중복제거 메소드 -> equls와 hashcode 메소드 사용
//		중복제거가 되지 않는 이유? 주소값이 다르므로 같은 객체라고 보지 않는다. -> equls와 hashcode 메소드 재정의를 해야 한다.
		students.stream().distinct().forEach(student -> System.out.println(student));
	}
	
	// 필터 메소드
	public void method2() {
		List<Student> students = Arrays.asList(
				new Student("황수영", 28, "여자", 80, 50),
				new Student("황수영", 28, "여자", 80, 50),
				new Student("황수영", 28, "여자", 80, 50),
				new Student("아롱이", 15, "여자", 80, 80),
				new Student("보리", 10, "남자", 90, 90),
				new Student("홍시", 25, "여자", 50, 80)
		);
		
		List<String> names = Arrays.asList("황수영", "아롱이", "보리", "아롱이", "보리", "못난이", "홍시");
		
		names.stream() // true인 결과만 필터 통과
//			.filter((String name) -> { return name.startsWith("아");})
			.filter(name -> name.startsWith("아"))
			.forEach(name -> System.out.println(name));
		
		System.out.println();
		
		names.stream()
//			.distinct()
//			중간 처리 메소드이기 때문에 작성 위치는 상관 없다. (최종 처리 메소드가 수행되기 전에만 작성하면 된다.)
			.filter(name -> name.startsWith("보"))
			.distinct()
			.forEach(name -> System.out.println(name));
		
		System.out.println();
		
		// 성별이 남자인 학생만 출력
		students.stream()
			.filter((Student student) -> {
				return student.getGender().equals("남자");
			})
			.forEach((Student student) -> {
				System.out.println(student);
			});
		
		System.out.println();
		
		// 수학 점수, 영어 점수 둘 다 60점 이상인 학생만 출력
		students.stream()
			.distinct()
			.filter((Student student) -> {
				return student.getMath() >= 60 && student.getEnglish() >= 60;
			})
			.forEach(System.out::println);
	}
}