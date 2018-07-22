package com.se.object.set;

import java.util.Comparator;
import java.util.Iterator;

import java.util.TreeSet;

public class TreesetDemo {
	public static void main(String[] args) {// TreeSet���ڹ��캯�����潨�ڲ���ʵ�ֽӿ�comparator��δʵ�ֵķ���compare
		TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// if(o1.getName().hashCode()!=o2.hashCode())
				int result = o2.getName().hashCode() - o1.getName().hashCode();// �������ֵ�hashcode�Ĵ�С���Ƚ�
				result = result == 0 ? result : o1.getAge() - o2.getAge();// ���������ɴ�С
				return result;
			}
		});

		ts.add(new Student("����0", 22));
		ts.add(new Student("����1", 20));

		ts.add(new Student("����2", 23));
		ts.add(new Student("����3", 21));
		ts.add(new Student("����33", 25));
		ts.add(new Student("����33", 25));// ֱ��ȥ��

		Iterator<Student> ite = ts.iterator();
		System.out.println("��������Ĵ�С����");
		while (ite.hasNext()) {
			System.out.println(ite.next());
		}

	}

}
