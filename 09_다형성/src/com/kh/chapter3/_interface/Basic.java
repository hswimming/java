package com.kh.chapter3._interface;

public interface Basic {
	
	// 인터페이스에서 필드는 무조건 상수이다.
	/* public static final */ int num = 10;
	
	// 인터페이스에서 메소드는 무조건 추상 메소드이다.
	// 인스턴스를 만들지 않는 메소드이기 때문에 {} 생략
	// 구현 class 에서 구현
	/* public abstract */ void turnOn();
	
	/* public abstract */ void turnOff();
	
}
