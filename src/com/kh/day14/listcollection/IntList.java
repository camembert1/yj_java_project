package com.kh.day14.listcollection;

import java.util.Arrays;

public class IntList {
	
	
	//�Ʒ�add�޼��带 ���� �Ѱ� ���� ���� ����� ���;� ��
	private int[] nums;
	private int size; //����� ����
	
	public IntList() {
		nums = new int[3]; //�����ڿ��� �ʱ�ȭ
		size = 0;
	}
	
	private void resize() {
		int array_capacity = nums.length;
		// �뷮�� �� �� ���
		// �뷮�� 2��� ����
		if (size == array_capacity) {
			int new_capacity = array_capacity*2;
			//���Ӱ� �迭�� �������
			nums = Arrays.copyOf(nums, new_capacity);
		}
	}
	
	public void add(int input) {
		// �����ִ� ���¶�� ũ�� ���Ҵ� �迭 ����
		if (size == nums.length) {
			resize();
		}
		// ������ ��ġ�� ��� �߰�
		nums[size] = input;
		size++;
	}
	
	public int get(int index) {
		return nums[index];
	}
	
	public int size() {
		return size;
	}
	
	public void clear() {
		nums = new int[3];
		size = 0;
	}
	
}
