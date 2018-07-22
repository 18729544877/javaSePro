package com.se.Interface;

import java.util.Scanner;

public class ZhiShu {
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	System.out.println("请输入一个数字：");
    	int num=sc.nextInt();
      
    	while(!(isZhuShi(num))) {
			System.out.println("不是素数，请重新输入：");
			num=sc.nextInt();
		}
    	System.out.println("是素数");
    	sc.close();
    }
    
    private static boolean isZhuShi(int num) {
        boolean flag=true;
    	
    	for(int i=2;i<num;i++){
    		if(num % i == 0){
    			flag=false;
    			break;
    		}
    	}
    	return flag;
    }
}
	
