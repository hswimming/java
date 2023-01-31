package com.kh.stream.terminal;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Stream;

public class B_Aggregate {
	/*
	 * 기본 집계
	 * 	- 최종 처리 기능으로 요소들의 개수, 합계, 평균값, 최대값, 최소값 등과 같이 하나의 값으로 산출하는 역할을 한다.
	 * 	  - count() : 요소들의 개수를 리턴한다.
	 * 	  - sum() : 요소들의 합계를 리턴한다.
	 * 	  - average() : 요소들의 평균을 리턴한다.
	 * 	  - max() : 최대 요소를 리턴한다.
	 * 	  - min() : 최소 요소를 리턴한다.
	 * 	  - findFirst() : 첫 번째 요소를 리턴한다.
	 * 
	 * 커스텀 집계
	 * 	- 스트림에서 기본 집계 메소드를 제공하지만 다양한 집계 결과물을 만들 수 있도록 reduce() 메소드를 제공한다.
	 */
	public void method1() {
		int[] array = {1, 2, 3, 4, 5, 6};
//		int[] array = {1, 3, 5};
		
		// 2의 배수의 개수
		// 개수가 정수형 보다 많을 수 있기 때문에 long 타입으로 준다.
		long count = Arrays.stream(array).filter(value -> value % 2 == 0).count();
		
		System.out.println(count);
		
		// 2의 배수의 합
		int sum = Arrays.stream(array).filter(value -> value % 2 == 0).sum();
		
		System.out.println(sum);
		
		// 2의 배수의 평균
		/*
		 * Optional 클래스
		 * 	- 스트림의 결과 값을 저장하는 인스턴스이다.
		 * 	- 단순히 값만 저장하는 것이 아니라, 값의 존재 여부를 확인하고 값이 존재하지 않을 경우 디폴트 값을 설정할 수 있는 인스턴스이다.
		 * 	  (값이 없을 때 0으로 나누면 문제가 생길 수 있기 때문에 체크 해주는 역할)
		 */
		// Optional 람다식의 결과값을 갖고 있는 객체 (인스턴스)
		OptionalDouble average = Arrays.stream(array).filter(value -> value % 2 == 0).average();
		
//		Optional 인스턴스에서 저장된 값을 가져온다. (없을 경우 예외 처리)
//		System.out.println(average.getAsDouble());
		
//		값의 존재 여부를 확인하고 Optional 인스턴스에서 값을 가져온다.
//		if(average.isPresent()) {
//			System.out.println(average.getAsDouble());
//		} else {
//			System.out.println("데이터가 없음");
//		}
		
//		집계 값을 처리하는 Consumer를 등록한다. (Consumer는 값이 존재해야 실행된다.)
//		average.ifPresent(d -> System.out.println(d)); // 값이 없으면 0 리턴
		
//		get() 메소드와 동일하게 저장되어 있는 값을 얻어오는 메소드로,
//		값이 저장되어 있지 않을 경우 디폴트 값을 지정한다.
		System.out.println(average.orElse(0.0)); // 값이 없으면 0.0 리턴
		
//		2의 배수의 최대값
		// filter에서 걸러진 후 max 값이 없을 수 있기 때문에 Optional로 가져온다. 
		OptionalInt max = Arrays.stream(array).filter(value -> value % 2 == 0).max();		
		
		System.out.println(max.orElse(0));
		
//		2의 배수의 최소값
		OptionalInt min = Arrays.stream(array).filter(value -> value % 2 == 0).min();
		
		System.out.println(min.orElse(0));
		
//		2의 배수의 첫 번째 요소
		OptionalInt findFirst = Arrays.stream(array).filter(value -> value % 2 == 0).findFirst();
		
		System.out.println(findFirst.orElse(0));
		
		Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6);
		
//		Integer에는 int 타입 외에 다른 타입도 올 수 있으므로 sum() 함수를 지원하지 않는다.
//		int로 타입을 변환 해줘야 sum() 함수 사용이 가능하다.
		sum = stream.mapToInt(i -> i.intValue()).sum();
		
		System.out.println(sum);
	}
	
	public void method2() {
		int[] array = {1, 2, 3, 4, 5, 6};
		
//		OptionalInt reduce = Arrays.stream(array).reduce((int left, int right) -> {return left * right;});
		
		// 2의 배수만 곱하기
		OptionalInt reduce = Arrays.stream(array).filter(value -> value % 2 == 0).reduce((int left, int right) -> {return left * right;});
		
		System.out.println(reduce.getAsInt());
		
		// 2 -> 처음 시작 값, 값이 정해져 있기 때문에 Optional로 가져오지 않고 바로 정수값(int)으로 가져온다.
		int result = Arrays.stream(array).reduce(2, (left, right) -> left * right);
		
		System.out.println(result);
	}
}