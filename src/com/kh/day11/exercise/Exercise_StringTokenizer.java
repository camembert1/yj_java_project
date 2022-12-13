package com.kh.day11.exercise;

import java.util.StringTokenizer;

public class Exercise_StringTokenizer {

	public static void main(String[] args) {
		exercise1();

	}
	
	static void exercise1() {
		// È«±æµ¿/ÀåÈ­/È«·Ã/ÄáÁã/ÆÏÁã ÀÇ ¹®ÀÚ¿­ µ¥ÀÌÅÍ¸¦~/±âÁØÀ¸·Î Àß¶ó¼­ È«·Ã¸¸ Ãâ·ÂÇÏ½Ã¿À
		
		String words = "È«±æµ¿/ÀåÈ­/È«·Ã/ÄáÁã/ÆÏÁã";
		
		// ÀüÃ¼ Ãâ·Â
		StringTokenizer st = new StringTokenizer(words, "/");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		System.out.println();
		
		// È«·Ã¸¸ Ãâ·Â
		String[] word = words.split("/");
		for (int i = 0; i < word.length; i++) {
			if(word[i].equals("È«·Ã")) {
				System.out.println(word[i]);
			}
		}
//		System.out.println(word[2]);
	}
	
	

}
