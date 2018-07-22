package com.se.object.set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapAdd {
	public static void main(String[] args) {
		TreeMap<Student,TreeMap<String,Integer>> ttt= new TreeMap<Student,TreeMap<String,Integer>>(new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				return o1.getName().hashCode()-o2.getName().hashCode();
			}
		});

		TreeMap<String, Integer>   t1 = new TreeMap<String, Integer>();
		t1.put("待业", 2014);
		t1.put("在业", 2014);
		
		TreeMap<String, Integer>   t2 = new TreeMap<String, Integer>();
		t2.put("在业", 2015);
		t2.put("待业", 2015);
		
		ttt.put(new Student("张三",33), t1);
		ttt.put(new Student("李四",33), t2);
		
//		for(Student   k  :   ttt.keySet()) {
//			 TreeMap<String, Integer> v = ttt.get(k);
//			 for(String  vk: v.keySet()) {
//			Integer vv=	 v.get(vk);
//			System.out.println(k+":"+vk+":"+vv);
//			 }
//		}	
		Set<Entry<Student, TreeMap<String, Integer>>>  kset = ttt.entrySet();
		 Iterator<Entry<Student, TreeMap<String, Integer>>>  site = 	kset.iterator();
	      while(site.hasNext()) {
	    	  Entry<Student, TreeMap<String, Integer>> set =  site.next();
	    	  Student k = set.getKey();
	    	  TreeMap<String, Integer> v = set.getValue();
	    	  Set<Entry<String, Integer>> s =  v.entrySet();
	    	  Iterator<Entry<String, Integer>> ii = s.iterator();
	    	  while(ii.hasNext()) {
	    		  Entry<String, Integer>  ee = ii.next();
	    		  System.out.println(k+":"+ee.getKey()+":"+ee.getValue());
	    	  }
	      }  
	}
}
