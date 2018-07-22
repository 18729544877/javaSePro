package com.se.object.array;

public class BinarySearch {

	public static void main(String[] args) {
		int[] a = { 1, 2, 4, 5, 6, 7,34 };
                   //0,1, 2,,3,,,4,5,6
		int c=binarySearch(a, 3);//���ظ�һ����û���ҵ�
		System.out.println(c);
	}

	private static int binarySearch(int[] a, int i) {
		int start = 0;
		int end = a.length-1;
		int mid = (start+end)/2;
		
		while (end >= start) {
			if (i > a[mid]) {
				start = mid + 1;
			}
			if (i < a[mid]) {
				end = mid - 1;
			}
			if (start > end) {
				System.out.println("û�ҵ�");
				return -1;
			}
			if(a[mid]==i||start==mid) {
				System.out.println("�ҵ�");
				break;
			}
			mid = (start + end) / 2;
		}
return mid;
	}
}
