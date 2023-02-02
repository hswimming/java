package com.kh.chapter4.generics;

import java.util.ArrayList;
import java.util.List;

public class MyGenerics<T extends Number> { // <T> -> Object로 변경된다.
	
	private final T[] values;

	public MyGenerics(T[] values) { // 매개변수를 받는 생성자
		this.values = values;
	}
	
	public void print() { // 요쇼의 값을 출력하는 메소드
		
		for (T t : values) {
			System.out.println(t);
		}
	}
		
	public List<T> toList() {
		
		List<T> list = new ArrayList<>();
		
		for (T t : values) {
			list.add(t);
		}
			
		return list;
	}
}
