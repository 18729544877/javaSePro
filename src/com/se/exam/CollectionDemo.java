package com.se.exam;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*17.	通过迭代器变量collection对象，以多态形式实现。*/
public class CollectionDemo {
	public static void main(String[] args) {
		Collection<String> cc = new ArrayList<String>();
		cc.add("张三");
		cc.add("张三1");
		cc.add("张三2");
		cc.add("张三3");
		cc.add("张三4");
		cc.add("张三4");// 允许重复
		cc.add("张三5");
		cc.add("张三6");
		System.out.println("迭代器遍历：");
		Iterator<String> ite = cc.iterator();
		while (ite.hasNext()) {
			System.out.println(ite.next());
		}
	}
}
