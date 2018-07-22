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
	System.out.println(r3.nextInt(23));//23���ڵ������
	
	Random r4=new Random();
	System.out.println(r4.nextInt(10));//ʮ���ڵ������
	Random r5=new Random();
	System.out.println(r5.nextLong());//long�ķ�Χ�ڵ������
	Random r6=new Random();
	System.out.println(r6.nextFloat());//float��Χ�ڵ������
	Random r7=new Random();
	System.out.println(r7.nextBoolean());//boolean�������͵������
	Random r8=new Random();
	byte[] bytes= new byte[10];
	r8.nextBytes(bytes);//ʮ���ֽ���������ֽڵķ�Χ��-128��127
	System.out.println(Arrays.toString(bytes));//��byte���͵��������ַ�������ʽ���
	
	Random r9=new Random();
	System.out.println(r9.nextGaussian());//��˹���
}
}
