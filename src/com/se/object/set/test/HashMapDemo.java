package com.se.object.set.test;

import java.util.HashMap;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<Student1, HashMap<String, Integer>> hh = new HashMap<Student1, HashMap<String, Integer>>();
		HashMap<String, Integer> h1 = new HashMap<String, Integer>();
		h1.put("����", 1000);
		HashMap<String, Integer> h2 = new HashMap<String, Integer>();
		h2.put("ɽ��", 2000);

		hh.put(new Student1("����", 23), h1);
		hh.put(new Student1("����", 33), h2);
		hh.put(new Student1("������", 30), h1);
		hh.put(new Student1("����", 22), h2);

		Set<Student1> k = hh.keySet();
		for (Student1 kk : k) {
			HashMap<String, Integer> v = hh.get(kk);
			for (String vk : v.keySet()) {
				Integer vv = v.get(vk);
				System.out.println(kk + ":" + vk + ":" + vv);
			}
		}

	}
}
