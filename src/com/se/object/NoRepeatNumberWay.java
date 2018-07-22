package com.se.object;

import java.math.BigDecimal;
import java.math.BigInteger;

public class NoRepeatNumberWay {
	public static void main(String[] args) {
		
		String[] str = noRepeatNumberTen(10);
		outPut(str);
	}

	private static String[] noRepeatNumberTen(int i) {
		for (int j = 0; j < i; j++) {
			
			//BigDecimal d = (BigInteger)Math.random()*9000000000+1000000000;
		}
		return null;
	}

	private static void outPut(String[] str) {
		for (String string : str) {
			System.out.println(string);
		}
	}
}
