package com.se.exam;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*16.	Date,DateFormat, SimpleDateFormat通过这些类实现类的格式化输出，以及格式化读入，以方法实现。*/
public class DateFormatDemo {
	public static void main(String[] args) throws ParseException {
		Date date = new Date();

		String s1 = "yyyy年MM月dd日 hh:MM:ss";
		String s2 = "2002年09月22日";
		String s = "yyyy年MM月dd日";
		System.out.println("格式化输出:" + formatFunction(s1, date));
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
