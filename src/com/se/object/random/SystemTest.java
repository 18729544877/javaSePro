package com.se.object.random;

import java.util.Arrays;

public class SystemTest {
public static void main(String[] args) {
	System.out.println("hellowotld");
	//System.exit(0);//������ر��˽������Ķ���ִ����
	System.out.println("dsdada");
	
	int[] a = new int[10];
	for(int i = 0; i < a.length; i++) {
		a[i]=i;
	}
	int[] b = new int[5];
	
	System.arraycopy(a,1,b,0,3);//����ӵ�һ��������±�1��ʼ���Ƶ��ڶ�������b���±�0�����Ƶĳ�����3
	System.out.println(Arrays.toString(b));
	
	System.out.println(System.currentTimeMillis());//1970����ǰ��ʱ��ĺ���ֵ
	System.gc();
	
}
}
