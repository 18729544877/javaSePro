package com.se.object;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ErrorClass {

public static void main(String[] args) {

	   @SuppressWarnings("rawtypes")
	LinkedList<Comparable>  ll = new LinkedList<Comparable>();
	//   ll.add("�ַ�");
	//   ll.add(0);
	//   ll.add('a');
	   //l.remove("�ַ�");
	   ll.add(0, "jiang");
	   ll.add(1,23);
	   ll.add(2,'a');
	   @SuppressWarnings("rawtypes")
	ListIterator<Comparable> i =  (ListIterator<Comparable>) ll.iterator();
	   while(i.hasNext()) {
		   System.out.println(i.next());
	   }
	   
	   System.out.println("���������Ԫ�صĸ�����"+ll.size());
	   System.out.println("��������ĵ�һ��Ԫ��"+ll.get(0));
	   System.out.println("��������ĵڶ���Ԫ��"+ll.get(1));
	   System.out.println("��������ĵ�����Ԫ��"+ll.get(2));
	}
}


