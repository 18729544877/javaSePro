package com.se.Interface;

import java.util.Scanner;

public class SanJiaoXing {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("�����������ǵĸߣ�");
		int height =sc.nextInt();
		System.out.println("�����뵹���ǵĸߣ�");
		int h=sc.nextInt();
		
		int n=6;//��������
		
		for(int i = 0; i < height; i++){
			for(int j = 0; j < height-i-1+n; j++){
				System.out.print("  ");
			}
			for(int j = 0; j < 2 * i + 1; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("----------------------------");
		for(int i = h-1; i >= 0; i--){
			for(int j = 0; j < h-i-1+n; j++){
				System.out.print("  ");
			}
			for(int j = 0; j < 2 * i + 1; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	sc.close();
	}
}
