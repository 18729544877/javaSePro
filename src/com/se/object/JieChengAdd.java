package com.se.object;

import java.util.Scanner;

public class JieChengAdd {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("����n:1--20");
		String str = scan.nextLine();
		// ����׳�֮��
		double zhi = addJieCheng(Integer.parseInt(str));
		System.out.println("���ǣ�"+zhi);
	}

	private static double addJieCheng(double a) {
		int s= 1;
		double c = 0;
		double sum = 0;
		while (s <= a) {
			c = jieCheng(s);
			System.out.println(s+"�Ľ׳���"+c);
			sum = sum + c;
			s++;
		}
		return sum;
	}

	private static double jieCheng(int s) {
		double re = 1;
		double su = 1;
		for(double i = 1; i <= s; i++){
			re = 1/i;
            su*=re;
		}
		return su;
	}
}
