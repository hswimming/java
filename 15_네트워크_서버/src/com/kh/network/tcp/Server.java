package com.kh.network.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import com.kh.network.receiver.Receiver;

/*
 * 서버용 TCP 소켓 프로그래밍 순서
 * 	1. 서버의 포트 번호 정한다.
 * 	2. 서버용 소켓 객체를 생성한다.
 * 	3. 클라이언트에서 접속 요청이 올 때까지 기다린다.
 * 	4. 클라이언트로부터 접속 요청이 오면 요청 수락 후 해당 클라이언트와 연결된 소켓 객체 생성한다.
 * 	5. 연결된 클라이언트와 입출력 스트림 생성한다.
 *  6. 보조 스트림을 통해 스트림의 성능을 개선한다.
 * 	7. 스트림을 통해 데이터를 읽고 쓴다.
 * 	8. 통신을 종료한다.
 */
public class Server {
	
	public void serverStart() {
		
//		1. 서버의 포트 번호 정한다.
//			- 0 ~ 1023 시스템 포트 번호
//			- 1024 ~ 65535의 포트 번호를 사용하는 것을 추천한다.
			int port = 30021;
			
//		2. 서버용 소켓 객체를 생성한다.
			ServerSocket server = null;
			Socket client = null;
//			InputStream is = null;
//			OutputStream os = null;
//			BufferedReader br = null;
//			PrintWriter pw = null;
			
			try {
				server = new ServerSocket(port);
				System.out.println("서버 시작 ...");
				
				while (true) {
					
	//				3. 클라이언트에서 접속 요청이 올 때까지 기다린다.
	//				4. 클라이언트로부터 접속 요청이 오면 요청 수락 후 해당 클라이언트와 연결된 소켓 객체 생성한다.
					System.out.println("클라이언트 대기중 ...");
					client = server.accept();
					System.out.println("클라이언트 연결됨 ...");
					
					Thread thread = new Thread(new Receiver(client));
					
					thread.start();
				
//	//				5. 연결된 클라이언트와 입출력 스트림 생성한다.
//					is = client.getInputStream(); // 클라이언트로부터 값을 입력받을 스트림
//					os = client.getOutputStream(); // 클라이언트로 값을 출력하는 스트림
//					
//	//				6. 보조 스트림을 통해 스트림의 성능을 개선한다.
//					br = new BufferedReader(new InputStreamReader(is)); // 보조 스트림 연결 안함 (생성자 내부에 담고 있음)
//					pw = new PrintWriter(os, true); // PrintWriter => boolean autoFlush 포함되어 있음
//					
//	//				7. 스트림을 통해 데이터를 읽고 쓴다.
//					while (true) {
//					String message = br.readLine(); // 클라이언트로부터 입력이 있을 때까지 블로킹된다.
//					
//					if (message == null || message.equals("exit")) {
//						System.out.println("클라이언트 접속 종료");
//						
//						break;
//					}
//					
//					System.out.println(client.getInetAddress().getHostAddress() + "가 보낸 메시지 : " + message);
//					
//					pw.println("메세지 받기 성공~!");
////					pw.flush();
//					}
				}		
				
			} catch (IOException e) {
				e.printStackTrace();
				
			} finally {
				try {
//				8. 통신을 종료한다.
//					pw.close();
//					br.close();
//					client.close();
					server.close();
				} catch (IOException e) {
					e.printStackTrace();
				}	
			}
	}
	
}
