package com.se.exam;
/*19.	��̬����ʵ�֣������Ŀɱ��ʵ�֡�*/
public class ArgCanChange {
public static void main(String[] args) {
	show();
	show(1);
	show(1,3);
	int sum = ArgCanChange.add(4,5);
    System.out.println("��Ϊ"+sum);
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
