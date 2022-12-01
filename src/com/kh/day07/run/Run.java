package com.kh.day07.run;

import java.util.Scanner;

import com.kh.day07.exercise.Exercise_Lotto;
import com.kh.day07.oop.Person;
import com.kh.day07.oop.Rectangle;

public class Run {

	public static void main(String[] args) {
		
		Exercise_Lotto exLotto = new Exercise_Lotto();
//		exLotto.Exercise_Lotto3();
		
		Person person = new Person(); // �޸𸮿� �ø��� ����
									  // ��ü ������ �� ����ߴ��� �����ڿ���!
									  // �޼ҵ��̸鼭 newŰ����� �Բ� ���� ~ ��ü ����~
		
		person.eat();
		person.sleep();
		person.speak();
		person.walking();
		
//		person.name = "�Ͽ���";
//		person.jobName = "�ǻ�";
		
		
		// ���۷��� ���� ����
		// ���� ���� ����
		// �ּҰ� ����Ǵ� ����
		Rectangle rect = new Rectangle();  // ��ü����, �ݵ�� new Ű���� �̿�!
										   // new�� ��ü ������ Rectangle()ȣ���� �ų� ��������!! ��ü������ ��� ��.��
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ʺ� �Է��� �ּ��� >> ");
		//��ü�� ��� ����(����� �����δ� ��������� ����޼ҵ尡 ����)
		//�ν��Ͻ���� �ϱ⵵ ��(Rectangle Ŭ������ ��ü��� ����!)
		rect.width = sc.nextInt(); // ��ü�� ��� ������ .���� �Ѵ�. ������� ����
		System.out.print("���̸� �Է��� �ּ��� >> "); 
		rect.height = sc.nextInt(); // �����������
		
		System.out.printf("�簢���� ���� : %d", rect.getArea()); // ����޼ҵ� ����
		
		
	}

}
