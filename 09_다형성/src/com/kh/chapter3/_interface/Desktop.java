package com.kh.chapter3._interface;


public class Desktop extends Product {
	
	private boolean allInOne;
	
	public Desktop() {
	}

	public Desktop(String brand, String pCode, String name, int price, boolean allInOne) {
		super(brand, pCode, name, price);
		
		this.allInOne = allInOne;
	}

	public boolean isAllInOne() {
		return allInOne;
	}

	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}
	
	@Override
	public  String information() {
		return super.information() + ", allInOne : " + allInOne;
	}
	
	public void turnOn() {
		System.out.println("데스크톱을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("데스크톱을 끕니다.");
	}
}
