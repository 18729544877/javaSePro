package com.se.exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/*11.	我有如下一个字符串:”91 27 46 38 50”进行分割取出，放入ArrayList进行遍历，排序。*/
public class ArrayListDemo {
	public static void main(String[] args) {
		String s = "91 27 46 38 50";
		String[] ss = s.split(" ");
		ArrayList<String> al = new ArrayList<String>();
		
		for (int i = 0; i < ss.length; i++) {
			al.add(ss[i]);
		}
		
		System.out.println("遍历如下：");
		Iterator<String> ite = al.iterator();
		
		while (ite.hasNext()) {
			System.out.print(ite.next()+" ");
		}
		System.out.println();
		
		int[] b = new int[ss.length];
		
		for (int i = 0; i < ss.length; i++) {
			b[i] = Integer.valueOf(ss[i]);
		}
		
		System.out.println("排序如下：");
		Arrays.sort(b);
		
		for (int l : b) {
			System.out.print(l+" ");
		}

	}

}
