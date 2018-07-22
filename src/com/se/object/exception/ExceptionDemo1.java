package com.se.object.exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo1 {
public static void main(String[] args) {
	/*
	 * 编译时异常的例子
	 */
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	String source ="1991-09-23";
	Date da=null;
	try {
		da = sdf.parse(source);
	} catch (ParseException e) {
		System.out.println("编译异常 了");
	}
	System.out.println(da);
	/*
	 * 编译的异常是必须要处理的，否则编译不通过。这是主要的核心，
	 */
	SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy.MM.dd");
	Date date = new Date();
	System.out.println(sdf1.format(date).toString());
	sdf.applyPattern("今天是一年里面的第D天第k");
	System.out.println(sdf.format(date));
}
}
