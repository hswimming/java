package com.kh.chapter1.polymorphism;

/*
 * 상속
 * 	 [표현법]
 * 		[접근제한자] class 클래스명 extends 부모클래스명 {
 * 		...
 * 		}
 */

public class Desktop extends Product { // 다중 상속 불가능
	
	private boolean allInOne; // 일체 여부
	
	public Desktop() {
//		super(); 
		// 부모 생성자 호출, 생성자에서만 접근 가능, 항상 맨 위에 작성, 기본 생성자가 반드시 있어야함
//		System.out.println("Desktop() - 호출");
	}
	
	/*
	 * 부모 클래스의 필드를 초기화 할 수 있는 방법
	 * 
	 * * super : 부모 인스턴스의 주소를 담고 있다.
	 */

	public Desktop(String brand, String pCode, String name, int price, boolean allInOne) {
//		super(brand, pCode, name, price);
//		super.set메소드 호출해서 직접 set 해주는 방법도 있음
		
		// 1. super 와 . 연산자로 부모의 필드에 직접 접근
//		super.brand = brand;
//		super.pCode = pCode;
//		super.name = name;
//		super.price = price;
		
		// 2. 부모의 Setter 메소드를 호출해서 초기화
//		super.setBrand(brand);
//		this.setpCode(pCode);
//		setName(name); // 자기 자신의 메소드를 호출하기 때문에 this 생략 가능
//		setPrice(price);
		
		// 3. 부모 생성자 호출해서 초기화
		super(brand, pCode, name, price);
		
		this.allInOne = allInOne;
	}

	public boolean isAllInOne() {
//		super(); 생략되어 있어도 있는 것 처럼 사용 가능
		return allInOne;
	}

	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}
	
	@Override
	public  String information() {
		return super.information() + ", allInOne : " + allInOne;
	}
}
