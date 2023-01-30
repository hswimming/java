package com.kh.stream.practice;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class A_Create {
	
	/*
	 * 스트림의 종류
	 * 	- java.utill.stream 패키지에 존재하고 BaseStream 인터페이스를 부모로 해서 자식 인터페이스들이 상속 관계를 이루고 있다.
	 * 	- Stream<T>, IntStream, LongStream, DoubleStream
	 * 
	 * 스트림의 생성
	 * 	- 숫자 범위로 스트림을 생성하는 방법
	 * 	  - IntStream, LongStream의 range(), rangeClosed() 메소드를 이용해서 생성한다. 
	 * 	- 배열로부터 스트림을 생성하는 방법
	 * 	  - Arrays.stream(배열) 메소드로 스트림을 생성한다.
	 * 	  - 각 스트림(Stream<T>, IntStream, ...)에 of(배열) 메소드로 스트림을 생성한다.
	 * 	- 컬렉션으로부터 스트림을 생성하는 방법
	 * 	  - 컬렉션의 stream() 메소드를 이용해서 생성한다. (java.utill.Collection.stream())
	 */
	
	// 숫자 범위로 스트림을 생성하는 방법
	public void method1() {		
		// 첫 번째 매개값 ~ 두 번째 매개값 이전까지의 값을 요소로 가지는 스트림 객체를 생성
		IntStream stream = IntStream.range(1, 10);
		
//		int sum = stream.sum(); // 정수형 데이터들을 갖고 있는 스트림 이므로 정수값 리턴
//		int sum = stream.peek((value) -> {System.out.println(value + " ");}).sum();
		
		int sum = stream.peek(value -> System.out.print(value + " ")).sum();
		
		System.out.println("\nsum : " + sum);
		
		System.out.println();
		
		// 첫 번째 매개값 ~ 두 번째 매개값까지 값을 요소로 가지는 스트림 객체를 생성
		stream = IntStream.rangeClosed(1, 10);
		
		sum = stream.peek(value -> System.out.print(value + " ")).sum();
		
		System.out.println("\nsum : " + sum);
	}
	
	// 배열로부터 스트림을 생성하는 방법
	public void method2() {
		String[] names = {"황수영", "못난이", "아롱이", "보리", "황수영", "보리"};
		
		// 외부 반복문
		// for 문을 사용하여 출력
//		for (int i = 0; i < names.length; i++) {
//			System.out.println(names[i]);
//		}
		
		for (String name : names) {
			System.out.print(name + " ");
		}
		
		System.out.println();
		
		// 스트림을 사용하여 출력
//		Arrays.<String>stream(names); // 원래는 타입을 지정해줘야 한다.
//		Stream<String> stream = Arrays.stream(names);
		
//		Stream<String> stream = Stream.<String>of(names);
//		Stream<String> stream = Stream.of(names);
		Stream<String> stream = Stream.of("황수영", "못난이", "아롱이", "보리", "황수영", "보리");
		
		// 내부 반복문
		// 리턴하는 타입이 stream -> 중간 처리
		// 리턴하는 타입이 void 나 다른 타입 -> 최종 처리
//		stream.parallel().forEach((String name) -> {System.out.print(name + " ");}); // 병렬처리
		
//		stream.forEach((String name) -> {System.out.print(name + " ");});
//		stream.forEach(name -> System.out.print(name + " ")); // 람다식으로 정리
		
		// 중복되는 값 제거
		stream.distinct().forEach(name -> System.out.print(name + " "));
	}
	
	// 컬렉션으로부터 스트림을 생성하는 방법
	public void method3() {
		List<String> names = Arrays.asList("황수영", "못난이", "아롱이", "보리", "황수영", "보리");
		
		// for 문을 사용하여 출력
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		
		System.out.println();
		
		// 스트림을 사용하여 출력
		Stream<String> stream = names.stream();
//		Stream<String> stream = names.parallelStream(); // 병렬 처리
		
//		stream.forEach(name -> System.out.println(name));
		stream.distinct().forEach(System.out::println); // 메소드 참조 및 중복 처리
	}
}