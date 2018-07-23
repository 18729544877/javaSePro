package com.se.Interface;

public class LingXing {
	public static void main(String[] args){
		int n=0;//”““∆∂‡…Ÿ
		
		for(int i = 0; i < 8; i++){
			for(int j = 0; j < 8-i-1+n; j++){
				System.out.print(" ");
			}
			for(int j = 0; j < 2 * i + 1; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = 6; i >= 0; i--){
			for(int j = 0; j < 8-i-1+n; j++){
				System.out.print("xo");
			}
			for(int j = 0; j < 2 * i + 1; j++){
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
}
