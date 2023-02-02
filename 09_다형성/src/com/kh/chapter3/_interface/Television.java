package com.kh.chapter3._interface;

public class Television extends Product {
	
	private int inch;
	
	public Television() {
	}

	public Television(String brand, String pCode, String name, int price, int inch) {
//		super();
		this.brand = brand;
		this.pCode = pCode;
		this.name = name;
		this.price = price;
		this.inch = inch;
	}

	public int getInch() {
		return inch;
	}

	public void setInch(int inch) {
		this.inch = inch;
	}
	
	@Override
	public String information() {
		return "brand : " + brand + ", pCode : " + pCode + ", price : " + price
				+ ", name : " + name + ", inch : " + inch;
	}

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}
}
