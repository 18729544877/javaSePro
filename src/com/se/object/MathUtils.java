package com.se.object;

public class MathUtils {

	public int[] sortNumberAsc(int[] array){
		for(int i=0; i<array.length; i++){
			for(int j=0; j<array.length - i -1; j++){
				if(array[j+1] < array[j]){
					int temp;
					temp = array[j+1];
					array[j+1] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
		
	}
	
	//desc
	public int[] sortNumberDesc(int[] array){
		for(int i=0; i<array.length; i++){
			for(int j=0; j<array.length - i -1; j++){
				if(array[j+1] > array[j]){
					int temp;
					temp = array[j+1];
					array[j+1] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
		
	}
}
