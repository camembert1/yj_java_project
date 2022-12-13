package com.kh.day13.socket.baseball;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;


public class BaseballServer {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		int port = 8589;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		int[] numbers = new int[3];
		SimpleDateFormat trans = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SS");//서버출력시간

		try {
			System.out.println("서버소켓을 생성하였습니다.");
			serverSocket = new ServerSocket(port);
			Thread.sleep(1000);
			Date date = new Date();
			System.out.println(trans.format(date)); // 서버 생성 시간
			System.out.println("클라이언트의 접속을 기다립니다.");
			Socket socket = serverSocket.accept();
			System.out.println("클라이언트가 접속했습니다.");
			is = socket.getInputStream();
			os = socket.getOutputStream();
			dis = new DataInputStream(is);
			dos = new DataOutputStream(os);
			System.out.println("서버 준비 완료");

			// 번호 3개를 뽑은 후에 게임 준비해야 함,랜덤,중복제거
			for (int i = 0; i < numbers.length; i++) {
				int num = (int) (Math.random() * 9) + 1;
				Arrays.sort(numbers);
				if (Arrays.binarySearch(numbers, num) < 0) {
					numbers[0] = num;
					// 이렇게만 두면 무조건 [1] < [2]인 결과만 나옴
					// 따라서 셔플 필요
				} else {
					i--;
				}
			}
			shuffle(numbers);
			System.out.printf("서버 숫자 -> %d %d %d%n", numbers[0], numbers[1], numbers[2]);
			System.out.println();

			END: while (true) {
				// 값 받기
				String readNumStr = dis.readUTF();
				System.out.printf("클라이언트 입력 : %s / ", readNumStr);

				// 조건
				int strike = 0;
				int ball = 0;
				int[] readNum = new int[3]; // 받은 숫자 배열
				
				for (int i = 0; i < readNum.length; i++) {
					readNum[i] = readNumStr.charAt(i) - '0'; //split메소드 사용 가능
					
					for (int j = 0; j < numbers.length; j++) {
						if(readNum[i] == numbers[j]) {
							if(i == j) strike++;
							else ball++;
						}
					}
				}

				// 이거 클라이언트로 보내줘야됨 집ㄹ가서할래~~
				if (strike == 3) {
					System.out.printf("%dS%n%n", strike);
					dos.writeUTF("   " + strike + "S");
					dos.writeUTF("종료");
					System.out.println("정답! 종료되었습니다.");
					break END;
				} else if (strike == 0 && ball == 0) {
					System.out.println("OUT\n");
					dos.writeUTF("   OUT\n");
					dos.writeUTF("계속");
				} else {
					System.out.printf("%dS %dB%n%n", strike, ball);
					dos.writeUTF("   " + strike + "S " + ball + "B\n");
					dos.writeUTF("계속");
				}

			} //while문 끝

		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			try {
				dos.close();
				dis.close();
				is.close();
				os.close();
				serverSocket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	public static void shuffle(int[] numbers) {

		for (int i = 0; i < 5; i++) {
			int n = (int) (Math.random() * 3);
			int tmp = numbers[0];
			numbers[0] = numbers[n];
			numbers[n] = tmp;
		}
	}
}
