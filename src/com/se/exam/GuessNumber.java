package com.se.exam;

import java.util.Scanner;

/*12.	��������Ϸ��1-100֮�䣬��ʾ��С���¶���Ҫ��ϲ�û���*/
public class GuessNumber {
	public static void main(String[] args) {
		System.out.println("��������Ϸ��");
		Scanner sc = new Scanner(System.in);
		System.out.println("������");
		int num = sc.nextInt();
		int n = (int) (Math.random() * 100) + 1;

		while (true) {
			if (num > n) {
				System.out.println("�´���");
				num = sc.nextInt();
			} else if (num < n) {
				System.out.println("��С��");
				num = sc.nextInt();
			} else {
				System.out.println("��ϲ�����");
				break;
			}
		}
	}
}
