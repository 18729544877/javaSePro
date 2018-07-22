package com.se.exam.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/*20.	HashMapǶ��ArrayList����ΪStudent���������ݳ�ʼ�������ұ��������
HashMap<String, ArrayList<Studen*/

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<String, ArrayList<Student>> hs = new HashMap<String, ArrayList<Student>>();
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student("����", 22));
		al.add(new Student("����2", 42));
		al.add(new Student("����3", 12));
		al.add(new Student("����4", 32));

		ArrayList<Student> al1 = new ArrayList<Student>();
		al1.add(new Student("����", 24));
		al1.add(new Student("����", 23));
		al1.add(new Student("Ƥ��", 12));
		al1.add(new Student("Ƥ��1", 22));
		hs.put("һ��", al);
		hs.put("����", al1);

		for (String k1 : hs.keySet()) {
			ArrayList<Student> v = hs.get(k1);
			Iterator<Student> ite = v.iterator();
			while (ite.hasNext()) {
				Student s = ite.next();
				System.out.println(k1 + ":" + s.getName() + ":" + s.getAge());
			}
		}

	}

}
