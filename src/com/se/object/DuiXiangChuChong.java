package com.se.object;

import java.util.ArrayList;
import java.util.Iterator;

import java.util.List;

import collection.test.Student;

public class DuiXiangChuChong {
public static void main(String[] args) {
	List<Student> ll = new ArrayList<Student>();
	ll.add(0, new Student("张三",17));
	ll.add(1, new Student("张三1",14));
	ll.add(2, new Student("张三1",13));
	ll.add(3, new Student("张三2",22));
	ll.add(4, new Student("张三2",22));
	ll.add(5, new Student("张三3",32));
	ll.add(6, new Student("张三3",42));
	List<Student> ll1= new ArrayList<Student>();
	ll1.add(0, new Student("张三2",22));
	Iterator<Student> ii1 = ll1.iterator();
	while(ii1.hasNext()) {
		System.out.println(ii1.next());
	}
	
System.out.println(!(ll1.contains(ll.get(3).getName())&&ll1.contains((ll.get(3).getAge()))));
Iterator<Student> ii = ll.iterator();
while(ii.hasNext()) {
	System.out.println(ii.next());
}
//System.out.println(ll1);
}
}
