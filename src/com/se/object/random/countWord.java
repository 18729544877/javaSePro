package com.se.object.random;

public class countWord {
public static void main(String[] args) {
	String s="dsdsdfddsvdvagagadfgavavafasgfdsgfd";
	char[] ch = s.toCharArray();
	for(int i=0;i<ch.length;i++) {
		int count=0;
		for(int j=i+1;j<ch.length;j++) {
			if(ch[i]==ch[j]){
				count++;
			}
		}
		if(count!=0) {
			System.out.println(ch[i]+":"+count);
		}
	}
}
}
