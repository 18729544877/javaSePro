package com.se.exam;

import java.util.Scanner;

/*12.	猜数字游戏，1-100之间，提示大小。猜对了要恭喜用户。*/
public class GuessNumber {
	public static void main(String[] args) {
		System.out.println("猜数字游戏：");
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入");
		int num = sc.nextInt();
		int n = (int) (Math.random() * 100) + 1;

		while (true) {
			if (num > n) {
				System.out.println("猜大了");
				num = sc.nextInt();
			} else if (num < n) {
				System.out.println("猜小了");
				num = sc.nextInt();
			} else {
				System.out.println("恭喜答对了");
				break;
			}
		}
	}
}
