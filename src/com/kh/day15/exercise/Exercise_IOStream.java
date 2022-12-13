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
	
	//��ü���������� ������~
	
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
				System.out.println("1 ~ 4������ ���ڸ� �Է��ϼ���.");
				break;
			}
		}
	}
	
	static int printMenu() {
		System.out.println("1. �����Է�");
		System.out.println("2. �������");
		System.out.println("3. ��������(save �� �Է� ���� �̸��� ���ϸ�)");
		System.out.println("4. �����ҷ�����(load �� 2������ ���)");
		System.out.println("0. �����ϱ�");
		System.out.print("�޴� �Է� : ");
		int select = sc.nextInt();
		System.out.println();
		return select;
	}
	
	static void insert() {
		
		System.out.print("�̸� �Է� : ");
		name = sc.next();
		
		System.out.print("���� �Է� : ");
		age = sc.nextInt();
		
		// nextLine �� �� �����ؾ� �� ����?
		// ���� �Ծ��ֱ�
		System.out.print("�ּ� �Է� : ");
		sc.nextLine();
		address = sc.nextLine();
		System.out.println();
		
	}
	
	static void print() {
		
		System.out.println("====== ���� ��� ======");
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
		System.out.println("�ּ� : " + address);
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
			System.out.println("���� �Ϸ�Ǿ����ϴ�.");
			System.out.println("=======================");
			System.out.println();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	static void load() {
		
		Reader reader = null;
		BufferedReader bfReader = null;
		System.out.print("���ϸ� : ");
		String filename = sc.next();
		String result = "";
		try {
			
			reader = new FileReader("src/iostream/" + filename + ".txt");
			bfReader = new BufferedReader(reader);
//			reader.read();
			result = bfReader.readLine(); //���� �ϱ� ������ ������ �� �پ� �о��
			// �����ø� �������� �ڸ��� ��� 2����
			// 1. split()
			// 2. StringTokenizer <<��� ����~
			StringTokenizer st = new StringTokenizer(result, "/");
			name = st.nextToken();
			age = Integer.parseInt(st.nextToken());
			address = st.nextToken();
			System.out.println("�ε尡 �Ϸ�Ǿ����ϴ�");
			System.out.println("���� ��� �����մϴ�. 2���� �����ּ���.");
			System.out.println("=======================");

			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
