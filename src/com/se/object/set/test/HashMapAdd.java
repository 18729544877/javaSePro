package com.se.object.set.test;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapAdd {
public static void main(String[] args) {
	HashMap<String,HashMap<String,Integer>>  hm = new HashMap<String,HashMap<String,Integer>>();
	HashMap<String,Integer>  h1=new HashMap<String, Integer>();
	h1.put("����",33);
	h1.put("����", 45);
	hm.put("һ��",h1);
	hm.put("����", h1);
	
	for(String  k: hm.keySet()) {
		HashMap<String, Integer>  values=	hm.get(k);
		for(String vk :values.keySet()) {
		Integer vv =	values.get(vk);
		System.out.println(k+":"+vk+":"+vv);
		}
	}	
}
}
