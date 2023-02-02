package com.kh.inherit.after;

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
}
