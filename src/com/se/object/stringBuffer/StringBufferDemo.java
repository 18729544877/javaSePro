package com.se.object.stringBuffer;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringBufferDemo {

	public static void main(String[] args) {
//		StringBuffer sb = new StringBuffer("12344");
//		StringBuffer sb1 = sb;
//		System.out.println(sb1.append("sdsdaw"));//后面添加
//		System.out.println(sb.substring(2));// 不影响原来的数据，从指定索引开始的新的字符串、
//		System.out.println(sb);
//		System.out.println(sb1.length());//sb1的引用地址是从sb复制来的,所以他们的引用地址相同，可以通过引用地址改变sb的大小
//		System.out.println(sb.length());//sb,sb1都是11
//		System.out.println("sb的容量："+sb.capacity());
//		System.out.println("***********");
//		String s = "123456";
//		System.out.println("subString方法（int index）返回指定索引开始倒最后结束的新字符串：");
//		System.out.println(s.substring(1));
//		System.out.println(s.substring(1, 2));//截取两个索引之间的字符串，不包括后面的索引。
//		System.out.println("--------------------------------------");
//		StringBuffer sb2 = new StringBuffer("123457532324667");
		
//		System.out.println(sb2.indexOf("4"));//相当与下面的第二个参数是0；返回第一次出现的指定子字符串在该字符串中的索引。
//		System.out.println(sb2.indexOf("4",0));
//		System.out.println(sb2.indexOf("5", 2));//4,从指定索引开始，输出第一次出现指定子字符串的索引
//		System.out.println(sb2.reverse());//766423235754321
//	
//		System.out.println("***************");
//		String s1 = "awdsrfghtyj";
//		byte[] chh = s1.getBytes();//保存的字节数组遍历返回的对应自己字符的ascII码
//		char[] c1 = s1.toCharArray();
//		System.out.println("##################");
//		for (char c4 : c1) {
//			System.out.println(c4);
//		}
//		for (byte ch6 : chh) {
//			System.out.println(ch6);
//		}
//		System.out.println("22222222222222222222222222222");
/**
 * 思路是：将数组转化为字符串，然后就可以调用string的方法将字符串转化为字符数组；
 * 转化之后对数组进行排序，调用Arrays的sort（）之后直接输出
 * /
 */
//		int[] f = { 1, 5, 9 };
//		System.out.println(Arrays.toString(f));//将数组转化成字符串
		String s1 = "awdsrfghtyj";
		char[] ch = s1.toCharArray();//将字符串李的字符提取出来组成字符数组
		System.out.println(ch.length);//字符数组的changdu
		Arrays.sort(ch);
		System.out.println("拍完了顺序："+Arrays.toString(ch));//将char数组转为字符串
//		for (int i = 0; i < ch.length; i++) {
//			for (int j = 0; j < ch.length - i - 1; j++) {
//				if (ch[j] > ch[j + 1]) {
//					char temp = ch[j];
//					ch[j] = ch[j + 1];
//					ch[j + 1] = temp;
//					
//				}
//			}
//		}//通过比较字符的ascII码的大小从而对字符排序
	
		//[a, d, f, g, h, j, r, s, t, w, y]
				
//		for (char ch1 : ch) {
//			System.out.println(ch1);
//
//		}//增强for遍历交换顺序后的char数组，
//方法一
//		String s="sdadjavajlkjljjavajkjlk";
//		int count=0;
//		int d1=0;
//		while(true) {
//			d1=s.indexOf("java");
//			if(d1<0) {
//				break;
//			}
//			s=s.substring(d1+4);
//			count++;
//		}
//		System.out.println(count);
/**
 * 思路：将找倒的下标之后截取，然后继续余下的字符串查找，当等于附一的时候跳出while循环
 * 方法二：
 */
//		String s="sdadjavajlkjljjavajkjlkjavaopopokpjavajjokj";
//		int count=0;
//		int d1=0;
//		while((d1=s.indexOf("java"))!=-1) {
//			s=s.substring(d1+4,s.length());//+4的原因是切除”java“拼成新的余下的字符串，如果此处写d1将会导致d1的循环结果一直是大于零陷入死循环
//			count++;
//		}
//		System.out.println("java共"+count+"个");
//		
/**
 * 思路：将首先写好正则表达式，之后调用匹配器，进行匹配。
 */
		String s="sdadjavajlkjljjavajkjlkjavaopopokpjavajjokj";
		String regex="java";
		Pattern p=Pattern.compile(regex);//将给定的正则表达式编译到模式中
		Matcher m = p.matcher(s);//创建匹配给定输入与此模式的匹配器。
		int count=0;
		while(m.find()) {//尝试查找与该模式匹配的输入序列的下一个子序列。
			m.group();//返回由以前匹配操作所匹配的输入子序列。
			count++;
		}
		System.out.println(count);
		
	/*	
		String s5="sdadjavajlkjljjavajkjlk";
		char[] ch1 = new char[s5.length()];
		System.out.println(ch[0]==ch1[1]);
	
		int[]b=new int[ch1.length];
		for(int i=0;i<ch1.length;i++) {	
			int count1=0;
			for(int j=1;j<ch1.length;j++) {
				
				if(ch1[i]!=ch1[j]){
					continue;
				}else {
				count1++;
				}
			}
				char[]a=new char[ch.length];
				a[i]=ch1[i];
				b[i]=count1;
				System.out.println(a[i]+":"+b[i]);
		}
	*/	
		
	}
}
