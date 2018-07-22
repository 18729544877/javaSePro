package com.se.object.random;

import java.util.Arrays;

public class SystemTest {
public static void main(String[] args) {
	System.out.println("hellowotld");
	//System.exit(0);//虚拟机关闭了接下来的都不执行了
	System.out.println("dsdada");
	
	int[] a = new int[10];
	for(int i = 0; i < a.length; i++) {
		a[i]=i;
	}
	int[] b = new int[5];
	
	System.arraycopy(a,1,b,0,3);//代表从第一个数组的下标1开始复制倒第二个数组b的下标0，复制的长度是3
	System.out.println(Arrays.toString(b));
	
	System.out.println(System.currentTimeMillis());//1970倒当前的时间的毫秒值
	System.gc();
	
}
}
