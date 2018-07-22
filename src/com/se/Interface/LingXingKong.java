package com.se.Interface;

public class LingXingKong {
	public static void main(String[] args){
		int r=2;//空白右移的位数
		int  h =11;//菱形的高度
		
		for(int i=-h/2;i<=h/2;i++){
			int k=i<0?i*-1:i;
			for(int j=0;j<k+r;j++){
				System.out.print(" ");
			}
			for(int j=0;j<h-2*k;j++){
				if(j==0||j==(h-1)-2*k){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		System.out.println("----------------------");
		
		for(int i=-h/2;i<=h/2;i++){
			int k=i<0?i*-1:i;
			for(int j=0;j<k+r;j++){
				System.out.print("  ");
			}
			for(int j=0;j<h-2*k;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
