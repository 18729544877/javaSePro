package com.se.object.set;

import java.util.LinkedList;

public class LinkedListDemo {
public static void main(String[] args) {
	LinkedList<String> ll = new LinkedList<String>();
	ll.add("������");
	ll.add("����");
	ll.add("������");
	System.out.println(ll.removeFirst());
}
}
