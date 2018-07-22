package com.se.object.set.test;

import java.util.HashMap;
import java.util.Set;

public class CountChar {
	public static void main(String[] args) {
		String s = "eftfaewsdfgdgryhrthythdfggsgaaewrtertereryes";
		HashMap<Character, Integer> arrayCount = new HashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			char c =s.charAt(i);
			Set<Character> set = arrayCount.keySet();
				if (set.contains(c)) {
					arrayCount.put(c, arrayCount.get(c) + 1);
				} else {
					arrayCount.put(c, 1);
				}
			}
		System.out.println(arrayCount);
		}
	}

