package com.se.object.random;

public class StringTest {
public static void main(String[] args) {
	String s1="ass";
	String s2="ass";
	if(s1.equals(s2)) {
		System.out.println(true);
	}else {
		System.out.println(false);	
	}	
	System.out.println(s1==s2);
	
String s3= new String("sdsd");
String s4=new String("sdsd");


System.out.println(s3);
System.out.println(s4);
System.out.println(s3==s4);//引用地址不一样
String s5=s4;//引用地址复制
System.out.println(s5==s4);//引用地址是同一个
System.out.println(s5);
System.out.println(s4);

s5+="well";
System.out.println(s5==s4);
System.out.println(s4);
System.out.println(s5);
System.out.println(s5.concat("hello"));//不该变s5原来的值
System.out.println(s4);
System.out.println(s5);


//String s="[1-9][0-9]{7,9}";//最多是10位，最少是8
//Scanner sc= new Scanner(System.in);
//System.out.println("请输入合适的qq号码：");
//String s21=sc.next();
//
//if(!(s21.matches(s))) {
//	System.out.println("请输入合适的qq号码：");
//	s21=sc.next();	
//}
//System.out.println(s21);



}
}
