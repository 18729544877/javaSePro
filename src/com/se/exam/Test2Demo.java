package com.se.exam;

import java.util.Scanner;

/*2.	���n*n�ĳ˷����Է�����ʽʵ��*/
public class Test2Demo {
	public static void main(String[] args) {
		System.out.println("������������1--9");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		jiuJiu(n);
	}

	private static void jiuJiu(int n) {
		for (int i = 1; i < n + 1; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + "*" + i + "=" + (j * i) + "\t");
			}
			System.out.println();
		}
	}
}
