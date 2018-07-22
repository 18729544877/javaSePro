package com.se.object.set.test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class StudentScoreSort {
public static void main(String[] args) {
	TreeSet<Student>  ll = new TreeSet<Student>( new Comparator<Student>() {

		@Override
		public int compare(Student o1, Student o2) {
			int he= o1.getEnglishScore()+o1.getMathScore()+o1.getYuwenScore();
			int he1=o2.getEnglishScore()+o2.getMathScore()+o2.getYuwenScore();
			return he-he1;
		}
		
	});
ll.add(new Student("sa",22,33,33));	
ll.add(new Student("sas",42,33,33));	
ll.add(new Student("sasd",72,33,33));	
ll.add(new Student("sd",52,33,33));	
ll.add(new Student("ssd",62,33,33));	
System.out.println(ll);

Iterator<Student> it = ll.iterator();
while(it.hasNext()){
	System.out.println(it.next());
}


}
}
