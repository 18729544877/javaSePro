package com.se.object.set.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LuRu {
public static void main(String[] args) {
	ArrayList<Integer>  aa = new ArrayList<Integer>();
	Scanner sc = new Scanner(System.in);
       while(true) {
    	   System.out.println("���������֣���0����");
    	   int  num=sc.nextInt();
    	   if(num==0) {
    		   break;
    	   }else {
    		  aa.add(num);    		   
    	   }
       }
      int max= Collections.max(aa);
      System.out.println("����"+aa+"����������ǣ�"+max);
}
}
