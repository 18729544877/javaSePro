package com.se.object.set.test;

public class CharCount {
public static void main(String[] args) {
	String s = "werewrwtwetafgafdfg4ry5utyjhgjsehargafgdv";
	char[] ch = s.toCharArray();
	for(int i=0; i < s.length(); i++) {
		int count=0;
		for(int j=i+1; j<s.length(); j++) {
			if(ch[i]==ch[j]) {
				count++;
			}else {
				continue;
			}
		}
		if(count!=0) {
			System.out.println(ch[i]+"¹²ÓÐ"+count+"¸ö");
		}
	}
}
}
