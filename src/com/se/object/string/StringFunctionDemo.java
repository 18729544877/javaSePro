package com.se.object.string;

import java.util.Scanner;

public class StringFunctionDemo {
public static void main(String[] args) {
	String s= "femshdcbasfdasf";

	char[] b = s.toCharArray();
	//�ַ�������
	reverse(b);
	//����stringbuffer�ķ�������
	StringBuffer sff= new StringBuffer(s);
	System.out.println(sff.reverse().toString());
	
	//���ַ���������
	for(int i=0;i<b.length;i++) {
		for(int j=0;j<b.length-1-i;j++) {
			if(b[j]>b[j+1]) {
				char temp=b[j];
				b[j]=b[j+1];
				b[j+1]=temp;
			}
		}
	}
	System.out.println("����˳��֮��������ַ���:");
	System.out.println(b);//����˳��֮��������ַ���,������char��������,���ܺ��ַ���ƴ�ӣ������������ַ��
//	String s1="sdsdsfafaga";
//	System.out.println(s1.replace("s", "dsds"));
//	System.out.println(s1.replace('s','S'));
//	System.out.println(s1.substring(2,3));
//	System.out.println(s1.replaceFirst("s","S"));
//	System.out.println(s1.length());
//	String s2="  dasd  dsa sdsd ff       sada   sa   ";
//	System.out.println(s2.trim());
//	System.out.println(s2.replace(" ", ""));//�����еĿո��滻�ɿգ�
//	String s4=s1.toUpperCase();
//	System.out.println(s4);
//	
//	System.out.println(s4.toLowerCase());//���ı�s4��ֵ
//	System.out.println(s4.charAt(3));
//	//System.out.println(s1.charAt(3));
//	//System.out.println(s1.compareToIgnoreCase("g"));
	Scanner sc= new Scanner(System.in);
//	String s6=sc.next();
//	char[] ch= s6.toCharArray();
//	reverse(ch);
	//����һ
	System.out.println("�����ַ�����");
	String s3=sc.next();
	char[]  n=s3.toCharArray();
	System.out.println("�ַ�������׸�"+n[0]);
	System.out.println("������������ַ�������ĸ��д��");
	firstUpper(s3,n);
	//��������
	String ss="sdasfdafafafas";
	String ss1=String.valueOf(ss.charAt(0)).toUpperCase();
	String ss2=ss.toLowerCase();//תΪСд
	System.out.println(ss1+ss.substring(1,ss2.length()));//substring(),��������������һ�����ַ��������Ǵ��ַ�����һ�����ַ����� 

	 

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
 * ������������ַ���������ĸ��д
 */
public static void firstUpper(String ss,char[] n) {
System.out.println(ss.replaceFirst(String.valueOf(n[0]), String.valueOf(n[0]).toUpperCase()));


}

}
