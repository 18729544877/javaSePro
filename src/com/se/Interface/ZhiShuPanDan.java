package com.se.Interface;


public class ZhiShuPanDan {
    public static void main(String[] args){
    	int count=0;
    	int n=10003;
    	
    	for(int i = 2; i < n; i++){
    		if(isZhiShu(i)){
    			System.out.println(i);
    			count++;
    		}
    	}
    	System.out.println("质数总共有"+count);
    }
    private static boolean isZhiShu(int num) {
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
