package com.se.object.Integer;

import java.util.Arrays;
import java.util.regex.Pattern;

public class PatternDemo {
public static void main(String[] args) {
	/**判断邮箱是否正确
	 * 采用的是正则表达式
	 * 用到了Patern类的compile()
	 * 还有Matcher类的matches方法匹配，find()查找，group输出
	 * 最关键的就是正则表达式。
	 */
	String regex="[a-zA-Z_0-9]+@[a-zA-Z_0-9]{2,6}(\\.[a-zA-Z_0-9]{2,3})+";
	//Pattern p = Pattern.compile(regex);
	String str="12313sfa@ssrese.ew.com";
	 boolean m = Pattern.matches(regex, str);
	 if(m) {
		 System.out.println(true);
	 }else {
		 System.out.println(false);
	 }
//	 Scanner sc=new Scanner(System.in);
//	 System.out.println("请输入邮箱：");
//	 String str1=sc.next();
	 String regex1="\\d";//表示所有数字0-9
//	Pattern p =Pattern.compile(regex1);//接受正则表达式
//	//Matcher m1=p.matcher(str1);//匹配传入的字符串
//	 System.out.println(Pattern.matches(regex1, str1));
//	 
	 
	
//	 String s3="sdsafasf45dfsfa@sdw.ewefsaf.com";
//		Pattern p1 =Pattern.compile(regex1);//接受正则表达式
//		Matcher m1=p1.matcher(s3);//匹配传入的字符串
//		if(m1.find()) {
//			System.out.println(m1.group());
//		}
//	String  regex3="\\s";//按照空白字符拆分
//	 String s4="sdasfafafa dsafa edaw ewafea";
//	 String[] s5=s4.split(regex3);
//	 for(String ss:s5) {
//		 System.out.println(ss);
//	 }
	 
	/**
	 * 思路：用倒string的拆除方法split将字符串按照s拆开，然后
	 * 拿字符串数组接收，之后用增强for循环遍历
	 */
	 System.out.println("999999999");
	 String s4="sdasfafafadsafaedawewafea";
	 String[] s5=s4.split("d");//用d将字符串拆开
	 for(String ss:s5) {
		 System.out.println(ss);
	 }
/**
 *思路：将正则表达式表示出所有的数字\\d
 *然后就是用到string的替换方法，将数字替换为*
 */	 
	 
	 String str1 = "dafafwaefqfqwfq9098098797fafas798fafas8f09dsafa";
	 String regex11="\\d";
	 //Pattern p=Pattern.compile(regex11);
	String  st= str1.replaceAll(regex11,"*");//将所有的数字用*替换
	System.out.println(st);
/**
 *思路：先将字符串分割为字符串数组，之后将元素转换为整数，之后排序，之后利用StringBuffer的append方法拼接字符串 
 */	  
	String string="91 27 46 38 50";
	String[] ss=string.split(" ");
	int[] a=new int[ss.length];
	
	for(int i=0;i<ss.length;i++) {
	a[i]=Integer.parseInt(ss[i]);
}
//	for(String sd:ss) {
//		System.out.println(sd);
//	}
	Arrays.sort(a);
	System.out.println(Arrays.toString(a));
//	for(int i=0;i<a.length;i++) {
//		for(int j=0;j<a.length-i-1;j++) {
//			if(a[j]>a[j+1]) {
//				int temp=a[j];
//				a[j]=a[j+1];
//				a[j+1]=temp;
//			}
//		}
//	}
	
	StringBuffer  sf=new StringBuffer();
	for(int i=0;i<a.length;i++) {
		if(i==a.length-1) {
			sf.append(String.valueOf(a[i]));
		}else {
			sf.append(String.valueOf(a[i]+" "));
		}
	}
	System.out.println(sf);
}
}
