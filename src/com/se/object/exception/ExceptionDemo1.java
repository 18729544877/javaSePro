package com.se.object.exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo1 {
public static void main(String[] args) {
	/*
	 * ����ʱ�쳣������
	 */
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	String source ="1991-09-23";
	Date da=null;
	try {
		da = sdf.parse(source);
	} catch (ParseException e) {
		System.out.println("�����쳣 ��");
	}
	System.out.println(da);
	/*
	 * ������쳣�Ǳ���Ҫ����ģ�������벻ͨ����������Ҫ�ĺ��ģ�
	 */
	SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy.MM.dd");
	Date date = new Date();
	System.out.println(sdf1.format(date).toString());
	sdf.applyPattern("������һ������ĵ�D���k");
	System.out.println(sdf.format(date));
}
}
