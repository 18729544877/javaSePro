package com.se.object.array;

public class ItemToIndex {
public static void main(String[] args) {
	int[] a = {3,4,2,4,24,5,23,5,23};//������������Ԫ���ظ���ȡ�±�ķ�����
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
	//	continue;//��ڶ��γ��ֵ��±�
		//break;
	}
}

return b;
}
}
