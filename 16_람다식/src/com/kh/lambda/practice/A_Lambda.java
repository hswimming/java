package com.kh.lambda.practice;

public class A_Lambda {
	
	public void method1() {
		Thread thread;
		
		thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("익명 구현 객체를 사용한 Thread 생성");
			}
		});
		
		thread.start(); // run에 있는 별도의 실행 흐름을 새로 만들어 준다.
		
		thread = new Thread(() -> {
			System.out.println("람다식을 사용한 Thread 생성 1");
		});
		
		thread.start();
		
		// 람다식에서 추상 메소드를 사용하여 익명 구현 객체를 넘기려면 타입이 맞아야 한다. (Runnable 추상 메소드의 타입과 맞아야 한다.)
		// 위의 경우 run()에 매개값이 없으므로 Thread()에 값을 넣거나 return 할 경우 에러가 발생한다.
		
		Runnable runnable = () -> System.out.println("람다식을 사용한 Thread 생성 2");
		
		thread = new Thread(runnable);
		
		thread.start();
	}
}