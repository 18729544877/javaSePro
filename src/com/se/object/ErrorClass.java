package com.se.object;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ErrorClass {

public static void main(String[] args) {

	   @SuppressWarnings("rawtypes")
	LinkedList<Comparable>  ll = new LinkedList<Comparable>();
	//   ll.add("字符");
	//   ll.add(0);
	//   ll.add('a');
	   //l.remove("字符");
	   ll.add(0, "jiang");
	   ll.add(1,23);
	   ll.add(2,'a');
	   @SuppressWarnings("rawtypes")
	ListIterator<Comparable> i =  (ListIterator<Comparable>) ll.iterator();
	   while(i.hasNext()) {
		   System.out.println(i.next());
	   }
	   
	   System.out.println("链表里面的元素的个数："+ll.size());
	   System.out.println("链表里面的第一个元素"+ll.get(0));
	   System.out.println("链表里面的第二个元素"+ll.get(1));
	   System.out.println("链表里面的第三个元素"+ll.get(2));
	}
}


