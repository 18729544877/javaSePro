package com.se.exam;

public class StringTest {
	public static void main(String[] args) {
		String s = "fsfDSsdgfSDFDDSFgeFwa";
		String s1 = firstUpper(s);
		System.out.println("Ê××ÖÄ¸´óÐ´:" + s1);

	}

	private static String firstUpper(String s) {
		String first = String.valueOf(s.charAt(0)).toUpperCase();
		String s2 = s.toLowerCase();
		String re = first + s2.substring(1, s2.length());
		return re;
	}
}
