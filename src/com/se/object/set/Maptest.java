package com.se.object.set;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;

public class Maptest {
public static void main(String[] args) {
	Map<String,Integer>  map = new HashMap<String, Integer>();
	map.put("С��", 12);
	map.put("С��1", 13);
	map.put("С��2", 14);
	map.put("С��3", 15);
	map.put("С��4", 16);
	map.remove("С��");
	Map<String, Integer> map1 = new HashMap<String, Integer>();
	map1.putAll(map);
	System.out.println(map1.containsKey("С��1"));
	System.out.println(map.containsKey("С��"));
	System.out.println(map.size());
	System.out.println(map.containsValue(13));
	System.out.println(map.hashCode());
	Set<String> keyset=map.keySet();
System.out.println("��ǿforѭ��:");
for(String key: keyset) {
	Integer values=map.get(key);
	System.out.println(key+":"+values);
}

//ר�еı���
System.out.println("ͨ��set����������'");
Set<Entry<String, Integer>> set=	map.entrySet();
for(Entry<String, Integer>  s:set) {
	System.out.println(s.getKey()+":"+s.getValue());
}

}
}
