package com.se.object.set;

import java.util.LinkedList;

public class LinkedListDemo {
public static void main(String[] args) {
	LinkedList<String> ll = new LinkedList<String>();
	ll.add("掌声那");
	ll.add("李四");
	ll.add("王麻子");
	System.out.println(ll.removeFirst());
}
}
