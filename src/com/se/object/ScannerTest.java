package com.se.object;

import java.util.Scanner;

public class ScannerTest {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
//	System.out.println(sc.nextInt());
//	System.out.println(sc.nextLine());//�����enterֱ�ӱ�������ܣ����²��������ַ���
	
//	System.out.println(Integer.parseInt(sc.nextLine()));
	//System.out.println(sc.nextLine());//����д�ͽ�������������
	
	String s1="hello";
	String s2="world";
	String s3="helloworld";
System.out.println(s1+s2==s3);
System.out.println(s3.equals(s1+s2));
s1+="world";
System.out.println(s1==s3);
System.out.println(s1.equals(s3));
System.out.println("��meet�ӵ����ַ����Ľ�β:"+s3.concat("meet"));
System.out.println("�ַ�������he��ͷ��"+s3.startsWith("he"));
System.out.println("�ַ�������ld��β��"+s3.endsWith("ld"));
String s4="";
System.out.println("�ַ����ǿյģ�"+s4.isEmpty());

String name="as";
String psw="23";
int count=0;

while(count<3) {
	count++;
	System.out.println("����������");
	String n=sc.nextLine();
	System.out.println("�������룺");
	String p = sc.nextLine();
	if(!(n.equals(name)&&psw.equals(p))) {
		continue;
	}else {
		System.out.println("��¼�ɹ�");
		break;
	}
}
if(count==3) {
	System.out.println("�������̫��");
}
//������
//for(int i=0;i<3;i++) {
//	System.out.println("����������");
//	String n=sc.nextLine();
//	System.out.println("�������룺");
//	String p = sc.nextLine();
//	
//	if(n.equals(name)&&psw.equals(p)) {
//		System.out.println("��¼�ɹ�");
//		break;
//	}else {
//		if((2-i)==0) {
//			System.out.println("����������");
//			break;
//		}
//		System.out.println("����"+(2-i)+"�λ���");
//		
//	}
//}


}
}
