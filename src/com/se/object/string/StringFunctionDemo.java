package com.se.object.string;

import java.util.Scanner;

public class StringFunctionDemo {
public static void main(String[] args) {
	String s= "femshdcbasfdasf";

	char[] b = s.toCharArray();
	//字符串倒置
	reverse(b);
	//利用stringbuffer的方法倒置
	StringBuffer sff= new StringBuffer(s);
	System.out.println(sff.reverse().toString());
	
	//对字符数组排序
	for(int i=0;i<b.length;i++) {
		for(int j=0;j<b.length-1-i;j++) {
			if(b[j]>b[j+1]) {
				char temp=b[j];
				b[j]=b[j+1];
				b[j+1]=temp;
			}
		}
	}
	System.out.println("拍完顺序之后输出的字符串:");
	System.out.println(b);//拍完顺序之后输出的字符串,参数是char类型数组,不能和字符串拼接，这样会输出地址。
//	String s1="sdsdsfafaga";
//	System.out.println(s1.replace("s", "dsds"));
//	System.out.println(s1.replace('s','S'));
//	System.out.println(s1.substring(2,3));
//	System.out.println(s1.replaceFirst("s","S"));
//	System.out.println(s1.length());
//	String s2="  dasd  dsa sdsd ff       sada   sa   ";
//	System.out.println(s2.trim());
//	System.out.println(s2.replace(" ", ""));//将所有的空格替换成空，
//	String s4=s1.toUpperCase();
//	System.out.println(s4);
//	
//	System.out.println(s4.toLowerCase());//不改变s4的值
//	System.out.println(s4.charAt(3));
//	//System.out.println(s1.charAt(3));
//	//System.out.println(s1.compareToIgnoreCase("g"));
	Scanner sc= new Scanner(System.in);
//	String s6=sc.next();
//	char[] ch= s6.toCharArray();
//	reverse(ch);
	//方法一
	System.out.println("输入字符串：");
	String s3=sc.next();
	char[]  n=s3.toCharArray();
	System.out.println("字符数组的首个"+n[0]);
	System.out.println("将键盘输入的字符串首字母大写：");
	firstUpper(s3,n);
	//方法二：
	String ss="sdasfdafafafas";
	String ss1=String.valueOf(ss.charAt(0)).toUpperCase();
	String ss2=ss.toLowerCase();//转为小写
	System.out.println(ss1+ss.substring(1,ss2.length()));//substring(),两个参数，返回一个新字符串，它是此字符串的一个子字符串。 

	 

}
public static void reverse(char[] ch) {

	System.out.println("*********");
	
	char[] c=new char[ch.length];
	for(int i=0;i<ch.length;i++) {
		c[i]=ch[ch.length-i-1];
	}
	System.out.println(c);
}


/**
 * 将键盘输入的字符串的首字母大写
 */
public static void firstUpper(String ss,char[] n) {
System.out.println(ss.replaceFirst(String.valueOf(n[0]), String.valueOf(n[0]).toUpperCase()));


}

}
