package com.se.object.set;

import java.util.ArrayList;
import java.util.Iterator;


public class ArrayListDemo {
public static void main(String[] args) {
	ArrayList<Student> al = new ArrayList<Student>();
	al.add(0, new Student("����",22));
	al.add(0, new Student("����",20));
	al.add(0, new Student("����",23));
	
	System.out.println(al.get(0));//��һ��Ԫ��������
	System.out.println(al.get(1));//�ڶ���Ԫ��������
	System.out.println(al.get(2));//������Ԫ��������
	al.set(0,new Student("������",9));//�� ��һ��Ԫ�ؽ����滻
	System.out.println("ͨ������get�������±귵�ض�Ӧ��Ԫ�أ�");
	
	System.out.println(al.get(0));
	System.out.println(al.get(1));
	System.out.println(al.get(2));
	//����
	System.out.println("��������һ");
	for(int i=0;i<al.size();i++) {
	Student aa=al.get(i);
		System.out.println(aa);
	}
	
	System.out.println("������������������");
	Iterator<Student> it = al.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	System.out.println("������������");
	for(int i=0;i<al.size();i++) {
		System.out.println(al.get(i));
	}
	
	
}
}
