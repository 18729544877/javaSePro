package com.se.Interface;

import java.util.Scanner;

public class ZhiShu {
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	System.out.println("������һ�����֣�");
    	int num=sc.nextInt();
      
    	while(!(isZhuShi(num))) {
			System.out.println("�������������������룺");
			num=sc.nextInt();
		}
    	System.out.println("������");
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
	
