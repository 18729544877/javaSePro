package com.se.object.random;

import java.util.Arrays;
import java.util.Scanner;

public class StringBufferTest1 {
public static void main(String[] args) {
//	1��String��StringBuffer���໥ת��
//	2��������ƴ�ӳ�һ���ַ���
//	3�����ַ�����ת
//	4���ж�һ���ַ����Ƿ��ǶԳ��ַ���
//		����"abc"���ǶԳ��ַ�����"aba"��"abba"��"aaa"��"mnanm"�ǶԳ��ַ���
//	5��ͨ���鿴API�˽�һ��StringBuilder��
//	6��String,StringBuffer,StringBuilder������
//	7��StringBuffer�����������
//	8��������д�����
//		String��Ϊ��������
//		StringBuffer��Ϊ��������
//		ʹ�÷������õ���ʽ����String��StringBuffer��Ϊ��ʽ�������д���
//	9�����ַ����е��ַ���������
//		��������dacgebf��
//		�������abcdefg��
//
//	10��Integer i = 1; i += 1;������Щ����
//
//	11����Ŀ�����ӳ������⣺���ӵ�һ��ժ�����ɸ����ӣ���������һ�룬����񫣬�ֶ����һ��     
//		�ڶ��������ֽ�ʣ�µ����ӳԵ�һ�룬�ֶ����һ�����Ժ�ÿ�����϶�����ǰһ��ʣ��     
//		��һ����һ��������10���������ٳ�ʱ����ֻʣ��һ�������ˡ����һ�칲ժ�˶��١�   
System.out.println("***************1***************");
	StringBuffer sb = new StringBuffer("sdads");
	String c=sb.toString();
	System.out.println(c);
	String  ss="12133";
	StringBuffer sb1=new StringBuffer(ss);
	
	System.out.println(sb1);
	System.out.println("****************2**************");
	int[] a = {2,2,3,4,5,5};
	System.out.println(Arrays.toString(a));
	System.out.println("***************3***************");
	StringBuffer s = new StringBuffer("abc");
	System.out.println(s.reverse());
	System.out.println("*****************4****************");
	Scanner sc = new Scanner(System.in);
	System.out.println("�������ַ�����");
	String s3=sc.next();
	StringBuffer sb2=new StringBuffer(s3);
	
	StringBuffer sb3=new StringBuffer(s3).reverse();
	System.out.println(sb3);
	String sb33=sb3.toString();
	System.out.println(sb2);
	String sb22=sb2.toString();//�ַ�����equals���������жϣ�stringbuffer�Ĳ���
	if(sb22.equals(sb33)) {
		System.out.println("�Գ�");
	}else {
		System.out.println("���Գ�");
	}
	sc.close();
	System.out.println("***************9*************");
	String s1 = "asdsadfebcd";
	char[] ch = s1.toCharArray();//���ַ���ת��Ϊ�ַ����飬
	System.out.println(ch.length);//�ַ�����ĳ���
	for (int i = 0; i < ch.length; i++) {
		for (int j = 0; j < ch.length - i - 1; j++) {
			if (ch[j] > ch[j + 1]) {//ͨ���ַ���ascII��Ĵ�С��������
				char temp = ch[j];
				ch[j] = ch[j + 1];
				ch[j + 1] = temp;
			}
		}
	}
	//���潫�ַ�����ת��Ϊ�ַ��������
	System.out.println(String.copyValueOf(ch));
	//��������֮����ַ�����
	for (char ch1 : ch) {
		System.out.println(ch1);
	}
	
	System.out.println("**************8****************");
	String s4="sdada";
	StringBuffer sb5=new StringBuffer(s4);
	System.out.println(sb5);
	
	StringBuffer sb6 = new StringBuffer(sb5.append("well"));
	System.out.println(sb6.toString());
	//10�⣬�Ƚ���װ�䣬�ٲ��䣬֮����װ�䡣

}
}
