package com.se.object.array;

public class ArrayJiuJiu {
     public static void main(String[] args){
    	 int num=9;
    
    	 for(int i=1; i <= num; i++){
    		 for(int j=1; j <=i; j++){
    			 System.out.print(j+"*"+i+"\t");
    		 }
    		 System.out.println();
    	 }
    	 
    	 for(int i=num; i > 0; i--){
    		 for(int j=1; j <=i; j++){
    			 System.out.print(j+"*"+i+"\t");
    		 }
    		 System.out.println();
    	 }
     }
}
