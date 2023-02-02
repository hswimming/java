package com.kh.chapter3;

import com.kh.chapter3._interface.Basic;
import com.kh.chapter3._interface.Desktop;
import com.kh.chapter3._interface.Television;

public class Application {

	public static void main(String[] args) {
		
//		System.out.println(Basic.num);
		
		// 인터페이스는 인스턴스(객체) 생성이 불가능하다.
		// 구현하는 class 로만 인스턴스 생성 가능
//		Basic basic = new Basic();
		
//		Basic.num = 20; // 상수이기 때문에 변경하려고 하면 에러발생 
		System.out.println(Basic.num);
		
		// 인터페이스는 참조변수로 사용이 가능하다.
		// 다형성을 적용해서 인터페이스를 구현하는 인스턴스를 참조할 수 있다. (상속관계거나 구현관계에 있는 것들은 형번환이(업 캐스팅) 자동으로 일어난다.)
		Basic desktop = new Desktop("애플", "a1111", "아이맥", 1500000, true);
		Basic television = new Television("엘지", "T-01", "스마트 TV", 2000000, 60);
		
		// 인터페이스가 참조하고 있는 인스턴스 호출
		desktop.turnOn();
		desktop.turnOff();
		
		television.turnOn();
		television.turnOff();
		
	}

}
