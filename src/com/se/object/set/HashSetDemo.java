package com.se.object.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
public static void main(String[] args) {
	ArrayList<Student>  as = new ArrayList<Student>();
	as.add(new Student("����1",22));
	as.add(new Student("����2",22));
	as.add(new Student("����3",22));
	as.add(new Student("����4",22));
	as.add(new Student("����5",22));
	as.add(new Student("����6",22));
	as.add(new Student("����6",22));
	
	HashSet<Student>  hs = new HashSet<Student>();
	hs.addAll(as);//��������ӵ�hs��������
	
	ArrayList<Student>  as1 = new ArrayList<Student>();
	as1.addAll(hs);//������hs��ӵ�����as1����
	
	Iterator<Student> ite = as1. iterator();
	while(ite.hasNext()) {
		System.out.println(ite.next());
	}
}
}
