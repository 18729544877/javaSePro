package com.se.exam;

public class CharCount {
	public static void main(String[] args) {
		String s = "woaijavawozhenaijavawozhendeaijavawozhendehenaijavaxinbuxinwoaijavagun";
		int[] a = new int[126];
		for (int i = 0; i < s.length(); i++) {
			a[s.charAt(i)]++;
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] != 0) {
				System.out.println("×Ö·û£º" + (char) i + "³öÏÖ" + a[i] + "´Î");
			}
		}
	}
}
