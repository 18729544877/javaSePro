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
	tm.put(new Student("小明",29),"一班");
	tm.put(new Student("小明",20),"二班");
	tm.put(new Student("小明1",21),"三班");
	tm.put(new Student("小明2",22),"一班");
	tm.put(new Student("小明3",23),"二班");
	tm.put(new Student("小明4",24),"一班");
	
	 Set<Entry<Student, String>> set = tm.entrySet();
	 Iterator<Entry<Student, String>> ite =  set.iterator();
	 System.out.println("按照年龄的由小到大排序：");
while(ite.hasNext()) {
	 Entry<Student, String>  ee = ite.next();
	 System.out.println(ee.getKey().toString()+":"+ee.getValue());
}
}
}
