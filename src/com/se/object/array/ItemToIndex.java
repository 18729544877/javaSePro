package com.se.object.array;

public class ItemToIndex {
public static void main(String[] args) {
	int[] a = {3,4,2,4,24,5,23,5,23};//针对数组里面的元素重复的取下标的方法。
int[] m =toIndex(a,5);
showArray(m);
}

private static void showArray(int[] m) {
	for(int as:m) {
		if(as!=0) {
		System.out.println(as);
		}
	}
	
}

private static int[] toIndex(int[] a, int num) {
	int[] b=new int[a.length];
	int index=0;
	int count=0;
	
for(int i = 0;  i < a.length; i++) {
	if(a[i]==num) {
		index=i;
		b[count]=index;
		count++;
	//	continue;//求第二次出现的下标
		//break;
	}
}

return b;
}
}
