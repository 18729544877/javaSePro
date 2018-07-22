package com.se.object.set.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LuRu {
public static void main(String[] args) {
	ArrayList<Integer>  aa = new ArrayList<Integer>();
	Scanner sc = new Scanner(System.in);
       while(true) {
    	   System.out.println("请输入数字：以0结束");
    	   int  num=sc.nextInt();
    	   if(num==0) {
    		   break;
    	   }else {
    		  aa.add(num);    		   
    	   }
       }
      int max= Collections.max(aa);
      System.out.println("集合"+aa+"里，最大的数字是："+max);
}
}
