package com.se.object.exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ThrowsDemo {
public static void main(String[] args) {
	method();
	method1();
   
}

private static void method1() throws ArithmeticException,ArrayIndexOutOfBoundsException{
SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
Date d = null;
try {
	 d = sdf1.parse("1991-09-09");
} catch (ParseException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
    System.out.println(d);
}

private static void method() {
	Date da = null;
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	//String s = sdf.format(da);
		Date date =new Date();
		System.out.println(sdf.format(date));
	
	
}
}
