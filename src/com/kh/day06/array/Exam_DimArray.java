package com.kh.day06.array;

import java.util.Arrays;

public class Exam_DimArray {

	public static void main(String[] args) {
		
		int[][] arrs = new int[4][4];
		int k = 1;
		
		for (int i = 0; i < arrs.length; i++) {
			for (int j = 0; j < arrs[i].length; j++) {
				arrs[i][j] = k++;
			}
		}
		
		// Ãâ·Â
		for (int i = 0; i < arrs.length; i++) {
			System.out.print("[ ");
			for (int j = 0; j < arrs[i].length; j++) {
				System.out.printf("%-3d",arrs[i][j]);
			}
			System.out.printf("]%n");
		}
	}

}
