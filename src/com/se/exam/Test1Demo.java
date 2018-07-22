package com.se.exam;
/*1.	循环：输出空心三角形*/
public class Test1Demo {
	public static void main(String[] args) {
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6 - i - 1; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * i + 1; j++) {
				if (j == 0 || j == 2 * i || i == 5) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
