package com.se;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class StringSort {
	String[] strs = initStringArray();

	private String[] initStringArray() {
		ArrayList sr = new ArrayList();
		java.lang.String str = null;
		do {
			System.out.println("�����ַ�����");
			Scanner scan = new Scanner(System.in);
			str = scan.nextLine();
			sr.add(str);
		} while (str != "#");
		return (String[]) sr.toArray();
	}
}
