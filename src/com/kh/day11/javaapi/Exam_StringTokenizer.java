package com.kh.day11.javaapi;

import java.util.StringTokenizer;

public class Exam_StringTokenizer {
	public static void main(String[] args) {
		
		String query = "name=kite&addr=seoul&age=21";
		
//		String[] wordStrings = query.split("&");
		
//		StringTokenizer st = new StringTokenizer(query, "&");
		StringTokenizer st = new StringTokenizer(query, "&="); //������ �� ���ڵ� �� �� �Է��ϸ� �ȴ�~!~
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		
	}
}
