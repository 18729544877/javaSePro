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
		return a;//��ʱ��20��ֵ��a,ֻ��Ҫ�ȵ�ִ����finally֮��ŷ���
	}finally {
		a=30;
		System.out.println("����ִ��");//�ͷ���Դ�����ã�
	}
	return a;
}
}
