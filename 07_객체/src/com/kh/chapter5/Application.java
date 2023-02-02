package com.kh.chapter5;

import com.kh.chapter4.constructor.User;
import com.kh.chapter5.method.A_Method;
import com.kh.chapter5.method.C_StaticMethod;

public class Application {

	public static void main(String[] args) {
		
//		A_Method methodTest = new A_Method();
//		
//		// 1. 매개변수와 반환값이 없는 메소드 호출
//		methodTest.method1();
//		
//		System.out.println();
//		
//		// 2. 매개변수가 없고 반환값이 있는 메소드 호출
//		String str = methodTest.method2();
//		System.out.println(str);
//		
//		System.out.println();
//		
//		// 3. 매개변수가 있고 반환값이 없는 메소드 호출
//		methodTest.method3(10, 20);
//		
//		System.out.println();
//		
//		// 4. 매개변수가 있고 반환값이 있는 메소드 호출
////		methodTest.method4(30, 40); // 호출 후 계산만 해서 반환하는 상태
//		
//		System.out.println(methodTest.method4(30, 40));
//		// 리턴되는 값을 println 메소드에 전달
//		
//		System.out.println();
//		
//		// 5. 매개변수로 User 객체를 전달받는 메소드 호출
//		User user1 = new User("ismoon", "1234", "문인수", 25, '남');
//		
////		user.information();
//		System.out.println(user1.information());
//		methodTest.method5(user1);
//		System.out.println(user1.information());
//		// 주소값이 변경되는거기 때문에 참조변수와 매개변수의 이름이 동일하지 않아도 됨
//		
//		System.out.println();
//		
//		// 6. 매개변수로 가변인자를 전달받는 메소드 호출
//		int[] arr = {1, 2}; // 방법 1
//		
//		methodTest.method6(arr);
////		methodTest.method6({2, 3, 4}); // 에러 발생
//		methodTest.method6(new int[] {2, 3, 4}); // 방법 2
////		methodTest.method6(); // 무조건 배열을 전달받기 때문에 에러 발생
//		
//		System.out.println();
//		
//		// 가변배열(가변인자)
////		methodTest.method7(1, 2, 3, 4, 5); // 호출하면 목록을 가지고 배열을 만들어줌
////		methodTest.method7(); // = new int[]{};
//		methodTest.method7("문인수");
//		methodTest.method7("문인수", 1, 2, 3);
		
		System.out.println("===================="); // C_StaticMethod 출력
		
		// 1. 매개변수와 반환값이 없는 메소드 호출
		C_StaticMethod.method1();
		System.out.println(C_StaticMethod.num1);
		System.out.println(C_StaticMethod.num2);
		
		System.out.println();
		
		// 2. 매개변수가 없고 반환값이 있는 메소드 호출
		
		System.out.println(C_StaticMethod.method2());
		
		// 3. 매개변수가 있고 반환값이 없는 메소드 호출
		C_StaticMethod.method3(30);
		
		System.out.println();
		
		// 4. 매개변수와 반환값이 있는 매소드 호출
		System.out.println(C_StaticMethod.method4());
		System.out.println(C_StaticMethod.method4(8, 9));
		System.out.println(C_StaticMethod.method4(8, 9, 10, 50, 30));
		
	}
}
