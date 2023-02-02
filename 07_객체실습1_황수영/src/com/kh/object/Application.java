package com.kh.object;

import com.kh.object.practice.Product;

public class Application {

	public static void main(String[] args) {
		
		Product samsung = new Product();
		Product lg = new Product();
		Product kt = new Product();
		
		samsung.information();
		lg.information();
		kt.information();
		
		System.out.println();
		
		samsung.setId("ssgnote9");
		samsung.setName("갤럭시노트9");
		samsung.setSite("경기도 수원");
		samsung.setPrice(1200000);
		samsung.setTax(10.0);
		
		lg.setId("lgxnote5");
		lg.setName("LG스마트폰5");
		lg.setSite("경기도 평택");
		lg.setPrice(1200000);
		lg.setTax(0.7);
		
		kt.setId("ktsnote3");
		kt.setName("KT스마트폰3");
		kt.setSite("서울시 강남");
		kt.setPrice(1200000);
		kt.setTax(0.3);

		samsung.information();
		lg.information();
		kt.information();
		System.out.println("========================================");
		
		samsung.setTax(0.05);
		lg.setTax(0.05);
		kt.setTax(0.05);
		
		samsung.information();
		lg.information();
		kt.information();
		System.out.println("========================================");
		
		System.out.printf("상품명 = %s\n", samsung.getName());
		System.out.printf("부가세 포함 가격 = %.0f 원\n", samsung.sum());
		System.out.printf("상품명 = %s\n", lg.getName());
		System.out.printf("부가세 포함 가격 = %.0f 원\n", lg.sum());
		System.out.printf("상품명 = %s\n", kt.getName());
		System.out.printf("부가세 포함 가격 = %.0f 원\n", kt.sum());
	}
}
