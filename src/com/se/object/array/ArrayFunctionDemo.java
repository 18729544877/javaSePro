package com.se.object.array;

public class ArrayFunctionDemo {
public static void main(String[] args) {
	int[] a = {3,4,55,332,232,22,2334,233,22,76};
	showArray(a);
	System.out.println("数组逆序");
	int[] m=reverse(a);
	showArray(m);
	//正排序由小到大：
	System.out.println("按照由小到大排序：");
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
	System.out.println("遍历数组：");
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
