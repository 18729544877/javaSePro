package com.se.object;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class StringSort {
	public static void main(String[] args) {

		String[] strs = initStringArray();
		System.out.println(strs.toString());
	}

	private static String[] initStringArray() {
		ArrayList sr = new ArrayList();
		java.lang.String str = null;
		do {
			System.out.println("ÊäÈë×Ö·û´®£º");
			Scanner scan = new Scanner(System.in);
			str = scan.nextLine();
			sr.add(str);
		} while (str != "#");
		return (String[]) sr.toArray();
	}
}
