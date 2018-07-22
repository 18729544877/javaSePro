package com.se.object;

public class StringToInt {

	public static void main(String[] args) {
		
		byte[] a = new byte[]{50,0,44,0,49,0,52,0,44,0,54,0,48,0,52,0};
		String s = new String(a).replaceAll("\r","").replaceAll("\n","").replaceAll(" ", "").replaceAll("\\s*", "").replaceAll(" +","").trim();
		String[] areaRange = s.split(",");
		
		for (String string : areaRange) {
			System.out.println(">>>"+string);
		}
		String st = areaRange[1].replaceAll("\r","").replaceAll("\n","").replaceAll(" ", "").replaceAll("\\s*", "").replaceAll(" +","").trim() ;
		char[] chs = st.toCharArray();
		String str = "";
		for (char c : chs) {
			if(c!=' '){
				str+=c;
			}
		}
		System.out.println(str.replace(" ", "s"));
		
	String high ="asdf";
	high = high.replace("s", "S");
	System.out.println(high);
	}
}
