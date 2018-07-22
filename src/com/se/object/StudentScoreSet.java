package com.se.object;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class StudentScoreSet {
public static void main(String[] args) {
	TreeSet<StudentScore>  tss = new TreeSet<StudentScore>( new Comparator<StudentScore>() {

		@Override
		public int compare(StudentScore o1, StudentScore o2) {
		int o1s=o1.getShuxueScore()+o1.getYuwenScore()+o1.getEnglishScore();
		int o2s=o2.getShuxueScore()+o2.getYuwenScore()+o2.getEnglishScore();
		int result=0;
		result=o2s-o1s;
			return result;
		}
	}); 
	
	tss.add(new StudentScore("张三",11,23,22));
	tss.add(new StudentScore("张三1",41,23,22));
	tss.add(new StudentScore("张三2",51,23,22));
	tss.add(new StudentScore("张三3",61,23,22));
	System.out.println("按照总分由高倒低排序");
	Iterator<StudentScore>  ite = tss.iterator();
	while(ite.hasNext()) {
		System.out.println(ite.next());
	}
}
}
