package com.kh.lambda.practice.functional;

@FunctionalInterface
public interface B_FunctionalInterface { // 추상 메소드가 하나라도 없을 경우 에러 발생
	
	// 매개변수가 있고 반환값이 없는 추상 메소드
	public void method(int a);
	
}