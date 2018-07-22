package com.se.object.random;

public class WordNum {
public static void main(String[] args) {
	String s="sdadhherajfjf'dsfdfsgbmikjoijfjdsfhaeuhfkfbdbfbfjdbvablfuiaaeufhfdjvbzm,vbjabjbfafapjf'pagamg'm'aadgjvmdj'akjgnnfgaoina";
int[]  a = new int[127];

for(int i=0; i<s.length();i++) {
	a[s.charAt(i)]++;
}
for(int j=0;j<=126;j++) {
	if(a[j]!=0) {	
		System.out.println("×Ö·û"+(char)j+"¹²"+a[j]+"¸ö");
	}
}
}
}
