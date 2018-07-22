package com.se.object.random;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BirthdayToNow {


public static void main(String[] args) throws ParseException {

	String birthday="1991年09月27日";
	Date date=new Date();
int 	huo2 = liveTime(date,birthday);
System.out.println("活了"+huo2+"天");//9316

	String huo="9316";
	QiuTime(birthday,huo);
}

private static int liveTime(Date date, String birthday) throws ParseException {
	SimpleDateFormat sdf= new SimpleDateFormat("yyyy年MM月dd日");
	long time1=date.getTime();
long time2=	sdf.parse(birthday).getTime();
long distance =time1-time2;
int day=(int) (distance/1000/60/60/24);
return day;
}

private static void QiuTime(String birthday, String huo) throws ParseException {
//	Date date =new Date();
	//long distancenow=date.getTime();//1970到现在的毫秒数

	SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy年MM月dd日");
	long distanceme=sdf4.parse(birthday).getTime();
	long distance=Long.valueOf(huo)*24*3600*1000+distanceme;

System.out.println(sdf4.format(new Date(distance)));
}
}
