package com.kh.day10.exercise;

public class GoodCalc extends Calculator{
	public static void main(String[] args) {
		GoodCalc calc = new GoodCalc();
		System.out.printf("Че : %d%n", calc.add(1, 2));
		System.out.printf("Тї : %d%n", calc.subtract(1, 2));
		System.out.printf("ЦђБе : %.2f%n", calc.average(new int [] {1, 2, 3, 4}));
		
	}

	@Override
	public int add(int a, int b) {
		return a+b;
	}

	@Override
	public int subtract(int a, int b) {
		return a-b;
	}

	@Override
	public double average(int[] a) {
		double sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum+=a[i];
		}
		return sum/a.length;
	}

}
