package com.se.exam;

public class StringBufferDemo {
	public static void main(String[] args) {
		String s = "helloworld";
		StringBuffer bf = new StringBuffer(s);// 字符串转为stringBuffer
		System.out.println("stringBuffer转为String:" + bf.toString());
		int[] a = { 22, 33, 22, 1231, 432 };
		StringBuffer ff = new StringBuffer();

		for (int i = 0; i < a.length; i++) {
			ff = ff.append(String.valueOf(a[i]));
		}
		System.out.println("数组转化为字符串：" + ff.toString());
		System.out.println("字符串反转之后：" + ff.reverse().toString());
	}
}
