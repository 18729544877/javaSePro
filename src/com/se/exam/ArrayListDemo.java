package com.se.exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/*11.	��������һ���ַ���:��91 27 46 38 50�����зָ�ȡ��������ArrayList���б���������*/
public class ArrayListDemo {
	public static void main(String[] args) {
		String s = "91 27 46 38 50";
		String[] ss = s.split(" ");
		ArrayList<String> al = new ArrayList<String>();
		
		for (int i = 0; i < ss.length; i++) {
			al.add(ss[i]);
		}
		
		System.out.println("�������£�");
		Iterator<String> ite = al.iterator();
		
		while (ite.hasNext()) {
			System.out.print(ite.next()+" ");
		}
		System.out.println();
		
		int[] b = new int[ss.length];
		
		for (int i = 0; i < ss.length; i++) {
			b[i] = Integer.valueOf(ss[i]);
		}
		
		System.out.println("�������£�");
		Arrays.sort(b);
		
		for (int l : b) {
			System.out.print(l+" ");
		}

	}

}
