package com.se.object.array;

public class ArrayDemo {
	public static void main(String[] args) {
		int[] array = {2,4,5,56,74,32};
		show(array);
		int[] c=reverse(array);
		show(c);
	}

	public static void show(int[] c) {
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i]);
		}
		
	}

	/**
	 *Êý×éµÄË³Ðò µ¹ÖÃ
	 * @param array
	 * @return
	 */
	public static int[] reverse(int[] array) {
		int[] b = new int[array.length];
		for(int i=0;i<array.length;i++) {
			b[i]=array[array.length-i-1];
		}
		return b;
	}

}
