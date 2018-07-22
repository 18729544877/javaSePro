package com.se.exam;

public class Test4Demo {
	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3, 44 }, { 4, 5, 6, 4 }, { 7, 8, 9, 55 } };
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
