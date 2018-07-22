package com.se.object.random;


public class StringToStringBuffer {
public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
//	System.out.println("输入 字符串");
//	String s= sc.next();
//	StringBuffer sb=new StringBuffer(s);
//	System.out.println(sb.reverse().toString());
	
	String s1="woaijavawozhenaijavawozhendeaijavawozhendehenaijavaxinbuxinwoaijavagun";
	StringBuffer sb3=new StringBuffer(s1);
	int count=0;
	int b=0;
	while(true) {
		
	  b=sb3.indexOf("java", b);//此处的参数位置b不能写成0，因为要循环
	  if(b<0) {
			break;
		}
			count++;
		b+=4;
			
	}

	System.out.println(count);
	
}
}
