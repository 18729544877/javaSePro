package com.se.exam;

import java.util.ArrayList;
import java.util.Iterator;

/*18.	用泛型实现ArrayList的添加，删除，修改，查询，遍历（三种方式方法体系）。*/
public class ArrayListDemo2 {
	public static void main(String[] args) {

		ArrayList<String> aa = new ArrayList<String>();
		aa.add("张三1");
		aa.add("张三2");
		aa.add("张三3");
		aa.add("张三4");
		aa.add("张三5");
		System.out.println("删除前的集合元素：" + aa);
		System.out.println("删除的元素是：" + aa.remove(0));
		System.out.println("删除后的集合元素：" + aa);
		System.out.println("被替换位置原来的元素是：" + aa.set(0, "李四"));
		System.out.println("替换后的集合元素为：" + aa);
		System.out.println("集合的第一个元素是：" + aa.get(0));
		System.out.println("增强for遍历：");
		for (String ss : aa) {
			System.out.println(ss);
		}
		System.out.println("迭代器遍历:");
		Iterator<String> i = aa.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("for循环遍历：");
		for (int j = 0; j < aa.size(); j++) {
			System.out.println(aa.get(j));
		}
	}

}
