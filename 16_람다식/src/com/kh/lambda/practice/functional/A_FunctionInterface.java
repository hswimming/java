package com.kh.lambda.practice.functional;

@FunctionalInterface
public interface A_FunctionInterface {
	
	// 매개변수와 반환값이 없는 추상 메소드
	public void method();
	
	// public void method1(); 추상 메소드가 하나가 아닐 경우 에러 발생
}