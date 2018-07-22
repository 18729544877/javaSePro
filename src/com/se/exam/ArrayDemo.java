package com.se.exam;

public class ArrayDemo {
	public static void main(String[] args) {
		int[] a = { 3, 43, 22, 4, 22, 31, 23 };
		System.out.println("±È¿˙ ˝◊È£∫");
		showArray(a);
		System.out.println("√∞≈›≈≈–Ú£∫");
		maoPao(a);
		showArray(a);
		System.out.println("—°‘Ò≈≈–Ú£∫");
		xuanze(a);
		showArray(a);
	}

	private static void xuanze(int[] a) {
		int[] b = a;
		for (int i = 0; i < b.length; i++) {
			int index = i;
			for (int j = i; j < b.length; j++) {
				if (a[index] > b[j]) {
					index = j;
				}
			}
			int temp = b[index];
			b[index] = b[i];
			b[i] = temp;
		}

	}

	private static void maoPao(int[] a) {
		int[] c = a;
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length - i - 1; j++) {
				if (c[j] > c[j + 1]) {
					int temp = c[j];
					c[j] = c[j + 1];
					c[j + 1] = temp;
				}
			}
		}
	}

	private static void showArray(int[] a) {
		for (int aa : a) {
			System.out.print(aa + " ");
		}
		System.out.println();
	}
}
