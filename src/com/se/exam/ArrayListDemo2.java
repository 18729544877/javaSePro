package com.se.exam;

import java.util.ArrayList;
import java.util.Iterator;

/*18.	�÷���ʵ��ArrayList����ӣ�ɾ�����޸ģ���ѯ�����������ַ�ʽ������ϵ����*/
public class ArrayListDemo2 {
	public static void main(String[] args) {

		ArrayList<String> aa = new ArrayList<String>();
		aa.add("����1");
		aa.add("����2");
		aa.add("����3");
		aa.add("����4");
		aa.add("����5");
		System.out.println("ɾ��ǰ�ļ���Ԫ�أ�" + aa);
		System.out.println("ɾ����Ԫ���ǣ�" + aa.remove(0));
		System.out.println("ɾ����ļ���Ԫ�أ�" + aa);
		System.out.println("���滻λ��ԭ����Ԫ���ǣ�" + aa.set(0, "����"));
		System.out.println("�滻��ļ���Ԫ��Ϊ��" + aa);
		System.out.println("���ϵĵ�һ��Ԫ���ǣ�" + aa.get(0));
		System.out.println("��ǿfor������");
		for (String ss : aa) {
			System.out.println(ss);
		}
		System.out.println("����������:");
		Iterator<String> i = aa.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("forѭ��������");
		for (int j = 0; j < aa.size(); j++) {
			System.out.println(aa.get(j));
		}
	}

}
