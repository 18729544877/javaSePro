package com.se.object.random;

import java.util.Scanner;

public class Test {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("请输入乘法表的最高数：");
	int num=sc.nextInt();
	for(int i = 1; i <  num+1; i++) {
		for(int j = 1; j < i+1; j++) {
			System.out.print(j+"*"+i+"\t");
		}
		for(int j= 0; j < ( num-i)*2;  j++) {
			System.out.print("\t");
		}
	
		for(int j = 1; j < i+1; j++) {
			System.out.print(i+"*"+j+"\t");
		}
		System.out.println();
	}
	
	for(int i = num; i > 0; i--) {
		for(int j = 1; j < i+1; j++) {
			System.out.print(j+"*"+i+"\t");
		}
		for(int j= 0; j < ( num-i)*2;  j++) {
			System.out.print("\t");
		}
	
		for(int j = 1; j < i+1; j++) {
			System.out.print(i+"*"+j+"\t");
		}
		System.out.println();
	}
}
}
