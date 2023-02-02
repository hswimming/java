package com.kh.chapter2_class;


// 접근 제한자 생략 시 default 접근 제한이 적용된다. -> 동일한 패키지가 아닌(외부)에서 접근할 수 없음
class Phone { // 필드 생성
	
	private String name;
	
	private String color;
	
	private String brand;

	public Phone() {
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
}
