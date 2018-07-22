package com.se.exam;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*16.	Date,DateFormat, SimpleDateFormatͨ����Щ��ʵ����ĸ�ʽ��������Լ���ʽ�����룬�Է���ʵ�֡�*/
public class DateFormatDemo {
	public static void main(String[] args) throws ParseException {
		Date date = new Date();

		String s1 = "yyyy��MM��dd�� hh:MM:ss";
		String s2 = "2002��09��22��";
		String s = "yyyy��MM��dd��";
		System.out.println("��ʽ�����:" + formatFunction(s1, date));
		Date tt = readIn(s, s2);
		System.out.println(tt);
	}

	private static Date readIn(String s1, String s2) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat(s1);
		Date dd = sdf.parse(s2);
		return dd;
	}

	private static String formatFunction(String s1, Date date) throws ParseException {
		SimpleDateFormat adf = new SimpleDateFormat();
		adf.applyPattern(s1);
		String res = adf.format(date);
		return res;
	}
}
