package com.se.object;

import java.util.HashSet;
import java.util.Iterator;

public class SuiJiShuSet {
public static void main(String[] args) {
	int count=0;
	 HashSet<Integer> hs  = new HashSet<Integer>();
	while(hs.size()<10) {
		count++;
		 hs.add((int)(Math.random()*20)+1);
	}
	 Iterator<Integer> ite = hs.iterator();
	 System.out.println("10��1��20֮����������");
	
	 while(ite.hasNext()) {
		 System.out.println(ite.next());
	 }
	 System.out.println("����������Ĵ���"+count);
}
}
