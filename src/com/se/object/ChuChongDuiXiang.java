package com.se.object;

import java.util.ArrayList;
import java.util.HashSet;



public class ChuChongDuiXiang {
public static void main(String[] args) {
	ArrayList<Student> as = new ArrayList<Student>();
	as.add(new Student("����",14));
	as.add(new Student("����",14));
	as.add(new Student("����5",14));
	as.add(new Student("����2",14));
	as.add(new Student("����3",14));
	as.add(new Student("����4",14));
	as.add(new Student("����4",14));
	
	System.out.println("ԭ����ӵ����ݣ�");
	showArray(as);
	
	HashSet<Student>  hss = new HashSet<Student>();
	//set ���ص���û���ظ�Ԫ�أ�����
	hss.addAll(as);
	//arraylist �ǿ��������ظ�Ԫ�ص�
	ArrayList<Student> as1 = new ArrayList<Student>();
	as1.addAll(hss);
	System.out.println("ȥ���ظ��Ķ���");
	showArray(as1);
	
}

private static void showArray(ArrayList<Student>  as1) {
	for(Student o: as1) {
		System.out.println(o);
	}
	
}
}
