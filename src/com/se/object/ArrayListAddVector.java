package com.se.object;

import java.util.ArrayList;
import java.util.Vector;

public class ArrayListAddVector {
public static void main(String[] args) {
	ArrayList<Vector<Student>>    avs = new ArrayList<Vector<Student>>();
	Vector<com.se.object.Student>  vs = new Vector<Student>();
	vs.add(new Student("����1",12));
	vs.add(new Student("����2",12));
	vs.add(new Student("����3",12));
	vs.add(new Student("����4",12));
	vs.add(new Student("����5",12));
	vs.add(new Student("����6",12));
	vs.add(new Student("����7",12));
	
	avs.add(vs);
	//��ǿforѭ������
//	for(Vector<Student>   o1:avs) {
//		for(Student s:o1) {
//			System.out.println(s);
//		}
//	}
	
	//forѭ��˫�����
	for(int i=0; i<avs.size(); i++) {
		Vector<Student> v1 = new Vector<Student> ();
		v1=avs.get(i);
		for(int j=0; j<v1.size(); j++) {                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			System.out.println(v1.get(j));
		}
		System.err.println(" ");
	}
}
}
