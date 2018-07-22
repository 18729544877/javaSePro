package com.se.object;

import java.util.HashSet;
import java.util.Iterator;



public class StuSet {
public static  void main(String[] args) {
	HashSet<com.se.object.Student> hs= new HashSet<Student>();

   hs.add(new Student("张三1",22));
   hs.add(new Student("张三1",23));
   hs.add(new Student("张三2",22));
   hs.add(new Student("张三2",22));
   hs.add(new Student("张三3",22));
   hs.add(new Student("张三4",21));
   hs.add(new Student("张三5",23));
   hs.add(new Student("张三5",22));
   
   
   Iterator<Student>  ii = hs.iterator();
   while(ii.hasNext()) {
	   System.out.println(ii.next());
   }
}
}
