package com.kh.chapter2._abstract;

public abstract class Sports {

	protected int numberOfPlayers;
	
	public Sports(int numberOfPlayers) {
		this.numberOfPlayers = numberOfPlayers;
	}

	/*
	 * 추상 메소드
	 * 	- 중괄호({})가 구현되지 않은 미완성의 메소드이다.
	 * 	- 자식 클래스에서 무조건 재정의 하지 않으면 에러가 발생한다.
	 */
	
	public abstract void rule(); // 메소드 구현부가 아닌 선언부를 넣어야 한다. (자식 클래스가 구현하기 때문)

}
