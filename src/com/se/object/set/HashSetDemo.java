package com.se.object.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
public static void main(String[] args) {
	ArrayList<Student>  as = new ArrayList<Student>();
	as.add(new Student("忘记1",22));
	as.add(new Student("忘记2",22));
	as.add(new Student("忘记3",22));
	as.add(new Student("忘记4",22));
	as.add(new Student("忘记5",22));
	as.add(new Student("忘记6",22));
	as.add(new Student("忘记6",22));
	
	HashSet<Student>  hs = new HashSet<Student>();
	hs.addAll(as);//将集合添加倒hs集合里面
	
	ArrayList<Student>  as1 = new ArrayList<Student>();
	as1.addAll(hs);//将集合hs添加倒集合as1里面
	
	Iterator<Student> ite = as1. iterator();
	while(ite.hasNext()) {
		System.out.println(ite.next());
	}
}
}
