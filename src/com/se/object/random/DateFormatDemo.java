package com.se.object.random;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateFormatDemo {
public static void main(String[] args) throws ParseException {

	//System.out.println(date);//date��Ĭ�ϵ����������ʽ
	String s="yyyy/MM/dd";
	String s1="1991/09/27";
	Date date= new Date();
	System.out.println("����ת�ַ���");
	fun1(date,s);
	
	System.out.println("�ַ���ת��������");
	Date d=fun(s,s1);
	System.out.println(d);
	
//	System.out.println("���յ�1970��ʱ��εĺ���ֵ��"+d.getTime());
//	Date date2 = new Date();
//	System.out.println("��ǰʱ�䵹1970��ʱ��εĺ���ֵ��"+date2.getTime());
//	double day=(date2.getTime()-d.getTime())/1000/60/60/24;
//	System.out.println("���յ�����ļ����"+day+"��");
	

}

private static Date fun(String s,String s2) throws ParseException{
	SimpleDateFormat sdf = new SimpleDateFormat();
	sdf.applyPattern(s);//������ģʽ�ַ���Ӧ���ڴ����ڸ�ʽ
//	System.out.println("�������� Date ��ʽ��Ϊ����/ʱ���ַ���"+sdf.format(new Date()));//�������� Date ��ʽ��Ϊ����/ʱ���ַ���
	Date d1=sdf.parse(s2);//�����ַ������ı������� Date��
	return d1;
}
private static void fun1(Date date, String s) {
	SimpleDateFormat sdf1 = new SimpleDateFormat(s);//�ø�����ģʽ��Ĭ�����Ի��������ڸ�ʽ���Ź��� SimpleDateFormat
	System.out.println(sdf1.format(date.getTime()));
}

}
