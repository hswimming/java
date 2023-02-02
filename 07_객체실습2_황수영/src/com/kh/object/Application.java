package com.kh.object;

import com.kh.object.practice.Book;

public class Application {

	public static void main(String[] args) {
		
		Book book1 = new Book();
		Book book2 = new Book("자바의 정석", 20000, 0.2, "윤상섭");
		
		System.out.println(book1.information());
		System.out.println(book2.information());
		System.out.println("==============================");
		
		book1.setTittle("C언어");
		book1.setPrice(30000);
		book1.setDiscountRate(0.1);
		book1.setAuthor("홍길동");
		
		System.out.println("수정된 결과 확인");
		System.out.println(book1.information());
		System.out.println("==============================");

		System.out.printf("도서명 = %s\n", book1.getTittle());
		System.out.printf("할인된 가격 = " + (int) (book1.getPrice() - (book1.getPrice() * book1.getDiscountRate())) + "원\n");
		System.out.printf("도서명 = %s\n", book2.getTittle());
		System.out.printf("할인된 가격 = " + (int) (book2.getPrice() - (book2.getPrice() * book2.getDiscountRate())) + "원\n");
	}
}
