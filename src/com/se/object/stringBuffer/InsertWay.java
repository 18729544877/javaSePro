package com.se.object.stringBuffer;

public class InsertWay {
public static void main(String[] args) {
	StringBuffer sb= new StringBuffer("12345678");
	//��ָ��������λ�ÿ�ʼ����������͵��ַ�����ʽ
	System.out.println(sb.insert(3, "ssds"));//��ָ�������������ַ�����ssds��
	boolean b=false;
	System.out.println(sb.insert(6, b));//���±�6��λ�ÿ�ʼ����b
	String s= "abcd";
	
	char[] ch=s.toCharArray();//תΪ�ַ����顣
	System.out.println(sb.insert(2,String.valueOf(ch)));//�ַ�����ת��Ϊ�ַ���Ȼ���ָ����������
	double m=5.5;
	System.out.println(sb);
	System.out.println(sb.insert(2,Double.toString(m)));//�ڶ����������ַ��������ͣ������Ƚ�doubleתΪ�ַ���
	
}
}
