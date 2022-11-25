package com.kh.day02.operator;

public class sadas {
	public static void main (String [] args) {
		
		
		System.out.println("1번 문제\na++;\nb = (--a) + b;\nc = (a++) + (--b);");
		int a = 10, b = 20, c = 30;
		
		a++;
		b = (--a) + b;
		c = (a++) + (--b); 
		
		System.out.println("a의 값 : " + a);
		System.out.println("b의 값 : " + b);
		System.out.println("c의 값 : " + c);
		
		
		System.out.println("\n2번 문제\nx--;\nz = x-- + --y;\nx = 99 + x++ + x;\ny = y-- + y + ++y;");
		int x = 100, y = 33, z = 0;
		
		x--;
		z = x-- + --y;
		x = 99 + x++ + x;
		y = y-- + y + ++y;
		
		System.out.println("x의 값 : " + x);
		System.out.println("y의 값 : " + y);
		System.out.println("z의 값 : " + z);
		
	}
}
