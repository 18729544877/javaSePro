package com.se.object.random;

import java.util.Arrays;
import java.util.Random;

public class RandomTest {
public static void main(String[] args) {
	Random r1= new Random();
	r1.setSeed(12345);
	Random r2 = new Random(12345);
	Random r3 = new Random(12345);
	Random rr = new Random(1662);
	System.out.println(rr.nextInt());
	System.out.println(r1.nextInt());
	System.out.println(r2.nextInt());
	System.out.println(r3.nextInt(23));//23以内的随机数
	
	Random r4=new Random();
	System.out.println(r4.nextInt(10));//十以内的随机数
	Random r5=new Random();
	System.out.println(r5.nextLong());//long的范围内的随机数
	Random r6=new Random();
	System.out.println(r6.nextFloat());//float范围内的随机数
	Random r7=new Random();
	System.out.println(r7.nextBoolean());//boolean布尔类型的随机数
	Random r8=new Random();
	byte[] bytes= new byte[10];
	r8.nextBytes(bytes);//十个字节随机数，字节的范围是-128倒127
	System.out.println(Arrays.toString(bytes));//将byte类型的数组以字符串的形式输出
	
	Random r9=new Random();
	System.out.println(r9.nextGaussian());//高斯随机
}
}
