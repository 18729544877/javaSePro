package com.se.object.random;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BirthdayToNow {


public static void main(String[] args) throws ParseException {

	String birthday="1991��09��27��";
	Date date=new Date();
int 	huo2 = liveTime(date,birthday);
System.out.println("����"+huo2+"��");//9316

	String huo="9316";
	QiuTime(birthday,huo);
}

private static int liveTime(Date date, String birthday) throws ParseException {
	SimpleDateFormat sdf= new SimpleDateFormat("yyyy��MM��dd��");
	long time1=date.getTime();
long time2=	sdf.parse(birthday).getTime();
long distance =time1-time2;
int day=(int) (distance/1000/60/60/24);
return day;
}

private static void QiuTime(String birthday, String huo) throws ParseException {
//	Date date =new Date();
	//long distancenow=date.getTime();//1970�����ڵĺ�����

	SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy��MM��dd��");
	long distanceme=sdf4.parse(birthday).getTime();
	long distance=Long.valueOf(huo)*24*3600*1000+distanceme;

System.out.println(sdf4.format(new Date(distance)));
}
}
