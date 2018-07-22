package com.se.object;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class sdd {
	public static void main(String[] args) {

		ArrayList strs = initStringArray();
		Iterator iterator = strs.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		System.out.println(strs.toString());
	}

	private static ArrayList initStringArray() {
		ArrayList sr = new ArrayList();
		java.lang.String str = null;
		while(true) {
			System.out.println("ÊäÈë×Ö·û´®£º");
			Scanner scan = new Scanner(System.in);
			str = scan.nextLine();
			if("#".equals(str)){
				break;
			}
			sr.add(str);
		} 
		
		return sr;
	}
}
