package com.se.object.set;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMapDemo {
public static void main(String[] args) {
	LinkedHashMap<Integer,Student>    lh = new LinkedHashMap<Integer,Student>();
	lh.put(1, new Student("С��",12));
	lh.put(1, new Student("С��",13));//����һ��Ԫ�ظ���
	lh.put(1, new Student("С��2",13));//���ڶ���Ԫ�ظ���
	lh.put(2, new Student("С��1",14));
	lh.put(3, new Student("С��2",15));
	lh.put(4, new Student("С��3",16));
	lh.put(5, new Student("С��4",17));
	lh.put(6, new Student("С��5",18));
	
	 Set<Entry<Integer, Student>> set=lh.entrySet();
	 Iterator<Entry<Integer, Student>> ite= set.iterator();
   while(ite.hasNext()) {
	   Entry<Integer, Student> ee= ite.next();
	   System.out.println(ee.getKey()+":"+ee.getValue().toString());
   }	
}
}
