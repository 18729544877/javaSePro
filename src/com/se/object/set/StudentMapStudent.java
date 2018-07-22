package com.se.object.set;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.ListIterator;

public class StudentMapStudent {
public static void main(String[] args) {
//HashMap<Student,ArrayList<String>>  hh = new HashMap<Student,ArrayList<String>>();
ArrayList<String>  sl = new ArrayList<String>();
sl.add("一班");
sl.add("二班");
sl.add("三班");
//System.out.println(sl.get(0));
ListIterator<String>   ll = sl.listIterator(3);//指定的索引
System.out.println("逆向遍历：");
while(ll.hasPrevious()) {
	System.out.println(ll.previousIndex());//比指定的索引少一
	
	System.out.println(ll.previous());//
}

System.out.println("正向遍历：");
while(ll.hasNext()) {
System.out.println(ll.next());
}
}
}
