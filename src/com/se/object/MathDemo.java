package com.se.object;

public class MathDemo {

	public static void main(String[] maargs){
		int[] array = {3,2,1,3,5,6};
		MathUtils util = new MathUtils();
		int[] result = util.sortNumberDesc(array);
		System.out.println("�������еĽ���ǣ�����");
		outputArray(result);
	}

	private static void outputArray(int[] result) {
		for(int r : result){
			System.out.println(r);
		}
		
	}
}
