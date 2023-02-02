package com.kh.chapter2._abstract;

public class BasketBall extends Sports {
	
//	private int numberOfPlayers; 공통적인 특성이기 때문에 Pull Up 으로 Sports 클래스에 넣어줌

	public BasketBall(int numberOfPlayers) { // 필드
		super(numberOfPlayers);
	}
	
	@Override
	public void rule() { // 출력 메소드, 재정의 하지 않으면 에러발생 (빈칸이더라도 생성해야 함)
		System.out.println("BasketBall의 선수는 " + this.numberOfPlayers + "명, 공을 던져서 링에 넣어야 한다.");
	}
}
