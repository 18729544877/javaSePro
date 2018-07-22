package com.se.object;

import java.util.Scanner;

public class ScannerTest {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
//	System.out.println(sc.nextInt());
//	System.out.println(sc.nextLine());//上面的enter直接被下面接受，导致不能输入字符串
	
//	System.out.println(Integer.parseInt(sc.nextLine()));
	//System.out.println(sc.nextLine());//这样写就解决了上面的问题
	
	String s1="hello";
	String s2="world";
	String s3="helloworld";
System.out.println(s1+s2==s3);
System.out.println(s3.equals(s1+s2));
s1+="world";
System.out.println(s1==s3);
System.out.println(s1.equals(s3));
System.out.println("将meet接到此字符串的结尾:"+s3.concat("meet"));
System.out.println("字符串是以he开头："+s3.startsWith("he"));
System.out.println("字符串是以ld结尾："+s3.endsWith("ld"));
String s4="";
System.out.println("字符串是空的："+s4.isEmpty());

String name="as";
String psw="23";
int count=0;

while(count<3) {
	count++;
	System.out.println("输入姓名：");
	String n=sc.nextLine();
	System.out.println("输入密码：");
	String p = sc.nextLine();
	if(!(n.equals(name)&&psw.equals(p))) {
		continue;
	}else {
		System.out.println("登录成功");
		break;
	}
}
if(count==3) {
	System.out.println("错误次数太多");
}
//方法二
//for(int i=0;i<3;i++) {
//	System.out.println("输入姓名：");
//	String n=sc.nextLine();
//	System.out.println("输入密码：");
//	String p = sc.nextLine();
//	
//	if(n.equals(name)&&psw.equals(p)) {
//		System.out.println("登录成功");
//		break;
//	}else {
//		if((2-i)==0) {
//			System.out.println("机会用完了");
//			break;
//		}
//		System.out.println("还有"+(2-i)+"次机会");
//		
//	}
//}


}
}
