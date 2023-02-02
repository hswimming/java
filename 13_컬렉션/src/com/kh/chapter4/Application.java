package com.kh.chapter4;

import java.util.List;

import com.kh.chapter4.generics.MyGenerics;

public class Application {

	public static void main(String[] args) {
		
//		String[] array = {"황수영", "신예진", "조영인", "문인수", "황보리"};
//		Integer[] array = {11, 22, 33, 44, 55};
		Double[] array = {11.1, 22.2, 33.3, 44.4, 55.5};
		
//		MyGenerics generics = new MyGenerics(array);
//		MyGenerics<String> generics = new MyGenerics<>(array); // 문자열로만 출력을 원할 경우 지정해주는 방법
//		MyGenerics<Integer> generics = new MyGenerics<>(array); // 정수로만 출력을 원할 경우 지정해주는 방법
		MyGenerics<Double> generics = new MyGenerics<>(array); // 실수로만 출력을 원할 경우 지정해주는 방법
		
		generics.print();
		System.out.println();
		
//		List<String> list = generics.toList();
//		List<Integer> list = generics.toList();
		List<Double> list = generics.toList();
		
		System.out.println(list);
	}
}
