package com.kh.object.practice;

public class Book {
	
	private String tittle; // 도서명
	
	private int price; // 가격
	
	private double discountRate; // 할인율
	
	private String author; // 저자명
	
	public Book() {
	}

	public Book(String tittle, int price, double discountRate, String author) {
		this.tittle = tittle;
		this.price = price;
		this.discountRate = discountRate;
		this.author = author;
	}

	public String getTittle() {
		return tittle;
	}

	public void setTittle(String tittle) {
		this.tittle = tittle;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String information() {
		return tittle + ", " + price + ", " + discountRate + ", " + author;
	}
}
