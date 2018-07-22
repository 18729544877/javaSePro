package com.se.object.random;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateFormatDemo {
public static void main(String[] args) throws ParseException {

	//System.out.println(date);//date类默认的日期输出格式
	String s="yyyy/MM/dd";
	String s1="1991/09/27";
	Date date= new Date();
	System.out.println("日期转字符串");
	fun1(date,s);
	
	System.out.println("字符串转日期类型");
	Date d=fun(s,s1);
	System.out.println(d);
	
//	System.out.println("生日到1970的时间段的毫秒值："+d.getTime());
//	Date date2 = new Date();
//	System.out.println("当前时间倒1970的时间段的毫秒值："+date2.getTime());
//	double day=(date2.getTime()-d.getTime())/1000/60/60/24;
//	System.out.println("生日倒今天的间隔："+day+"天");
	

}

private static Date fun(String s,String s2) throws ParseException{
	SimpleDateFormat sdf = new SimpleDateFormat();
	sdf.applyPattern(s);//将给定模式字符串应用于此日期格式
//	System.out.println("将给定的 Date 格式化为日期/时间字符串"+sdf.format(new Date()));//将给定的 Date 格式化为日期/时间字符串
	Date d1=sdf.parse(s2);//解析字符串的文本，生成 Date。
	return d1;
}
private static void fun1(Date date, String s) {
	SimpleDateFormat sdf1 = new SimpleDateFormat(s);//用给定的模式和默认语言环境的日期格式符号构造 SimpleDateFormat
	System.out.println(sdf1.format(date.getTime()));
}

}
