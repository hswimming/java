package com.kh.operator;

import com.kh.operator.practice.A_Logicalnegation;
import com.kh.operator.practice.B_InDecrease;
import com.kh.operator.practice.C_Arithmetic;
import com.kh.operator.practice.D_Comparison;
import com.kh.operator.practice.E_Logical;

public class Application {

	public static void main(String[] args) {
		
//		new A_Logicalnegation().method1();
		// 기존에는 주소값에 변수를 담고 호출하여 사용했지만 위 경우는 heap 메모리에서 바로 사용
		// 한번만 호출하는 경우 위처럼 변수에 담지 않고 사용
		
//		new B_InDecrease().method1();
//		new B_InDecrease().method2();
		
//		new C_Arithmetic().method1();
		
//		new D_Comparison().method1();
//		new D_Comparison().method2();
		
		new E_Logical().method1();
		
	}
}
