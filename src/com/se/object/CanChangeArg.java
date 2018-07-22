package com.se.object;

public class CanChangeArg {
public static void main(String[] args) {
	add();//变量参数可以为空
	add(1);
	add(1,2);
	add(1,2,3);
	add(1,2,3,4);
	
}
public static void  add(int... a) {
	for(int o:a) {
		System.out.print(o+"<>");
	}
	System.out.println();
}
}
