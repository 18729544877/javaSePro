package com.se.object.exception;

public class ExceptionDemo {
public static void main(String[] args) {
	/*
	 * ����ʱ�쳣������
	 */
	int a=3;
	int b=0;
	int c=0;
	int[] d = {1,2,3};

//	try {
//		c=a/b;
//		d[3]=8;
//	}catch(ArithmeticException | ArrayIndexOutOfBoundsException e){
//		System.out.println("Ϊ0�쳣���±�Խ���쳣");
//	}//����ʱ�쳣��ƽ����ϵ���쳣�Ĵ���ʽ
//	
//	System.out.println(c);
//	System.out.println("over");
/*
 * ���н���ǣ�Ϊ0�쳣���±�Խ���쳣
 *         o
 *         over
 */
/*
 * �쳣�ķ����Ǳ���ʱ�쳣������ʱ�쳣������ʱ�쳣���봦������ܱ���ͨ����
 * ����ʱ�쳣����Բ�����error�������쳣�����������˵��쳣�����Բ���Ҫ����ֻ�йرճ���
 * �쳣��ƽ����ϵ���Խ��쳣д��һ�飬�м��������
 */
	try {
		c=a/b;
		d[3]=8;
	}catch(ArithmeticException e){
		System.out.println("Ϊ0�쳣");//c�����쳣��������ģ���d[3]=8��Ҳ�Ͳ�ִ��������ֻ������Ϊ0�쳣
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("�±�Խ���쳣��");
	}
	
	System.out.println(c);
	System.out.println("over");
	
/*
 Ϊ0�쳣
0
over
*/
}
}
