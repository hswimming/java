package com.kh.stream.intermediate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class B_Sorted {
	
	/*
	 * 정렬
	 * 	- 스트림의 요소들이 최종 처리 되기 전에 중간 단계에서 요소들을 정렬해서 최종 처리 순서를 변경할 수 있다.
	 * 	- IntStream, LongStream, DoubleStream은 요소를 오름차순으로 정렬한다. (내림차순 불가능)
	 * 	- Stream<T>은 요소가 Comparable 인터페이스를 구현해야 정렬할 수 있다. (구현하지 않을 경우 예외가 발생한다.)
	 */
	
	public void method1() {
		List<String> names = Arrays.asList("황수영", "아롱이", "보리", "아롱이", "보리", "못난이", "홍시");
		
		// 오름차순 정렬 sorted()
		names.stream()
			.distinct()
			.sorted()
			.forEach(name -> System.out.print(name + " "));
		
		System.out.println();
		System.out.println();
		
		// 내림차순 정렬 Comparator.reverseOrder()
		names.stream()
			.distinct()
			
			// 방법 1
//			.sorted((String name1, String name2) -> {
//				return name2.compareTo(name1);
//			})
			
			// 방법 2
			.sorted((Comparator.reverseOrder())) // reverseOrder() -> static 메소드
			
			.forEach(name -> System.out.println(name + " "));
	}
}