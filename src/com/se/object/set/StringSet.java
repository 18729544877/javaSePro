package com.se.object.set;

import java.util.HashSet;
import java.util.Iterator;

public class StringSet {
public static void main(String[] args) {
	HashSet<String> s = new HashSet<String>();
    s.add("张三吧");
    s.add("张三吧1");
    s.add("张三吧1");
    s.add("张三吧2");
    s.add("张三吧2");
    s.add("张三吧3");
    s.add("张三吧4");
    s.add("张三吧5");
    s.add("张三吧5");
    
    Iterator<String>  ite= s.iterator();
    while(ite.hasNext()) {
    	System.out.println(ite.next());
    }
}
}
