package com.se.exam;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*17.	ͨ������������collection�����Զ�̬��ʽʵ�֡�*/
public class CollectionDemo {
	public static void main(String[] args) {
		Collection<String> cc = new ArrayList<String>();
		cc.add("����");
		cc.add("����1");
		cc.add("����2");
		cc.add("����3");
		cc.add("����4");
		cc.add("����4");// �����ظ�
		cc.add("����5");
		cc.add("����6");
		System.out.println("������������");
		Iterator<String> ite = cc.iterator();
		while (ite.hasNext()) {
			System.out.println(ite.next());
		}
	}
}
