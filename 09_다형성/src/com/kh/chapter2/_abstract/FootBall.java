package com.kh.chapter2._abstract;

public class FootBall extends Sports {
	
//	private int numberOfPlayers; 참여하는 사람의 수

	public FootBall(int numberOfPlayers) { // 필드
		super(numberOfPlayers);
	}
	
	@Override
	public void rule() { // 출력 메소드, 재정의 하지 않으면 에러발생 (빈칸이더라도 생성해야 함)
		System.out.println("footBall의 선수는 " + this.numberOfPlayers + "명, 손이 아닌 발로 공을 차야한다.");
	}
}
