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
		SimpleDateFormat trans = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SS");//������½ð�

		try {
			System.out.println("���������� �����Ͽ����ϴ�.");
			serverSocket = new ServerSocket(port);
			Thread.sleep(1000);
			Date date = new Date();
			System.out.println(trans.format(date)); // ���� ���� �ð�
			System.out.println("Ŭ���̾�Ʈ�� ������ ��ٸ��ϴ�.");
			Socket socket = serverSocket.accept();
			System.out.println("Ŭ���̾�Ʈ�� �����߽��ϴ�.");
			is = socket.getInputStream();
			os = socket.getOutputStream();
			dis = new DataInputStream(is);
			dos = new DataOutputStream(os);
			System.out.println("���� �غ� �Ϸ�");

			// ��ȣ 3���� ���� �Ŀ� ���� �غ��ؾ� ��,����,�ߺ�����
			for (int i = 0; i < numbers.length; i++) {
				int num = (int) (Math.random() * 9) + 1;
				Arrays.sort(numbers);
				if (Arrays.binarySearch(numbers, num) < 0) {
					numbers[0] = num;
					// �̷��Ը� �θ� ������ [1] < [2]�� ����� ����
					// ���� ���� �ʿ�
				} else {
					i--;
				}
			}
			shuffle(numbers);
			System.out.printf("���� ���� -> %d %d %d%n", numbers[0], numbers[1], numbers[2]);
			System.out.println();

			END: while (true) {
				// �� �ޱ�
				String readNumStr = dis.readUTF();
				System.out.printf("Ŭ���̾�Ʈ �Է� : %s / ", readNumStr);

				// ����
				int strike = 0;
				int ball = 0;
				int[] readNum = new int[3]; // ���� ���� �迭
				
				for (int i = 0; i < readNum.length; i++) {
					readNum[i] = readNumStr.charAt(i) - '0'; //split�޼ҵ� ��� ����
					
					for (int j = 0; j < numbers.length; j++) {
						if(readNum[i] == numbers[j]) {
							if(i == j) strike++;
							else ball++;
						}
					}
				}

				// �̰� Ŭ���̾�Ʈ�� ������ߵ� ���������ҷ�~~
				if (strike == 3) {
					System.out.printf("%dS%n%n", strike);
					dos.writeUTF("   " + strike + "S");
					dos.writeUTF("����");
					System.out.println("����! ����Ǿ����ϴ�.");
					break END;
				} else if (strike == 0 && ball == 0) {
					System.out.println("OUT\n");
					dos.writeUTF("   OUT\n");
					dos.writeUTF("���");
				} else {
					System.out.printf("%dS %dB%n%n", strike, ball);
					dos.writeUTF("   " + strike + "S " + ball + "B\n");
					dos.writeUTF("���");
				}

			} //while�� ��

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
