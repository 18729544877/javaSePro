package com.se.object.set;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.ListIterator;

public class StudentMapStudent {
public static void main(String[] args) {
//HashMap<Student,ArrayList<String>>  hh = new HashMap<Student,ArrayList<String>>();
ArrayList<String>  sl = new ArrayList<String>();
sl.add("һ��");
sl.add("����");
sl.add("����");
//System.out.println(sl.get(0));
ListIterator<String>   ll = sl.listIterator(3);//ָ��������
System.out.println("���������");
while(ll.hasPrevious()) {
	System.out.println(ll.previousIndex());//��ָ����������һ
	
	System.out.println(ll.previous());//
}

System.out.println("���������");
while(ll.hasNext()) {
System.out.println(ll.next());
}
}
}
