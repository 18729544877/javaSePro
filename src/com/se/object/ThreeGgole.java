package com.se.object;

public class ThreeGgole {
public static void main(String[] args) {
	
	int n=10;
	for(int i=0; i <n; i++){
		for(int j = 0; j < n-i-1; j++){			
			System.out.print("0");
		}
		for(int j=0; j<2*n +1;j++){
			System.out.print("*");
		}
		System.out.println();
	}
}
}
