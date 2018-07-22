package com.se.exam;
/*19.	静态导入实现，方法的可编参实现。*/
public class ArgCanChange {
public static void main(String[] args) {
	show();
	show(1);
	show(1,3);
	int sum = ArgCanChange.add(4,5);
    System.out.println("和为"+sum);
}

private static void show(int... i) {
	for(int o:i) {
		System.out.print(o+" ");
	}
	System.out.println();
}

public static int add(int i, int j) {
	return (i+j);
}
}
