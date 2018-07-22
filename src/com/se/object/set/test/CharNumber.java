package com.se.object.set.test;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class CharNumber {
public static void main(String[] args) {
	HashMap<Character,Integer> m = new HashMap<Character,Integer>();
//	TreeMap<Character,Integer>   m =new TreeMap<Character,Integer>(new Comparator<Object>() {
//
//		@Override
//		public int compare(Object o1, Object o2) {
//			
//			return 0;
//		}
//		
//	});

String s="dsadfasfsafsafsadsdasfafafafaffafga";
int[] a = new int[127];
for(int i=0;i<s.length();i++) {
	a[s.charAt(i)]++;
}

for(int j=97; j<127; j++) {
	if(a[j]!=0) {
		m.put((char)j, a[j]);
	}
}
System.out.println(m.toString());
//Set<Character> set = m.keySet();
//Iterator<Character>  ii = set.iterator();
//while(ii.hasNext()) {
//	 Character c =	ii.next();
//	System.out.print(c+"("+m.get(c)+") ");
//}
}
}
