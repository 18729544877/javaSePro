package com.se.object;

import java.math.BigDecimal;
import java.math.BigInteger;

public class NoRepeatNumberWay {
	public static void main(String[] args) {
		
		String[] str = noRepeatNumberTen(10);
		outPut(str);
	}

	private static String[] noRepeatNumberTen(int i) {
		String[] ss = new String[10];
		for (int j = 0; j < i; j++) {
			ss[j] = (Math.random()*90+ 100) + "";
		}
		return ss;
	}

	private static void outPut(String[] str) {
		for (String string : str) {
			System.out.println(string);
		}
	}
}
