package com.se.object;

import java.util.HashSet;
import java.util.Iterator;



public class StuSet {
public static  void main(String[] args) {
	HashSet<com.se.object.Student> hs= new HashSet<Student>();

   hs.add(new Student("����1",22));
   hs.add(new Student("����1",23));
   hs.add(new Student("����2",22));
   hs.add(new Student("����2",22));
   hs.add(new Student("����3",22));
   hs.add(new Student("����4",21));
   hs.add(new Student("����5",23));
   hs.add(new Student("����5",22));
   
   
   Iterator<Student>  ii = hs.iterator();
   while(ii.hasNext()) {
	   System.out.println(ii.next());
   }
}
}
