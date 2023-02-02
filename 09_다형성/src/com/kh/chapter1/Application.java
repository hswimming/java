package com.kh.chapter1;

import com.kh.chapter1.polymorphism.Desktop;
import com.kh.chapter1.polymorphism.Product;
import com.kh.chapter1.polymorphism.SmartPhone;
import com.kh.chapter1.polymorphism.Television;

public class Application {

	public static void main(String[] args) {
		
		// 1. 부모 타입의 참조변수(레퍼런스) 로 부모 인스턴스를 다루는 경우
		Product product = new Product();
		
		// product 참조변수로 Product 클래스의 멤버만 접근 가능
		System.out.println(product.information());
		
		// 2. 자식 타입의 참조변수로 자식 인스턴스를 다루는 경우
		Desktop desktop = new Desktop();
		
		// desktop 참조변수로 Product, Desktop 클래스의 멤버에 접근 가능
		System.out.println(desktop.information());
		System.out.println(desktop.isAllInOne());
		
		// 3. 부모 타입의 참조변수로 자식 인스턴스를 다루는 경우
		Product television = /* (Product) */ new Television(); // Product 타입의 인스턴스로 (부모 타입) 자동 형변환 됨 -> 업 캐스팅
		
		// television 참조변수로 Product 클래스의 멤버만 접근 가능
		System.out.println(television.information()); // 재정의 되어있으면 재정의 된 클래스가 호출됨 (부모의 타입보다 앞에 있기 때문) -> 예외 상황
		// 하지만 Television 클래스의 멤버에 접근하고 싶으면 형 변환을 해야 한다. (다시 자식 클래스에 접근하길 원할 경우)
		System.out.println(((Television)television).getInch()); // 다운 캐스팅
		
		// 4. 배열과 다형성
		// 다형성을 적용하기 전에는 Desktop, SmartPhone 인스턴스를 배열로 다뤄야 하는 경우 각각의 배열을 만들어야 한다.
		Desktop[] array1 = new Desktop[2];
		
		array1[0] = new Desktop();
		array1[1] = new Desktop();
		
		SmartPhone[] array2 = { // 선언과 동시에 생성
				new SmartPhone(),
				new SmartPhone()
		};
		
		// 다형성을 적용하면 부모 클래스의 배열변수로 다양한 인스턴스들을 가리킬 수 있다. -> 하나의 배열에 여러개의 인스턴스를 담을 수 있음
		Product[] array3 = new Product[4];
		
		array3[0] = new Desktop("애플", "a1111", "아이맥 24인치", 1500000, true);
		array3[1] = new Desktop("삼성", "s3333", "매직스테이션", 2000000, false);
		array3[2] = new SmartPhone("애플", "a2222", "아이폰12 미니", 900000, "KT");
		array3[3] = new Television("엘지", "t-01", "벽걸이 TV", 2000000, 40);
		
		/*
		for(int i = 0; i < array3.length; i++) {
			System.out.println(array3[i].information());
		}
		
		for (int i = 0; i < array3.length; i++) { 
			if (array3[i] instanceof Desktop) {
				System.out.println(((Desktop)array3[i]).isAllInOne());
				
//				Desktop d = (Desktop)array3[i]; // 위 코드를 좀 더 풀어서 작성
//				System.out.println(d.isAllInOne());
				
			} else if (array3[i] instanceof SmartPhone) {
				System.out.println(((SmartPhone) array3[i]).getMobileAgency());
				
//				SmartPhone s = (SmartPhone) array3[i]; // 위 코드를 좀 더 풀어서 작성
//				System.out.println(s.getMobileAgency());
				
			} else {
				System.out.println(((Television)array3[i]).getInch());
				
//				Television t = (Television)array3[i]; // 위 코드를 좀 더 풀어서 작성
//				System.out.println(t.getInch());
			}
		}
		*/
		
		for (Product p : array3) { // 향상된 for 문
			if (p instanceof Desktop) {
				System.out.println(((Desktop)p).isAllInOne());
			} else if (p instanceof SmartPhone) {
				System.out.println(((SmartPhone)p).getMobileAgency());
			} else {
				System.out.println(((Television)p).getInch());
			}
		}
		// 매개변수의 다형성
		System.out.println();
		productInfo(new Desktop());
		productInfo(new SmartPhone());
		productInfo(new Television());
	}
		
		/*
		public static void productInfo(Desktop desktop) {
			System.out.println(desktop.information());
		}
		
		public static void productInfo(SmartPhone smartPhone) {
			System.out.println(smartPhone.information());
		} 
		
		public static void productInfo(Television television) {
			System.out.println(television.information());
		}
		*/
	
	// product -> 부모 클래스, 3개의 자식 클래스를 다 담을 수 있기 때문에 위 주석처럼 하나하나 만들지 않아도 됨
	public static void productInfo(Product product) { // 업 캐스팅
		System.out.println(product.information());
	}
}
