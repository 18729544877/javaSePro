package com.se.object.random;

import java.util.Arrays;
import java.util.Scanner;

public class StringBufferTest1 {
public static void main(String[] args) {
//	1、String和StringBuffer的相互转换
//	2、把数组拼接成一个字符串
//	3、把字符串反转
//	4、判断一个字符串是否是对称字符串
//		例如"abc"不是对称字符串，"aba"、"abba"、"aaa"、"mnanm"是对称字符串
//	5、通过查看API了解一下StringBuilder类
//	6、String,StringBuffer,StringBuilder的区别
//	7、StringBuffer和数组的区别
//	8、看程序写结果：
//		String作为参数传递
//		StringBuffer作为参数传递
//		使用方法调用的形式，将String和StringBuffer作为形式参数进行传递
//	9、把字符串中的字符进行排序。
//		举例：”dacgebf”
//		结果：”abcdefg”
//
//	10、Integer i = 1; i += 1;做了哪些事情
//
//	11、题目：猴子吃桃问题：猴子第一天摘下若干个桃子，当即吃了一半，还不瘾，又多吃了一个     
//		第二天早上又将剩下的桃子吃掉一半，又多吃了一个。以后每天早上都吃了前一天剩下     
//		的一半零一个。到第10天早上想再吃时，见只剩下一个桃子了。求第一天共摘了多少。   
System.out.println("***************1***************");
	StringBuffer sb = new StringBuffer("sdads");
	String c=sb.toString();
	System.out.println(c);
	String  ss="12133";
	StringBuffer sb1=new StringBuffer(ss);
	
	System.out.println(sb1);
	System.out.println("****************2**************");
	int[] a = {2,2,3,4,5,5};
	System.out.println(Arrays.toString(a));
	System.out.println("***************3***************");
	StringBuffer s = new StringBuffer("abc");
	System.out.println(s.reverse());
	System.out.println("*****************4****************");
	Scanner sc = new Scanner(System.in);
	System.out.println("请输入字符串：");
	String s3=sc.next();
	StringBuffer sb2=new StringBuffer(s3);
	
	StringBuffer sb3=new StringBuffer(s3).reverse();
	System.out.println(sb3);
	String sb33=sb3.toString();
	System.out.println(sb2);
	String sb22=sb2.toString();//字符串的equals方法才能判断，stringbuffer的不行
	if(sb22.equals(sb33)) {
		System.out.println("对称");
	}else {
		System.out.println("不对称");
	}
	sc.close();
	System.out.println("***************9*************");
	String s1 = "asdsadfebcd";
	char[] ch = s1.toCharArray();//将字符串转化为字符数组，
	System.out.println(ch.length);//字符数组的长度
	for (int i = 0; i < ch.length; i++) {
		for (int j = 0; j < ch.length - i - 1; j++) {
			if (ch[j] > ch[j + 1]) {//通过字符的ascII码的大小进行排序。
				char temp = ch[j];
				ch[j] = ch[j + 1];
				ch[j + 1] = temp;
			}
		}
	}
	//下面将字符数组转化为字符串输出。
	System.out.println(String.copyValueOf(ch));
	//遍历排序之后的字符数组
	for (char ch1 : ch) {
		System.out.println(ch1);
	}
	
	System.out.println("**************8****************");
	String s4="sdada";
	StringBuffer sb5=new StringBuffer(s4);
	System.out.println(sb5);
	
	StringBuffer sb6 = new StringBuffer(sb5.append("well"));
	System.out.println(sb6.toString());
	//10题，先进行装箱，再拆箱，之后再装箱。

}
}
