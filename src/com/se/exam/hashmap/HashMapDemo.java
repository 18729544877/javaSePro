package com.se.exam.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/*20.	HashMap嵌套ArrayList泛型为Student，进行数据初始化，并且遍历输出。
HashMap<String, ArrayList<Studen*/

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<String, ArrayList<Student>> hs = new HashMap<String, ArrayList<Student>>();
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student("张三", 22));
		al.add(new Student("张三2", 42));
		al.add(new Student("张三3", 12));
		al.add(new Student("张三4", 32));

		ArrayList<Student> al1 = new ArrayList<Student>();
		al1.add(new Student("李四", 24));
		al1.add(new Student("玩吗", 23));
		al1.add(new Student("皮埃", 12));
		al1.add(new Student("皮埃1", 22));
		hs.put("一班", al);
		hs.put("二班", al1);

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
