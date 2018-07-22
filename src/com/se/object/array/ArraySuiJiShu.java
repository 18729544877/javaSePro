package com.se.object.array;

public class ArraySuiJiShu {
	public static void main(String[] args){
		int[] a=new int[100];
		int count=0;
		
		for(int i=0;i<100;i++){
			a[i]=(int)(Math.random()*100);
			
			count++;
			System.out.print(a[i]+"\t");
			if(count%8==0){
		
			System.out.println();	}
		}
		System.out.println();
		System.out.println("·ûºÏµÄ¹²"+count);
	}

}
