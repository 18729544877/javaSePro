package com.se.object.exception;

public class ExceptionDemo2 {
public static void main(String[] args) {
	System.out.println(method());
}

private static int method() {
	int a =10;
	
	try {
		int b=1;
		b=b/0;
	}catch(Exception e){
		a=20;
		return a;//此时将20赋值给a,只是要等到执行完finally之后才返回
	}finally {
		a=30;
		System.out.println("必须执行");//释放资源的作用，
	}
	return a;
}
}
