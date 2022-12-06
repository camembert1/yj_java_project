package com.kh.day08.oop;

import java.util.Arrays;
import java.util.Scanner;

class Book {
	String title, author;
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
}

public class BookArray {

	public static void main(String[] args) {
		Book[] book = new Book[2]; //배열 선언 
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < book.length; i++) {
			System.out.print("제목 >> ");
			String title = sc.nextLine();
			System.out.print("저자 >> ");
			String author = sc.nextLine();
			book[i] = new Book(title, author);
		}
		
		for (int i = 0; i < book.length; i++) {
			System.out.printf("(%s, %s)%n",book[i].title, book[i].author);
		}
		
	}

}
