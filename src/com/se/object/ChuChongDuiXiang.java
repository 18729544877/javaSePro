package com.se.object;

import java.util.ArrayList;
import java.util.HashSet;



public class ChuChongDuiXiang {
public static void main(String[] args) {
	ArrayList<Student> as = new ArrayList<Student>();
	as.add(new Student("张三",14));
	as.add(new Student("张三",14));
	as.add(new Student("张三5",14));
	as.add(new Student("张三2",14));
	as.add(new Student("张三3",14));
	as.add(new Student("张三4",14));
	as.add(new Student("张三4",14));
	
	System.out.println("原来添加的数据：");
	showArray(as);
	
	HashSet<Student>  hss = new HashSet<Student>();
	//set 的特点是没有重复元素；；；
	hss.addAll(as);
	//arraylist 是可以允许重复元素的
	ArrayList<Student> as1 = new ArrayList<Student>();
	as1.addAll(hss);
	System.out.println("去掉重复的对象：");
	showArray(as1);
	
}

private static void showArray(ArrayList<Student>  as1) {
	for(Student o: as1) {
		System.out.println(o);
	}
	
}
}
