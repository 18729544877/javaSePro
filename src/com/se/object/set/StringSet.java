package com.se.object.set;

import java.util.HashSet;
import java.util.Iterator;

public class StringSet {
public static void main(String[] args) {
	HashSet<String> s = new HashSet<String>();
    s.add("������");
    s.add("������1");
    s.add("������1");
    s.add("������2");
    s.add("������2");
    s.add("������3");
    s.add("������4");
    s.add("������5");
    s.add("������5");
    
    Iterator<String>  ite= s.iterator();
    while(ite.hasNext()) {
    	System.out.println(ite.next());
    }
}
}
