package com.se.object.set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
public static void main(String[] args) {
	TreeMap<Student,String>  tm = new TreeMap<Student,String>(new Comparator<Student>() {

		@Override
		public int compare(Student o1, Student o2) {
			
			return o1.getAge()-o2.getAge();
		}
		
	});
	tm.put(new Student("С��",29),"һ��");
	tm.put(new Student("С��",20),"����");
	tm.put(new Student("С��1",21),"����");
	tm.put(new Student("С��2",22),"һ��");
	tm.put(new Student("С��3",23),"����");
	tm.put(new Student("С��4",24),"һ��");
	
	 Set<Entry<Student, String>> set = tm.entrySet();
	 Iterator<Entry<Student, String>> ite =  set.iterator();
	 System.out.println("�����������С��������");
while(ite.hasNext()) {
	 Entry<Student, String>  ee = ite.next();
	 System.out.println(ee.getKey().toString()+":"+ee.getValue());
}
}
}
