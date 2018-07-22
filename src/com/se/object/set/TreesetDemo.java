package com.se.object.set;

import java.util.Comparator;
import java.util.Iterator;

import java.util.TreeSet;

public class TreesetDemo {
	public static void main(String[] args) {// TreeSet需在构造函数里面建内部类实现接口comparator的未实现的方法compare
		TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// if(o1.getName().hashCode()!=o2.hashCode())
				int result = o2.getName().hashCode() - o1.getName().hashCode();// 按照名字的hashcode的大小来比较
				result = result == 0 ? result : o1.getAge() - o2.getAge();// 按照年龄由大到小
				return result;
			}
		});

		ts.add(new Student("李丽0", 22));
		ts.add(new Student("李丽1", 20));

		ts.add(new Student("李丽2", 23));
		ts.add(new Student("李丽3", 21));
		ts.add(new Student("李丽33", 25));
		ts.add(new Student("李丽33", 25));// 直接去重

		Iterator<Student> ite = ts.iterator();
		System.out.println("按照年龄的大小排序：");
		while (ite.hasNext()) {
			System.out.println(ite.next());
		}

	}

}
