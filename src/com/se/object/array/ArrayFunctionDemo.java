package com.se.object.array;

public class ArrayFunctionDemo {
public static void main(String[] args) {
	int[] a = {3,4,55,332,232,22,2334,233,22,76};
	showArray(a);
	System.out.println("��������");
	int[] m=reverse(a);
	showArray(m);
	//��������С����
	System.out.println("������С��������");
	paiXu(a);
	showArray(a);
	
}


private static void paiXu(int[] a) {
	for(int i = 0; i < a.length; i++) {
		int index = i;
		for(int j = i; j< a.length; j++) {
			if(a[index]>a[j]) {
				index = j;
			}
		}
		int temp = a[i];
		a[i] = a[index];
		a[index] = temp;
	}
}

private static void showArray(int[] m) {
	System.out.println("�������飺");
	for(int i = 0; i < m.length; i++) {
		System.out.println(m[i]);
	}
}

private static int[] reverse(int[] a) {
	int[] b = new int[a.length];
	for(int i=0; i<a.length; i++) {
		b[i]=a[a.length-i-1];
	}
	return b;
}


}
