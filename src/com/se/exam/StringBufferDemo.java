package com.se.exam;

public class StringBufferDemo {
	public static void main(String[] args) {
		String s = "helloworld";
		StringBuffer bf = new StringBuffer(s);// �ַ���תΪstringBuffer
		System.out.println("stringBufferתΪString:" + bf.toString());
		int[] a = { 22, 33, 22, 1231, 432 };
		StringBuffer ff = new StringBuffer();

		for (int i = 0; i < a.length; i++) {
			ff = ff.append(String.valueOf(a[i]));
		}
		System.out.println("����ת��Ϊ�ַ�����" + ff.toString());
		System.out.println("�ַ�����ת֮��" + ff.reverse().toString());
	}
}
