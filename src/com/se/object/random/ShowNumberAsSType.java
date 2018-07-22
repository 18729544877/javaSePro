package com.se.object.random;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import javax.rmi.ssl.SslRMIClientSocketFactory;

public class ShowNumberAsSType {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("firstNBumnber:");
		int firstNum = scan.nextInt();

		System.out.println("输入第二个数字》》》");
		int num2 = scan.nextInt();

		showNumberAsSType(firstNum, num2);
	}

	public static void showNumberAsSType(int firstNum, int num2) {
		// TODO Auto-generated method stub
		int index = 1;
		List<Integer> list = new ArrayList();
		for (int i = 1; i <= num2; i++) {
			list.add(i);
		}
		//list show String
		System.out.println(list.toString());
		for(int i=0; i<list.size(); i++){
			boolean fl = false;
			int zong = 0;
			if((i+1) % firstNum  ==0){
				fl = true;
				zong+=list.get(i);
				System.out.println(list.get(i)+""+fl);
			}else{
				fl= false;
				System.out.print(list.get(i)+"  ");
			}
		}
	}
}
