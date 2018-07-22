package com.se.exam;

public class Test3Demo {
	public static void main(String[] args) {
		int[] a = new int[5];
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;
		bianLi(a);
	}

	private static void bianLi(int[] a) {
		for (int s : a) {
			System.out.println(s);
		}
	}
}
