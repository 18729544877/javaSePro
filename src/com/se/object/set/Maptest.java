package com.se.object.set;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;

public class Maptest {
public static void main(String[] args) {
	Map<String,Integer>  map = new HashMap<String, Integer>();
	map.put("小明", 12);
	map.put("小明1", 13);
	map.put("小明2", 14);
	map.put("小明3", 15);
	map.put("小明4", 16);
	map.remove("小明");
	Map<String, Integer> map1 = new HashMap<String, Integer>();
	map1.putAll(map);
	System.out.println(map1.containsKey("小明1"));
	System.out.println(map.containsKey("小明"));
	System.out.println(map.size());
	System.out.println(map.containsValue(13));
	System.out.println(map.hashCode());
	Set<String> keyset=map.keySet();
System.out.println("增强for循环:");
for(String key: keyset) {
	Integer values=map.get(key);
	System.out.println(key+":"+values);
}

//专有的遍历
System.out.println("通过set集合来遍历'");
Set<Entry<String, Integer>> set=	map.entrySet();
for(Entry<String, Integer>  s:set) {
	System.out.println(s.getKey()+":"+s.getValue());
}

}
}
