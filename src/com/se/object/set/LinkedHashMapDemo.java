package com.se.object.set;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMapDemo {
public static void main(String[] args) {
	LinkedHashMap<Integer,Student>    lh = new LinkedHashMap<Integer,Student>();
	lh.put(1, new Student("小明",12));
	lh.put(1, new Student("小明",13));//将第一个元素覆盖
	lh.put(1, new Student("小明2",13));//将第二个元素覆盖
	lh.put(2, new Student("小明1",14));
	lh.put(3, new Student("小明2",15));
	lh.put(4, new Student("小明3",16));
	lh.put(5, new Student("小明4",17));
	lh.put(6, new Student("小明5",18));
	
	 Set<Entry<Integer, Student>> set=lh.entrySet();
	 Iterator<Entry<Integer, Student>> ite= set.iterator();
   while(ite.hasNext()) {
	   Entry<Integer, Student> ee= ite.next();
	   System.out.println(ee.getKey()+":"+ee.getValue().toString());
   }	
}
}
