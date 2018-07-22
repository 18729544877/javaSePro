package com.se.Interface;

import java.util.Scanner;

public class SanJiaoXing {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入正三角的高：");
		int height =sc.nextInt();
		System.out.println("请输入倒三角的高：");
		int h=sc.nextInt();
		
		int n=6;//代表右移
		
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
