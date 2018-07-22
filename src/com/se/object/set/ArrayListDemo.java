package com.se.object.set;

import java.util.ArrayList;
import java.util.Iterator;


public class ArrayListDemo {
public static void main(String[] args) {
	ArrayList<Student> al = new ArrayList<Student>();
	al.add(0, new Student("张三",22));
	al.add(0, new Student("张四",20));
	al.add(0, new Student("张无",23));
	
	System.out.println(al.get(0));//第一个元素是张无
	System.out.println(al.get(1));//第二个元素是张四
	System.out.println(al.get(2));//第三个元素是张三
	al.set(0,new Student("王麻子",9));//将 第一个元素进行替换
	System.out.println("通过调用get方法由下标返回对应的元素：");
	
	System.out.println(al.get(0));
	System.out.println(al.get(1));
	System.out.println(al.get(2));
	//遍历
	System.out.println("遍历方法一");
	for(int i=0;i<al.size();i++) {
	Student aa=al.get(i);
		System.out.println(aa);
	}
	
	System.out.println("迭代器遍历方法二：");
	Iterator<Student> it = al.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	System.out.println("遍历方法三：");
	for(int i=0;i<al.size();i++) {
		System.out.println(al.get(i));
	}
	
	
}
}
