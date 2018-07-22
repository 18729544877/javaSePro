package com.se.object.Integer;

/**
 * 判断字符
 * 对字符进行大小写的转换
 * @author Administrator
 *
 */
public class CharDemo {
public static void main(String[] args) {
	Character c = new Character('a');
	System.out.println(c.toString());//轉為字符串
	System.out.println(Character.isDigit('e'));
	System.out.println(Character.isLowerCase(97));//是否是小寫字母
	System.out.println(Character.isUpperCase(64));//判斷是否是大寫
    System.out.println(Character.isDigit(53));//是否是数字true
    System.out.println(Character.isDigit(58));//是否是数字false
    //48--57分别是0--9的对应ascII码值；
    //65-96分别是A--Z
    //97--128分别是a-z
    System.out.println(Character.toLowerCase(66));//B-->b都是对应的ascII码
    System.out.println(Character.toUpperCase(97));//a-->A对应的是65

    System.out.println(Character.toLowerCase('A'));//将大写的字母转化为小写的字母
    System.out.println("HelloolleH");
    System.out.println("%%%000000%%%");
}
}
