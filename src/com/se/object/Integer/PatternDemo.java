package com.se.object.Integer;

import java.util.Arrays;
import java.util.regex.Pattern;

public class PatternDemo {
public static void main(String[] args) {
	/**�ж������Ƿ���ȷ
	 * ���õ���������ʽ
	 * �õ���Patern���compile()
	 * ����Matcher���matches����ƥ�䣬find()���ң�group���
	 * ��ؼ��ľ���������ʽ��
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
//	 System.out.println("���������䣺");
//	 String str1=sc.next();
	 String regex1="\\d";//��ʾ��������0-9
//	Pattern p =Pattern.compile(regex1);//����������ʽ
//	//Matcher m1=p.matcher(str1);//ƥ�䴫����ַ���
//	 System.out.println(Pattern.matches(regex1, str1));
//	 
	 
	
//	 String s3="sdsafasf45dfsfa@sdw.ewefsaf.com";
//		Pattern p1 =Pattern.compile(regex1);//����������ʽ
//		Matcher m1=p1.matcher(s3);//ƥ�䴫����ַ���
//		if(m1.find()) {
//			System.out.println(m1.group());
//		}
//	String  regex3="\\s";//���տհ��ַ����
//	 String s4="sdasfafafa dsafa edaw ewafea";
//	 String[] s5=s4.split(regex3);
//	 for(String ss:s5) {
//		 System.out.println(ss);
//	 }
	 
	/**
	 * ˼·���õ�string�Ĳ������split���ַ�������s�𿪣�Ȼ��
	 * ���ַ���������գ�֮������ǿforѭ������
	 */
	 System.out.println("999999999");
	 String s4="sdasfafafadsafaedawewafea";
	 String[] s5=s4.split("d");//��d���ַ�����
	 for(String ss:s5) {
		 System.out.println(ss);
	 }
/**
 *˼·����������ʽ��ʾ�����е�����\\d
 *Ȼ������õ�string���滻�������������滻Ϊ*
 */	 
	 
	 String str1 = "dafafwaefqfqwfq9098098797fafas798fafas8f09dsafa";
	 String regex11="\\d";
	 //Pattern p=Pattern.compile(regex11);
	String  st= str1.replaceAll(regex11,"*");//�����е�������*�滻
	System.out.println(st);
/**
 *˼·���Ƚ��ַ����ָ�Ϊ�ַ������飬֮��Ԫ��ת��Ϊ������֮������֮������StringBuffer��append����ƴ���ַ��� 
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
