package com.kh.day15.exercise;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Exercise_IOStream {
	
	private static String name;
	private static int age;
	private static String address;
	
	//객체지향적으로 만들어보기~
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		end:
		while(true) {
			int choice = printMenu();
			switch (choice) {
			case 1:
				insert();
				break;
			case 2:
				print();
				break;
			case 3:
				save();
				break;
			case 4:
				load();
				break;
			case 0:
				break end;

			default:
				System.out.println("1 ~ 4사이의 숫자를 입력하세요.");
				break;
			}
		}
	}
	
	static int printMenu() {
		System.out.println("1. 정보입력");
		System.out.println("2. 정보출력");
		System.out.println("3. 정보저장(save 후 입력 받은 이름이 파일명)");
		System.out.println("4. 정보불러오기(load 후 2번으로 출력)");
		System.out.println("0. 종료하기");
		System.out.print("메뉴 입력 : ");
		int select = sc.nextInt();
		System.out.println();
		return select;
	}
	
	static void insert() {
		
		System.out.print("이름 입력 : ");
		name = sc.next();
		
		System.out.print("나이 입력 : ");
		age = sc.nextInt();
		
		// nextLine 쓸 때 주의해야 할 점은?
		// 엔터 먹어주기
		System.out.print("주소 입력 : ");
		sc.nextLine();
		address = sc.nextLine();
		System.out.println();
		
	}
	
	static void print() {
		
		System.out.println("====== 정보 출력 ======");
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("주소 : " + address);
		System.out.println("=======================");
		System.out.println();
	
	}

	static void save() {
		
		Writer os = null;
		try {
			String result = name + "/" + age + "/" + address;
			os = new FileWriter("src/iostream/" + name + ".txt");
			os.write(result);
			os.flush();
			System.out.println("저장 완료되었습니다.");
			System.out.println("=======================");
			System.out.println();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	static void load() {
		
		Reader reader = null;
		BufferedReader bfReader = null;
		System.out.print("파일명 : ");
		String filename = sc.next();
		String result = "";
		try {
			
			reader = new FileReader("src/iostream/" + filename + ".txt");
			bfReader = new BufferedReader(reader);
//			reader.read();
			result = bfReader.readLine(); //개행 하기 전까지 파일을 한 줄씩 읽어옴
			// 슬래시를 기준으로 자르는 방법 2가지
			// 1. split()
			// 2. StringTokenizer <<얘로 하자~
			StringTokenizer st = new StringTokenizer(result, "/");
			name = st.nextToken();
			age = Integer.parseInt(st.nextToken());
			address = st.nextToken();
			System.out.println("로드가 완료되었습니다");
			System.out.println("정보 출력 가능합니다. 2번을 눌러주세요.");
			System.out.println("=======================");

			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
