package com.se.object.stringBuffer;

public class InsertWay {
public static void main(String[] args) {
	StringBuffer sb= new StringBuffer("12345678");
	//从指定索引的位置开始插入给定类型的字符串形式
	System.out.println(sb.insert(3, "ssds"));//从指定索引处插入字符串“ssds”
	boolean b=false;
	System.out.println(sb.insert(6, b));//从下标6的位置开始插入b
	String s= "abcd";
	
	char[] ch=s.toCharArray();//转为字符数组。
	System.out.println(sb.insert(2,String.valueOf(ch)));//字符数组转化为字符串然后从指定索引插入
	double m=5.5;
	System.out.println(sb);
	System.out.println(sb.insert(2,Double.toString(m)));//第二个参数是字符串的类型，多以先将double转为字符串
	
}
}
