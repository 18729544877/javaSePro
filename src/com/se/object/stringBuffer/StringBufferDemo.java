package com.se.object.stringBuffer;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringBufferDemo {

	public static void main(String[] args) {
//		StringBuffer sb = new StringBuffer("12344");
//		StringBuffer sb1 = sb;
//		System.out.println(sb1.append("sdsdaw"));//�������
//		System.out.println(sb.substring(2));// ��Ӱ��ԭ�������ݣ���ָ��������ʼ���µ��ַ�����
//		System.out.println(sb);
//		System.out.println(sb1.length());//sb1�����õ�ַ�Ǵ�sb��������,�������ǵ����õ�ַ��ͬ������ͨ�����õ�ַ�ı�sb�Ĵ�С
//		System.out.println(sb.length());//sb,sb1����11
//		System.out.println("sb��������"+sb.capacity());
//		System.out.println("***********");
//		String s = "123456";
//		System.out.println("subString������int index������ָ��������ʼ�������������ַ�����");
//		System.out.println(s.substring(1));
//		System.out.println(s.substring(1, 2));//��ȡ��������֮����ַ����������������������
//		System.out.println("--------------------------------------");
//		StringBuffer sb2 = new StringBuffer("123457532324667");
		
//		System.out.println(sb2.indexOf("4"));//�൱������ĵڶ���������0�����ص�һ�γ��ֵ�ָ�����ַ����ڸ��ַ����е�������
//		System.out.println(sb2.indexOf("4",0));
//		System.out.println(sb2.indexOf("5", 2));//4,��ָ��������ʼ�������һ�γ���ָ�����ַ���������
//		System.out.println(sb2.reverse());//766423235754321
//	
//		System.out.println("***************");
//		String s1 = "awdsrfghtyj";
//		byte[] chh = s1.getBytes();//������ֽ�����������صĶ�Ӧ�Լ��ַ���ascII��
//		char[] c1 = s1.toCharArray();
//		System.out.println("##################");
//		for (char c4 : c1) {
//			System.out.println(c4);
//		}
//		for (byte ch6 : chh) {
//			System.out.println(ch6);
//		}
//		System.out.println("22222222222222222222222222222");
/**
 * ˼·�ǣ�������ת��Ϊ�ַ�����Ȼ��Ϳ��Ե���string�ķ������ַ���ת��Ϊ�ַ����飻
 * ת��֮�������������򣬵���Arrays��sort����֮��ֱ�����
 * /
 */
//		int[] f = { 1, 5, 9 };
//		System.out.println(Arrays.toString(f));//������ת�����ַ���
		String s1 = "awdsrfghtyj";
		char[] ch = s1.toCharArray();//���ַ�������ַ���ȡ��������ַ�����
		System.out.println(ch.length);//�ַ������changdu
		Arrays.sort(ch);
		System.out.println("������˳��"+Arrays.toString(ch));//��char����תΪ�ַ���
//		for (int i = 0; i < ch.length; i++) {
//			for (int j = 0; j < ch.length - i - 1; j++) {
//				if (ch[j] > ch[j + 1]) {
//					char temp = ch[j];
//					ch[j] = ch[j + 1];
//					ch[j + 1] = temp;
//					
//				}
//			}
//		}//ͨ���Ƚ��ַ���ascII��Ĵ�С�Ӷ����ַ�����
	
		//[a, d, f, g, h, j, r, s, t, w, y]
				
//		for (char ch1 : ch) {
//			System.out.println(ch1);
//
//		}//��ǿfor��������˳����char���飬
//����һ
//		String s="sdadjavajlkjljjavajkjlk";
//		int count=0;
//		int d1=0;
//		while(true) {
//			d1=s.indexOf("java");
//			if(d1<0) {
//				break;
//			}
//			s=s.substring(d1+4);
//			count++;
//		}
//		System.out.println(count);
/**
 * ˼·�����ҵ����±�֮���ȡ��Ȼ��������µ��ַ������ң������ڸ�һ��ʱ������whileѭ��
 * ��������
 */
//		String s="sdadjavajlkjljjavajkjlkjavaopopokpjavajjokj";
//		int count=0;
//		int d1=0;
//		while((d1=s.indexOf("java"))!=-1) {
//			s=s.substring(d1+4,s.length());//+4��ԭ�����г���java��ƴ���µ����µ��ַ���������˴�дd1���ᵼ��d1��ѭ�����һֱ�Ǵ�����������ѭ��
//			count++;
//		}
//		System.out.println("java��"+count+"��");
//		
/**
 * ˼·��������д��������ʽ��֮�����ƥ����������ƥ�䡣
 */
		String s="sdadjavajlkjljjavajkjlkjavaopopokpjavajjokj";
		String regex="java";
		Pattern p=Pattern.compile(regex);//��������������ʽ���뵽ģʽ��
		Matcher m = p.matcher(s);//����ƥ������������ģʽ��ƥ������
		int count=0;
		while(m.find()) {//���Բ������ģʽƥ����������е���һ�������С�
			m.group();//��������ǰƥ�������ƥ������������С�
			count++;
		}
		System.out.println(count);
		
	/*	
		String s5="sdadjavajlkjljjavajkjlk";
		char[] ch1 = new char[s5.length()];
		System.out.println(ch[0]==ch1[1]);
	
		int[]b=new int[ch1.length];
		for(int i=0;i<ch1.length;i++) {	
			int count1=0;
			for(int j=1;j<ch1.length;j++) {
				
				if(ch1[i]!=ch1[j]){
					continue;
				}else {
				count1++;
				}
			}
				char[]a=new char[ch.length];
				a[i]=ch1[i];
				b[i]=count1;
				System.out.println(a[i]+":"+b[i]);
		}
	*/	
		
	}
}
