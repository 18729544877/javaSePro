package com.se.object.scanner;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class ScannerMax {
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("��������,���ܵ�һ��������0������0�������");
	int num=sc.nextInt();
	
	  TreeSet<Integer> hs = new TreeSet<Integer>( new Comparator<Integer>() {

		@Override
		public int compare(Integer o1, Integer o2) {
			int result=0;
			result=o1.compareTo(o2);
			return result;
		}
	  });
    while(num!=0) {
    	System.out.println("��������,����0�������");
        num=sc.nextInt();
    	hs.add(num);
    }
		System.out.println("���������ǣ�"+hs.last());
		sc.close();
}
}
